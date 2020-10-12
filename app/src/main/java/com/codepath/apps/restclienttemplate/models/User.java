package com.codepath.apps.restclienttemplate.models;

import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class User {

    public String name;
    public String screenName;
    public String profileImageUrl;
    public String timeStamp;
    public String createdAt;

    // empty constructor needed by the Parceler library
    public User() {}

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.screenName = jsonObject.getString("screen_name");
        user.profileImageUrl = jsonObject.getString("profile_image_url_https");
        user.createdAt = jsonObject.getString("created_at");
        return user;

    }

    public void getFormattedTimestamp(String timeStamp) {
    }
}
