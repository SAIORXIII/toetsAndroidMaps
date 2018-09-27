package com.example.bleac.toets1;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class Chat {
    public int heroID;
    public String hero;
    public String heroIMG;
    public String message;

    public Chat(JSONObject jsonObject)
    {
        if (jsonObject != null)
        {
            try
            {
                heroID = jsonObject.getInt("id");
                hero = jsonObject.getString("naam");
                message = jsonObject.getString("status");
            }
            catch (JSONException e)
            {
                Log.w("ERRROR", e);
            }
        }
    }
}
