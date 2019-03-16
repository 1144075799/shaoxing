package com.shaoxing.api.domain;

public class Celebrity {
    private int id;                                     //id号

    private String name;                                //名字

    private String img;                                 //图片地址

    private String intro;                               //简介

    private String issues;                             //平生介绍

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }



}
