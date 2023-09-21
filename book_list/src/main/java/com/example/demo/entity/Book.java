package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;
        @Column(name = "title")
        private String title;
        @Column(name = "summary")
        private String summary;

        @Column(name = "cover_image")
        private String coverImage;
        @Column(name = "genres")
        private String genres;
         @Column(name = "author")
        private String author;
        @Column(name = "tags")
        private String tags;

        public Book(){

        }

    public Book(int id, String title, String summary, String coverImage, String genres, String author, String tags) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.coverImage = coverImage;
        this.genres = genres;
        this.author = author;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}


