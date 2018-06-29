module.exports = (function(){

    var mode = function(args, successCallback, errorCallback){
        cordova.exec(successCallback, errorCallback, "modeAirplane", "funcionJava", [args]);
};

    return {
        functionMode:mode
    };


})();