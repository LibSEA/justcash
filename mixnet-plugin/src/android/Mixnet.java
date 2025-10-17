/*
justcash - an application to make anonymous micropayments
Copyright (C) 2025  Liberatory Sofware Engineering Association

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

package org.libsea.mixnet;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Mixnet extends CordovaPlugin {
        public Mixnet() {
        }

        public void initialize(CordovaInterface cordova, CordovaWebView webView) {
                super.initialize(cordova, webView);
        }

        public boolean execute(String action, JSONArray args,
                        CallbackContext callbackContext) throws JSONException {
                callbackContext.success("42");
                return true;
        }
}
