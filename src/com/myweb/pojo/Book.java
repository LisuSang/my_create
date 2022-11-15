package com.myweb.pojo;

public class Book {
    private Integer id;
    private String name;
    private String author;
    private String imgPath ="背景图片/default.png";


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        if(imgPath != null && !"".equals(imgPath))
        {
            this.imgPath = imgPath;
        }

    }

    public Book(Integer id, String name, String author, String imgPath) {
        this.id = id;
        this.name = name;
        this.author = author;
        if(imgPath != null && !"".equals(imgPath))
        {
            this.imgPath = imgPath;
        }
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", img_path='" + imgPath + '\'' +
                '}';
    }
}
