var exec = require('cordova/exec')

class Mixnet {
    doIt() {
        return new Promise(function (resolve, reject) {
            exec(resolve, reject, "Mixnet", "doIt", []);
        });
    }
}

module.exports = new Mixnet();

