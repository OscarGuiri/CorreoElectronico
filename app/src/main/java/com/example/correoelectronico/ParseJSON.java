package com.example.correoelectronico;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.io.InputStream;

public class ParseJSON {
    private MyAccount myAccount;
    private InputStream streamJSON;

    public ParseJSON(Context c) {
        /** Obtenemos una referencia al archivo /res/raw/contact.json */
        this.streamJSON = c.getResources().openRawResource(R.raw.emails);
    }

    public boolean parseMyAccount(){
        boolean parsed = false;
        String json;
        myAccount = null;

        try {
            int size = streamJSON.available();
            byte[] buffer = new byte[size];
            streamJSON.read(buffer);
            json = new String(buffer, "UTF-8");
            JSONTokener tokener = new JSONTokener(json);
            JSONArray jsonArray = new JSONArray(tokener);

            // parsing my account
            JSONObject jsonObject = jsonArray.getJSONObject(0).getJSONObject("myAccount");
            int id = jsonObject.getInt("id");
            String name = jsonObject.getString("name");
            String  firstSurname = jsonObject.getString("firstSurname");
            String email = jsonObject.getString("email");
            myAccount = new MyAccount(id,name,firstSurname,email);


            parsed = true;

        } catch (IOException | JSONException e) {

            Log.e("ParseMyAccount", "Unknown Exception: "+e.getLocalizedMessage());
        }


        return parsed;
    }
    // getter for myAccount
    public MyAccount getMyAccount(){
        return  this.myAccount;
    }
}
