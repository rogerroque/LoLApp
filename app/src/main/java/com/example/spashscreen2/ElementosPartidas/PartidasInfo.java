package com.example.spashscreen2.ElementosPartidas;

import android.view.View;

public class PartidasInfo {

    private View winLose;
    private String timeAgo, gameType, kda, imgURL;
    private int imageView;
    private String rune1, rune2, spell1, spell2, item1, item2, item3, item4, item5, item6, item7;

    /*public PartidasInfo(String timeAgo, String gameType, String kda, int imageView) {
        this.timeAgo = timeAgo;
        this.gameType = gameType;
        this.kda = kda;
        this.imageView = imageView;
    }*/

    public String getRune1() {
        return rune1;
    }

    public void setRune1(String rune1) {
        this.rune1 = rune1;
    }

    public String getRune2() {
        return rune2;
    }

    public void setRune2(String rune2) {
        this.rune2 = rune2;
    }

    public String getSpell1() {
        return spell1;
    }

    public void setSpell1(String spell1) {
        this.spell1 = spell1;
    }

    public String getSpell2() {
        return spell2;
    }

    public void setSpell2(String spell2) {
        this.spell2 = spell2;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4;
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        this.item5 = item5;
    }

    public String getItem6() {
        return item6;
    }

    public void setItem6(String item6) {
        this.item6 = item6;
    }

    public String getItem7() {
        return item7;
    }

    public void setItem7(String item7) {
        this.item7 = item7;
    }

    public View getWinLose() {
        return winLose;
    }

    public void setWinLose(View winLose) {
        this.winLose = winLose;
    }

    public String getTimeAgo() {
        return timeAgo;
    }

    public String getGameType() {
        return gameType;
    }

    public void setTimeAgo(String timeAgo) {
        this.timeAgo = timeAgo;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public void setKda(String kda) {
        this.kda = kda;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getKda() {
        return kda;
    }

    public int getImageView() {
        return imageView;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

}