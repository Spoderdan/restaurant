package bll;

public class BaseMenuItem extends MenuItem {

    public BaseMenuItem(String name, double price) {
        super(name, price);
    }

    @Override
    public double computePrice() {
        return price;
    }

    @Override
    public String getIngredientList() {
        return name;
    }
}
