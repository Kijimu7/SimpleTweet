package com.codepath.apps.restclienttemplate.models;

import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

//Adding library
@Parcel
public class Tweet {

    public String body;
    public static String createdAt;
    public User user;
    public String timeStamp;

    // empty constructor needed by the Parceler library
    public Tweet() {}




    public static Tweet fromJson(JSONObject jsonObject) throws JSONException {
        Tweet tweet = new Tweet();
        tweet.body = jsonObject.getString("text");
        tweet.createdAt = jsonObject.getString("created_at");
        tweet.user = User.fromJson(jsonObject.getJSONObject("user"));

        tweet.timeStamp = TimeFormatter.getTimeStamp("created_at");


        return tweet;
    }

    public static List<Tweet> fromJsonArray(JSONArray jsonArray) throws JSONException{
        List<Tweet> tweets = new ArrayList<>();
        for(int i =0; i < jsonArray.length(); i++){
            tweets.add(fromJson(jsonArray.getJSONObject(i)));
        }
        return tweets;

    }
    public static String getFormattedTimestamp(){
        return TimeFormatter.getTimeDifference(createdAt);
    }


    }


