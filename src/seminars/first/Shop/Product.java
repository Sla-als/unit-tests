package seminars.first.Shop;

import java.util.Objects;

public class Product { // добавляем возможность сравнивать объекты Product

    private Integer cost; // Стоимость продукта    int -> Integer
    private String title; // Название

    public Product(String title, Integer cost) {
        this.cost = cost;
        this.title = title;
    }
    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}