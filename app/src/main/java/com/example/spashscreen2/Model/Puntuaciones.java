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
}
