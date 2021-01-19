package com.example.spashscreen2.AdaptersRecyclers;

public class Puntuaciones {

    private int profileIMG;
    private String username;
    private int score;
    private String profileImageURL;

    /*public ElementosPuntuaciones(int profileIMG, String username, int score) {
        this.profileIMG = profileIMG;
        this.username = username;
        this.score = score;
    }*/

    public String getProfileImageURL() {
        return profileImageURL;
    }

    public void setProfileImageURL(String profileImageURL) {
        this.profileImageURL = profileImageURL;
    }

    public int getProfileIMG() {
        return profileIMG;
    }

    public void setProfileIMG(int profileIMG) {
        this.profileIMG = profileIMG;
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
    }
}
