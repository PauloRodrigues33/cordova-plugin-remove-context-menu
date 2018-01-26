function Cordovacontextbuttons(){
    var RemoveAllButtons = function(){
        cordova.exec(function(success){

        }, function(fail){
            
        }, "cordovacontextbuttons", "removebuttons");
    }
}

module.exports = new Cordovacontextbuttons();