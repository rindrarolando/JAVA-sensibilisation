package com.miniprojet.rechauffementclimatique.entities;


public class Information {

    private Integer id;


    private String title;


    private String description;

    private String url;

    private String rewriting;

    public Information() {
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

    public Information(Integer id, String title, String description, String url, String rewriting) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.rewriting = rewriting;
    }

    public Information(String title, String description, String url, String rewriting) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.rewriting = rewriting;
    }
}