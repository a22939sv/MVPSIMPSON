package com.sanvalero.mvpsimpson01.entities;

import com.google.gson.annotations.SerializedName;

public class Simpson {
    @SerializedName("quote")
    private String quote;

    @SerializedName("character")
    private String character;

    @SerializedName("image")
    private String image;

    @SerializedName("characterDirection")
    private String characterDirection;

    // GET
    public String getQuote() {
        return quote;
    }

    public String getCharacter() {
        return character;
    }

    public String getImage() {
        return image;
    }

    public String getCharacterDirection() {
        return characterDirection;
    }

    // SET
    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCharacterDirection(String characterDirection) {
        this.characterDirection = characterDirection;
    }

    @Override
    public String toString() {
        return "Simpson {\n" +
                "quote='" + quote + '\'' +
                ",\ncharacter='" + character + '\'' +
                ",\nimage='" + image + '\'' +
                ",\ncharacterDirection='" + characterDirection + '\'' +
                "\n}";
    }
}
