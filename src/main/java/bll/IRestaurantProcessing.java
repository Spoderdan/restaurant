package bll;

import java.util.List;

/**
 * @invariant isWellFormed()
 */
public interface IRestaurantProcessing {

    /**
     * Add a new menu item to the list.
     * @pre menuItem != null
     * @post menuItemList.size() == menuItemList.size()@pre + 1
     * @param menuItem new menu item
     */
    void createNewMenuItem(MenuItem menuItem);

    /**
     * Delete a menu item from the list.
     * @pre index >= 0 && index <= menuItemList.size()
     * @post menuItemList.size() == menuItemList.size()@pre - 1
     * @param index index of item to be deleted
     */
    void deleteMenuItem(int index);

    /**
     * Edit the values of a menu item.
     * @pre menuItem != null, index >= 0 && index <= menuItemList.size()
     * @param index index of item to be updated
     * @param menuItem new menu item to replace old one
     */
    void editMenuItem(int index, MenuItem menuItem);

    /**
     * Add a new order and corresponding menu items to the list.
     * @pre order != null, menuItems != null
     * @post orders.size() == orders.size()@pre + 1
     * @param order new order
     * @param menuItems menu items of the order
     */
    void createNewOrder(Order order, List<MenuItem> menuItems);

    /**
     * Computes the cost of an order.
     * @pre order != null
     * @post @result == @forall k:[0..menuItemList.size()] @menuItem.computePrice() @sum
     * @param order order that needs to have its cost computed
     * @return double cost of order
     */
    double computeOrderPrice(Order order);

    /**
     * Generates a bill in a new text file for an order.
     * @pre order != null
     * @param order order to have bill generated
     */
    void generateBill(Order order, int id);

    void editOrder(int index, Order order, List<MenuItem> menuItems);

    void deleteOrder(Order order);
}
