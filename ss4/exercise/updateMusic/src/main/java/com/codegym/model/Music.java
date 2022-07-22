package com.codegym.model;

public class Music {
    private String nameMusic;
    private String artist;
    private String kindOfMusic;
    private String link;

    public Music() {
    }

    public Music(String nameMusic, String artist, String kindOfMusic, String link) {
        this.nameMusic = nameMusic;
        this.artist = artist;
        this.kindOfMusic = kindOfMusic;
        this.link = link;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Music{" +
                "nameMusic='" + nameMusic + '\'' +
                ", artist='" + artist + '\'' +
                ", kindOfMusic='" + kindOfMusic + '\'' +
                ", link='" + link + '\'' +
                '}';
    }


}
