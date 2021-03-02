package com.example.spashscreen2.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Puntuaciones {

    @PrimaryKey(autoGenerate = true)
    public int key;

    public String username;
    public String score;
    public String profileImageURL;

    public Puntuaciones(String username, String score, String profileImageURL) {
        this.username = username;
        this.score = score;
        this.profileImageURL = profileImageURL;
    }

    /*public String getProfileImageURL() {
        return profileImageURL;
    }

    public void setProfileImageURL(String profileImageURL) {
        this.profileImageURL = profileImageURL;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }*/
}
