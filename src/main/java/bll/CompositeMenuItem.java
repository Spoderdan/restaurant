package bll;

import java.util.List;

public class CompositeMenuItem extends MenuItem{

    private final List<MenuItem> items;

    public CompositeMenuItem(String name, List<MenuItem> items) {
        super(name, 0);
        this.items = items;
        setPrice(computePrice());
    }

    @Override
    public double computePrice() {
        double buf = 0;
        for(MenuItem m : items)
            buf += m.getPrice();
        return buf;

        //return items.stream().mapToDouble(baseMenuItem -> computePrice()).sum();
    }

    @Override
    public String getIngredientList() {
        StringBuilder ingredients = new StringBuilder();
        for(MenuItem m : items)
            ingredients.append(m.getIngredientList()).append(", ");
        return String.valueOf(ingredients);
    }
}
