package com.prodrigues.cordovacontextbuttons;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import com.medgrupo.medsoft.pro.R;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

public class Cordovacontextbuttons extends CordovaPlugin {

  Activity activity;
  Menu _customMenu;
  ContextMenu _contextMenu;
  CordovaWebView view;

  boolean isDisableShareButton = false;
  boolean isDisableSearchButton = false;

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
      super.initialize(cordova, webView);
      this.activity = cordova.getActivity();
      this.view = webView;
  }

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    try {
      if ("disableShareButton".equals(action)) {
        boolean status = setShareButtonVisible(Boolean.parseBoolean(args.getString(0)));
        if (status) {
          callbackContext.success("Share button disabled");
        } else {
          callbackContext.error("Share button enabled - OR ERROR");
        }
        callbackContext.success();
        return true;
      }
      if ("disableSearchButton".equals(action)) {
        callbackContext.success();
        return true;
      }
      return false;  // Returning false results in a "MethodNotFound" error.
    }
    catch (Exception e){
      callbackContext.error(e.getMessage());
      return false;
    }
  }

  private boolean setShareButtonVisible(boolean visible){
    this.isDisableShareButton = visible;
    return visible;
  }

  @Override
  public Object onMessage(String id, Object data) {
    if("onPrepareOptionsMenu".equals(id)){
      this._customMenu = rebuildMenu((Menu) data);
    }
    return super.onMessage(id, this._customMenu);
  }

  private Menu rebuildMenu(Menu menu){
    if(this.isDisableShareButton){
      MenuItem share = menu.findItem(R.id.share_clipboard_button);
      if(share != null){
        share.setVisible(false);
      }
      MenuItem share2 = menu.findItem(R.id.share_app_button);
      if(share2 != null){
        share2.setVisible(false);
      }
      MenuItem share3 = menu.findItem(R.id.share_bookmark_button);
      if(share3 != null){
        share3.setVisible(false);
      }
    }
    return menu;
  }
}
