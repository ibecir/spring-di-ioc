package ba.edu.ibu.blogapi.model;

import java.time.LocalDateTime;

public class Article {
    private int id;
    private String title;
    private String slug;
    private String content;
    private LocalDateTime publishedOn;

    public Article() {
    }

    public Article(int id, String title, String slug, String content, LocalDateTime publishedOn) {
        this.id = id;
        this.title = title;
        this.slug = slug;
        this.content = content;
        this.publishedOn = publishedOn;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(LocalDateTime publishedOn) {
        this.publishedOn = publishedOn;
    }
}
