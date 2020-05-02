package start;

import bll.*;
import dao.RestaurantSerializator;
import presentation.Controller;
import presentation.View;

public class Start {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        RestaurantSerializator restaurantSerializator = new RestaurantSerializator(restaurant);
        restaurant = restaurantSerializator.deserialize("Restaurant.ser");

        View view = new View(restaurant);
        Controller controller = new Controller(restaurant, view);

        view.setVisible(true);

    }

}
