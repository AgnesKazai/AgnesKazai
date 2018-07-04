package com.greenfox.aze.reddit.redditapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue
    Long id;

    private String title;
    private String url;
    private LocalDateTime timestamp;
    private int score;
    private int vote;
    private String owner;


    public Post() {
        this.timestamp = LocalDateTime.now();
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.timestamp = LocalDateTime.now();
        this.score = score;
        this.vote = vote;
        this.owner = getOwner();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}


