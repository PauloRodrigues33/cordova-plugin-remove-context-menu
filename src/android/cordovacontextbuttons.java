// package src.android.cordovacontextbuttons;

// public class cordovacontextbuttons extends CordovaPlugin{

// @Override
// public void initialize(CordovaInterface cordova, CordovaWebView webView) {
//     super.initialize(cordova, webView);
//     // your init code here
// }

// @Override
// public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
//     if ("beep".equals(action)) {
//         this.beep(args.getLong(0));
//         callbackContext.success();
//         return true;
//     }
//     return false;  // Returning false results in a "MethodNotFound" error.
// }

// @Override
// public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
//     if ("beep".equals(action)) {
//         final long duration = args.getLong(0);
//         cordova.getActivity().runOnUiThread(new Runnable() {
//             public void run() {
//                 ...
//                 callbackContext.success(); // Thread-safe.
//             }
//         });
//         return true;
//     }
//     return false;
// }
// } 