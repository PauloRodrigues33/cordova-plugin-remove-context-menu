var cordovacontextbuttons = {
    removeAllButtons : function () {
        cordova.exec(function (success) {

        }, function (fail) {

        }, "Cordovacontextbuttons", "removebuttons");
    },
    setShareButtonVisible : function (visible) {
        cordova.exec(function (success) {
            console.log("Share button toggled");
        }, function (fail) {
            console.log("Share button FAIL");
            console.log(fail);            
        }, "Cordovacontextbuttons", "disableShareButton", [visible]);
    }
}

module.exports = cordovacontextbuttons;