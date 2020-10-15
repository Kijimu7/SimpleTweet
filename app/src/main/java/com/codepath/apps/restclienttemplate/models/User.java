package com.codepath.apps.restclienttemplate.models;

import android.widget.TextView;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
@Entity
public class User {

    @ColumnInfo
    @PrimaryKey
    public long id;

    @ColumnInfo
    public String name;
    public String screenName;

    @ColumnInfo
    public String profileImageUrl;
    public String timeStamp;
    public String createdAt;

    // empty constructor needed by the Parceler library
    public User() {}

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.id = jsonObject.getLong("id");
        user.name = jsonObject.getString("name");
        user.screenName = jsonObject.getString("screen_name");
        user.profileImageUrl = jsonObject.getString("profile_image_url_https");
        user.createdAt = jsonObject.getString("created_at");
        return user;

    }

    public void getFormattedTimestamp(String timeStamp) {
    }
}
