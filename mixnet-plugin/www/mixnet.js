var exec = require('cordova/exec')

module.exports = { 
    doIt: function(callback) {
        exec(callback, function(err) {
            callback('error');
        }, "Mixnet", "doIt", []);
    }
};

