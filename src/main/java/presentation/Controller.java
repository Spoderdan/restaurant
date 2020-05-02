package presentation;

import bll.*;
import bll.MenuItem;
import dao.RestaurantSerializator;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Controller {

    private final Restaurant restaurant;
    private final View view;

    private int indexAdmin;
    private int indexWaiter;

    public Controller(Restaurant restaurant, View view) {
        this.restaurant = restaurant;
        this.view = view;
        indexAdmin = 0;
        restaurant.addObserver(view);

        this.view.addNextItemAdminListener(new NextItemAdminListener());
        this.view.addPrevItemAdminListener(new PrevItemAdminListener());
        this.view.addNewItemAdminListener(new NewMenuItemListener());
        this.view.addUpdateItemAdminListener(new UpdateMenuItemListener());
        this.view.addDeleteItemAdminListener(new DeleteMenuItemListener());
        this.view.addNextOrderWaiterListener(new NextOrderWaiterListener());
        this.view.addPrevOrderWaiterListener(new PrevOrderWaiterListener());
        this.view.addNewOrderWaiterListener(new NewOrderListener());
        this.view.addUpdateOrderWaiterListener(new UpdateOrderListener());
        this.view.addDeleteOrderWaiterListener(new DeleteOrderListener());
        this.view.addComputePriceWaiterListener(new NewComputeOrderPriceListener());
        this.view.addGenerateBillWaiterListener(new NewGenerateBillListener());
        this.view.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                view.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                if (JOptionPane.showConfirmDialog(view,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    RestaurantSerializator restaurantSerializator = new RestaurantSerializator(restaurant);
                    restaurantSerializator.serialize();
                    System.exit(0);
                }
            }
        });
    }

    // ADMIN LISTENERS =================================================================================================

    class NextItemAdminListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                indexAdmin++;
                MenuItem menuItem = restaurant.getMenuItem(indexAdmin);
                view.setAdminView(menuItem);
            } catch (IndexOutOfBoundsException exception) {
                view.showError("This is the last item in the list.");
                indexAdmin = restaurant.getMenuItemListSize() - 1;
            }
        }
    }

    class PrevItemAdminListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                indexAdmin--;
                MenuItem menuItem = restaurant.getMenuItem(indexAdmin);
                view.setAdminView(menuItem);
            } catch (IndexOutOfBoundsException exception) {
                view.showError("This is the first item in the list.");
                indexAdmin = 0;
            }
        }
    }

    @NotNull
    private MenuItem parseMenuItem() {
        List<String> ingredients;
        MenuItem menuItem;
        List<MenuItem> menuItems;

        ingredients = Arrays.asList(view.getTextIngredientsAdmin().split(", "));

        if (ingredients.size() <= 1)
            menuItem = new BaseMenuItem(view.getTextNameAdmin(), view.getTextPriceAdmin());
        else {
            menuItems = new ArrayList<>();
            for(String s : ingredients)
                menuItems.add(restaurant.getMenuItem(s));
            menuItem = new CompositeMenuItem(view.getTextNameAdmin(), menuItems);
        }

        return menuItem;
    }

    class NewMenuItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                MenuItem menuItem = parseMenuItem();
                restaurant.createNewMenuItem(menuItem);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    class UpdateMenuItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                MenuItem menuItem = parseMenuItem();
                restaurant.editMenuItem(indexAdmin, menuItem);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    class DeleteMenuItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                restaurant.deleteMenuItem(indexAdmin);
                view.setAdminView(restaurant.getMenuItem(indexAdmin));
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    // WAITER LISTENERS ================================================================================================

    class NextOrderWaiterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                indexWaiter++;
                Order order = restaurant.getOrder(indexWaiter);
                view.setWaiterView(order);
            } catch (IndexOutOfBoundsException exception) {
                view.showError("This is the last order in the list.");
                indexWaiter = restaurant.getOrderListSize() - 1;
            }
        }
    }

    class PrevOrderWaiterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                indexWaiter--;
                Order order = restaurant.getOrder(indexWaiter);
                view.setWaiterView(order);
            } catch (IndexOutOfBoundsException exception) {
                view.showError("This is the first order in the list.");
                indexWaiter = 0;
            }
        }
    }

    class NewOrderListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            List<MenuItem> menuItems = new ArrayList<>();
            Order order;
            MenuItem menuItem;
            try {
                for(String s : view.getTextItemsWaiter().split(", ")){
                    menuItem = restaurant.getMenuItem(s);
                    if(menuItem != null)
                        menuItems.add(menuItem);
                }
                order = new Order(view.getTextIdWaiter(), new Date(), view.getTextTableWaiter());
                restaurant.createNewOrder(order, menuItems);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    class UpdateOrderListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            List<MenuItem> menuItems = new ArrayList<>();
            Order order;
            MenuItem menuItem;
            try {
                for(String s : view.getTextItemsWaiter().split(", ")){
                    menuItem = restaurant.getMenuItem(s);
                    if(menuItem != null)
                        menuItems.add(menuItem);
                }
                order = new Order(view.getTextIdWaiter(), new Date(), view.getTextTableWaiter());
                restaurant.editOrder(indexWaiter, order, menuItems);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    class DeleteOrderListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Order order;
            try {
                order = new Order(view.getTextIdWaiter(), view.getTextDateWaiter(), view.getTextTableWaiter());
                restaurant.deleteOrder(order);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    class NewComputeOrderPriceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                view.showMessage("Order cost is: " + restaurant.computeOrderPrice(restaurant.getOrder(indexWaiter)) + ".");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    class NewGenerateBillListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                restaurant.generateBill(restaurant.getOrder(indexWaiter), restaurant.getOrder(indexWaiter).getOrderId());
                view.showMessage("Bill has been generated.");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }



}
