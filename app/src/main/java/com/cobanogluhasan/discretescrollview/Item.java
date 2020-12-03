package com.cobanogluhasan.discretescrollview;

public class Item {



    private final String word;
    private final String synonym;
    private final int image;

    public Item(String word, String synonym, int image) {
        this.word = word;
        this.synonym = synonym;
        this.image = image;
    }



    public String getWord() {
        return word;
    }

    public String getSynonym() {
        return synonym;
    }

    public int getImage() {
        return image;
    }




}
