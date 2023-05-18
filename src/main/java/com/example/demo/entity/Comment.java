package com.example.demo.entity;

public class Comment {
    private Integer id;
    private String content;
    private String author;
    private Integer a_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getaId() {
        return a_id;
    }

    public void setaId(Integer a_id) {
        this.a_id = a_id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", a_id=" + a_id +
                '}';
    }
}
