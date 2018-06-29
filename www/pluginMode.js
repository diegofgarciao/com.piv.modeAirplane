module.exports = (function(){

    var mode = function(){
        cordova.exec("modeAirplane", "isAirplaneModeOn");
    };

    return {
        functionMode:mode
    };


})();