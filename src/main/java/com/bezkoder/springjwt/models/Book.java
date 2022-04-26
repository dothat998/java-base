package com.bezkoder.springjwt.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class Book {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String isbn;
    private String author;
    private String title;
    private String synopsis;
    private String language;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
