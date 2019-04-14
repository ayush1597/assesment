package com.ttn.core.servlets;


public class Blogs {

    private String creation_date;
    private String blog_name;

    public Blogs() { }

    public Blogs(String creation_date, String blog_name) {
        this.creation_date=creation_date;
        this.blog_name=blog_name;

    }

    public String getCreationDate() {
        return creation_date;
    }

    @Override
    public String toString() {
        return "Blogs{" +
                "creation_date='" + creation_date + '\'' +
                ", blog_name='" + blog_name + '\'' +
                '}';
    }
}