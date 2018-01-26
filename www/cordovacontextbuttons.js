var cordovacontextbuttons = {
    removeAllButtons = function () {
        cordova.exec(function (success) {

        }, function (fail) {

        }, "cordovacontextbuttons", "removebuttons");
    },
    setShareButtonVisible = function (visible) {
        cordova.exec(function (success) {
            console.log("Share button disabled");
        }, function (fail) {
            console.log("Share button enabled");
        }, "cordovacontextbuttons", "disableShareButton", [visible]);
    }
}

module.exports = cordovacontextbuttons;