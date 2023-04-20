package com.miniprojet.rechauffementclimatique.entities;

import java.time.LocalDate;

public class Comment {
    private Integer id;

    private String description;

    private LocalDate postedOn;

    private Boolean canBePosted;

    public Boolean getCanBePosted() {
        return canBePosted;
    }

    public void setCanBePosted(Boolean canBePosted) {
        this.canBePosted = canBePosted;
    }

    public LocalDate getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(LocalDate postedOn) {
        this.postedOn = postedOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Comment(Integer id, String description, LocalDate postedOn, Boolean canBePosted) {
        this.id = id;
        this.description = description;
        this.postedOn = postedOn;
        this.canBePosted = canBePosted;
    }

    public Comment(){

    }

    public Comment(String description, LocalDate postedOn, Boolean canBePosted) {
        this.description = description;
        this.postedOn = postedOn;
        this.canBePosted = canBePosted;
    }
}