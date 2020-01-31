package com.sigma.pocsigma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    public Image() {

    }

    public Image(String name) {
        this.name = name;
    }

    public Image(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
