package com.piv.modeAirplane;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;
import android.*;

public class pluginModeair extends CordovaPlugin {

/**
* Gets the state of Airplane Mode.
* @param context
* @return true if enabled.
*/

private static boolean isAirplaneModeOn(Context context) {

   return Settings.System.getInt(context.getContentResolver(),
           Settings.System.AIRPLANE_MODE_ON, 0) != 0;

}

}