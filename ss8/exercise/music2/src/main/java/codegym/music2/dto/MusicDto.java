package codegym.music2.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MusicDto {
    private int id;
    @NotBlank(message = "Name music is not empty!")
    @Size(min = 5, max = 45)
    private String nameMusic;
    @NotBlank(message = "Name author is not empty!")
    @Size(min = 5, max = 45)
    private String author;
    @NotBlank(message = "typeOfMusic is not empty!")
    private String typeOfMusic;
    private String link;

    public MusicDto() {
    }

    public MusicDto(int id, String nameMusic, String author, String typeOfMusic, String link) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.author = author;
        this.typeOfMusic = typeOfMusic;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTypeOfMusic() {
        return typeOfMusic;
    }

    public void setTypeOfMusic(String typeOfMusic) {
        this.typeOfMusic = typeOfMusic;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
