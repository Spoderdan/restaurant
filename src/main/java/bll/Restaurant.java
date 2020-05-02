package bll;

import dao.FileWriter;
import java.io.Serializable;
import java.util.*;

/**
 * Restaurant class holds a list of menu items and a map containing orders and their respective menu items.
 * Implements methods from the IRestaurantProcessing interface.
 * Implements the Serializable interface in order to be able to be serialized in a .ser type file.
 * Extends the Observable class in order to notify the GUI whenever a new order is added.
 */
public class Restaurant extends Observable implements IRestaurantProcessing, Serializable {

    /**
     * List holding a list of menu items, basic of composite.
     */
    private final List<MenuItem> menuItemList;
    /**
     * Map that uses an order type object as key to list of menu items values.
     * This is initialized as a linked hash map in order to preserve the insertion of the items.
     */
    private final Map<Order, List<MenuItem>> orders;

    /**
     * Restaurant constructor to initialize collections and verify invariant.
     */
    public Restaurant() {
        this.menuItemList = new ArrayList<>();
        this.orders = new LinkedHashMap<>();
        if(!isWellFormed())
            throw new ExceptionInInitializerError();
    }

    /**
     * Invariant of the class.
     * @return true if the invariant conditions are met and false otherwise.
     */
    private boolean isWellFormed(){
        if (menuItemList == null || orders == null)
            return false;
        return true;
    }

    /**
     * Add a new menu item to the list.
     * @pre menuItem != null
     * @post menuItemList.size() == menuItemList.size()@pre + 1
     * @param menuItem new menu item
     */
    @Override
    public void createNewMenuItem(MenuItem menuItem) {
        assert menuItem != null;
        int oldSize = menuItemList.size();
        menuItemList.add(menuItem);
        assert menuItemList.size() == oldSize + 1;
    }

    /**
     * Delete a menu item from the list.
     * @pre index >= 0 && index <= menuItemList.size()
     * @post menuItemList.size() == menuItemList.size()@pre - 1
     * @param index index of item to be deleted
     */
    @Override
    public void deleteMenuItem(int index) {
        assert (index >= 0) && (index < menuItemList.size());
        int oldSize = menuItemList.size();
        menuItemList.remove(index);
        assert menuItemList.size() == oldSize - 1;
    }

    /**
     * Edit the values of a menu item.
     * @pre menuItem != null, index >= 0 && index <= menuItemList.size()
     * @param index index of item to be updated
     * @param menuItem new menu item to replace old one
     */
    @Override
    public void editMenuItem(int index, MenuItem menuItem) {
        assert (menuItem != null) && (index >= 0) && (index < menuItemList.size());
        menuItemList.set(index, menuItem);
    }

    /**
     * Add a new order and corresponding menu items to the list.
     * @pre order != null, menuItems != null
     * @post orders.size() == orders.size()@pre + 1
     * @param order new order
     * @param menuItems menu items of the order
     */
    @Override
    public void createNewOrder(Order order, List<MenuItem> menuItems) {
        assert (order != null) && (menuItems != null);
        int oldSize = orders.size();
        orders.put(order, menuItems);
        assert orders.size() == oldSize + 1;
        setChanged();
        notifyObservers();
    }

    /**
     * Computes the cost of an order.
     * @pre order != null
     * @post @result == @forall k:[0..menuItemList.size()] @menuItem.computePrice() @sum
     * @param order order that needs to have its cost computed
     * @return double cost of order
     */
    @Override
    public double computeOrderPrice(Order order) {
        assert order != null;
        double buf = 0;
        for(MenuItem menuItem : orders.get(order))
            buf += menuItem.computePrice();
        return buf;

        // Why does this not work?
        //return orders.get(order).stream().mapToDouble(menuItem -> computePrice()).sum();
    }

    /**
     * Generates a bill in a new text file for an order.
     * @pre order != null
     * @param order order to have bill generated
     */
    @Override
    public void generateBill(Order order, int id) {
        FileWriter.makeBill(order, orders.get(order), id);
    }

    @Override
    public void editOrder(int index, Order order, List<MenuItem> menuItems) {


    }

    @Override
    public void deleteOrder(Order order) {
        assert order != null;
        orders.remove(order);
    }

    /**
     * Get a menu item from the list by its name.
     * @param s name of the menu item
     * @return menu item
     */
    public MenuItem getMenuItem(String s) {
        MenuItem menuItem = null;
        for (MenuItem m : menuItemList)
            if (m.getName().equals(s))
                menuItem = m;
        return menuItem;
    }

    /**
     * Get a menu item from the list by its index.
     * @param index index of the menu item
     * @return menu item
     */
    public MenuItem getMenuItem(int index){
        return menuItemList.get(index);
    }

    /**
     * Get an order from the map by its index.
     * @param index index of the order
     * @return order
     */
    public Order getOrder(int index){
        List keys = new ArrayList(orders.keySet());
        return (Order) keys.get(index);
    }

    /**
     * Get the list of menu items corresponding to an order.
     * @param order key of the map entry.
     * @return list of menu items
     */
    public List<MenuItem> getMenuItemList(Order order){
        return orders.get(order);
    }

    /**
     * Get the list of all menu items of the restaurant.
     * @return list of menu items
     */
    public List<MenuItem> getMenuItemList(){
        return menuItemList;
    }

    /**
     * Get the size of list of all menu items.
     * @return integer corresponding to the size of the list of menu items
     */
    public int getMenuItemListSize(){
        return  menuItemList.size();
    }

    /**
     * Get the size of the map of orders.
     * @return integer corresponding to the size of the map of orders
     */
    public int getOrderListSize(){
        return orders.size();
    }

}
