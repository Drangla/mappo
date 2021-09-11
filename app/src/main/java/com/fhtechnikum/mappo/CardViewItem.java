package com.fhtechnikum.mappo;

public class CardViewItem {
    private int imageResource;
    private String cardTextTitle;
    private String cardText1;

    public CardViewItem(int imageResource, String cardTextTitle, String cardText1) {
        this.imageResource = imageResource;
        this.cardTextTitle = cardTextTitle;
        this.cardText1 = cardTextTitle;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getCardTextTitle() {
        return cardTextTitle;
    }

    public void setCardTextTitle(String cardTextTitle) {
        this.cardTextTitle = cardTextTitle;
    }

    public String getCardText1() {
        return cardText1;
    }

    public void setCardText1(String cardText1) {
        this.cardText1 = cardText1;
    }
}
