package dao;

import bll.Restaurant;
import java.io.*;

public class RestaurantSerializator {

    private Restaurant restaurant;

    public RestaurantSerializator(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    public void serialize(){
        try {
            FileOutputStream file = new FileOutputStream("Restaurant.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(restaurant);

            out.close();
            file.close();

            System.out.println("Object has been serialized.");
        } catch (IOException ex) {
            System.out.println("IOException is caught.");
        }
    }

    public Restaurant deserialize(String filename){
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            restaurant = (Restaurant) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized.");
            return restaurant;
        } catch(IOException ex) {
            System.out.println("IOException is caught.");
        } catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught.");
        }
        return null;
    }

}

