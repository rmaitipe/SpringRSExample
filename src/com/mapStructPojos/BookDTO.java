package com.mapStructPojos;


import java.math.BigDecimal;

public class BookDTO {

    private Long id;
    private String name;
    private String author;
    private BigDecimal price;

    // avoid this "No default constructor for entity"
    public BookDTO() {
    }

    public BookDTO(Long id, String name, String author, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public BookDTO(String name, String author, BigDecimal price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

}
