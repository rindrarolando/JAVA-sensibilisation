package com.miniprojet.rechauffementclimatique.entities;

import java.time.LocalDate;

public class News {

    private Integer id;


    private String title;


    private String description;


    private LocalDate postedOn;

    private String url;

    private String rewriting;

    public News() {
    }
    public String getRewriting() {
        return rewriting;
    }

    public void setRewriting(String rewriting) {
        this.rewriting = rewriting;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public News(Integer id, String title, String description, LocalDate postedOn, String url, String rewriting) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.postedOn = postedOn;
        this.url = url;
        this.rewriting = rewriting;
    }

    public News(String title, String description, LocalDate postedOn, String url, String rewriting) {
        this.title = title;
        this.description = description;
        this.postedOn = postedOn;
        this.url = url;
        this.rewriting = rewriting;
    }
}