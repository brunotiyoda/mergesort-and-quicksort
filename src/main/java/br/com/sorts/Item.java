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

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static Item[] buildItems() {
        return new Item[]{
                new Item(0, "Ferrari", 21000.00),
                new Item(1, "Apple", 669.00),
                new Item(2, "Computer", 2799.00),
                new Item(3, "BMW", 13000.0),
                new Item(4, "Mustang", 12000.0),
                new Item(5, "HB20", 10000.0)
        };
    }
}
