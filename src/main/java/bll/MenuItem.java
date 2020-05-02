package bll;

import java.io.Serializable;

public abstract class MenuItem implements Serializable {

    protected String name;
    protected double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double computePrice();

    public abstract String getIngredientList();

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

}
