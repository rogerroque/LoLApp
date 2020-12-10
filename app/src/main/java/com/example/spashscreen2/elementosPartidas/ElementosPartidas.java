package com.example.spashscreen2.elementosPartidas;

import android.view.View;
import android.widget.ImageView;

public class ElementosPartidas {

    View winLose;
    ImageView playedChamp;
    ImageView rune1, rune2;
    ImageView spell1, spell2;
    ImageView item1, item2, item3, item4, item5, item6, item7;
    String kda, gameType, timeAgo;

    public ElementosPartidas(View winLose, ImageView playedChamp, ImageView rune1, ImageView rune2,
                             ImageView spell1, ImageView spell2, ImageView item1, ImageView item2,
                             ImageView item3, ImageView item4, ImageView item5, ImageView item6,
                             ImageView item7, String kda, String gameType, String timeAgo) {


        this.winLose = winLose;
        this.playedChamp = playedChamp;
        this.rune1 = rune1;
        this.rune2 = rune2;
        this.spell1 = spell1;
        this.spell2 = spell2;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item4;
        this.item6 = item4;
        this.item7 = item4;
        this.kda = kda;
        this.gameType = gameType;
        this.timeAgo = timeAgo;


    }

    public View getWinLose() {
        return winLose;
    }

    public void setWinLose(View winLose) {
        this.winLose = winLose;
    }

    public ImageView getPlayedChamp() {
        return playedChamp;
    }

    public void setPlayedChamp(ImageView playedChamp) {
        this.playedChamp = playedChamp;
    }

    public ImageView getRune1() {
        return rune1;
    }

    public void setRune1(ImageView rune1) {
        this.rune1 = rune1;
    }

    public ImageView getRune2() {
        return rune2;
    }

    public void setRune2(ImageView rune2) {
        this.rune2 = rune2;
    }

    public ImageView getSpell1() {
        return spell1;
    }

    public void setSpell1(ImageView spell1) {
        this.spell1 = spell1;
    }

    public ImageView getSpell2() {
        return spell2;
    }

    public void setSpell2(ImageView spell2) {
        this.spell2 = spell2;
    }

    public ImageView getItem1() {
        return item1;
    }

    public void setItem1(ImageView item1) {
        this.item1 = item1;
    }

    public ImageView getItem2() {
        return item2;
    }

    public void setItem2(ImageView item2) {
        this.item2 = item2;
    }

    public ImageView getItem3() {
        return item3;
    }

    public void setItem3(ImageView item3) {
        this.item3 = item3;
    }

    public ImageView getItem4() {
        return item4;
    }

    public void setItem4(ImageView item4) {
        this.item4 = item4;
    }

    public ImageView getItem5() {
        return item5;
    }

    public void setItem5(ImageView item5) {
        this.item5 = item5;
    }

    public ImageView getItem6() {
        return item6;
    }

    public void setItem6(ImageView item6) {
        this.item6 = item6;
    }

    public ImageView getItem7() {
        return item7;
    }

    public void setItem7(ImageView item7) {
        this.item7 = item7;
    }

    public String getKda() {
        return kda;
    }

    public void setKda(String kda) {
        this.kda = kda;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getTimeAgo() {
        return timeAgo;
    }

    public void setTimeAgo(String timeAgo) {
        this.timeAgo = timeAgo;
    }
}
