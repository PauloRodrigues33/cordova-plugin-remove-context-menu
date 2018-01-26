package com.prodrigues.cordovacontextbuttons;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

public class cordovacontextbuttons extends CordovaPlugin {

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
      super.initialize(cordova, webView);
      // your init code here
  }

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
      if ("beep".equals(action)) {
          callbackContext.success();
          return true;
      }
      return false;  // Returning false results in a "MethodNotFound" error.
  }

}
