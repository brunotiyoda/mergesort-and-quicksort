package br.com.sorts;

public class Item {

    private Integer position;
    private String description;
    private Double price;

    public Item(Integer position, String description, Double price) {
        this.position = position;
        this.description = description;
        this.price = price;
    }

    public Integer getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }
}
