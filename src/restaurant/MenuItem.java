package restaurant;

import java.time.LocalDate;

public class MenuItem {
    private double price;
   // private String name;
    private String description;
    private String category;
   // private boolean isNew = true;
    private LocalDate date;

    public MenuItem(double price, String description, String category, LocalDate date) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double Price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}


