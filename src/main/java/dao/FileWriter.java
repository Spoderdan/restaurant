package dao;

import bll.MenuItem;
import bll.Order;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FileWriter {

    public static void makeBill(Order order, List<MenuItem> menuItems, int id){

        StringBuilder bill = new StringBuilder();
        bill.append("BILL\n");
        bill.append("Order ID: ").append(order.getOrderId());
        bill.append("\nDate: ").append(order.getDate());
        bill.append("\nTable number: ").append(order.getTable());
        menuItems.forEach(menuItem -> bill.append("\n").append(menuItem.getName()).append(" ").append(menuItem.computePrice()));
        double buf = 0;
        for(MenuItem m : menuItems)
            buf += m.computePrice();
        bill.append("\nTotal cost: ").append(buf);

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("bill" + id + ".txt"), StandardCharsets.UTF_8))) {
            writer.write(String.valueOf(bill));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
