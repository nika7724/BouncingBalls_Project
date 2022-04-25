package com.example.bouncingballs_project.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Images {
    @Id
    private int no;
private String url;
private String description;

public Images() {

}

//getter


    public int getNo() {
        return no;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    //Setter

    public void setNo(int no) {
        this.no = no;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}