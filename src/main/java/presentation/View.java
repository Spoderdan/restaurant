package presentation;

import bll.MenuItem;
import bll.Order;
import bll.Restaurant;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Anghel Dan-Marian 30422
 */
public class View extends javax.swing.JFrame implements Observer {

    private final Restaurant restaurant;

    private javax.swing.JPanel administratorGUI;
    private javax.swing.JButton buttonBillWaiter;
    private javax.swing.JButton buttonDeleteAdmin;
    private javax.swing.JButton buttonDeleteWaiter;
    private javax.swing.JButton buttonNewAdmin;
    private javax.swing.JButton buttonNewWaiter;
    private javax.swing.JButton buttonNextAdmin;
    private javax.swing.JButton buttonNextWaiter;
    private javax.swing.JButton buttonPrevAdmin;
    private javax.swing.JButton buttonPrevWaiter;
    private javax.swing.JButton buttonUpdateAdmin;
    private javax.swing.JButton buttonUpdateWaiter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDateWaiter;
    private javax.swing.JLabel labelIdWaiter;
    private javax.swing.JLabel labelIngredientsAdmin;
    private javax.swing.JLabel labelItemsWaiter;
    private javax.swing.JLabel labelNameAdmin;
    private javax.swing.JLabel labelPriceAdmin;
    private javax.swing.JLabel labelTableWaiter;
    private javax.swing.JLabel labelTitleAdmin;
    private javax.swing.JLabel labelTitleWaiter;
    private javax.swing.JPanel panelButtonsAdmin;
    private javax.swing.JPanel panelButtonsWaiter;
    private javax.swing.JPanel panelDateWaiter;
    private javax.swing.JPanel panelIdWaiter;
    private javax.swing.JPanel panelIngredientsAdmin;
    private javax.swing.JPanel panelItemsWaiter;
    private javax.swing.JPanel panelNameAdmin;
    private javax.swing.JPanel panelOrderTableWaiter;
    private javax.swing.JPanel panelPriceAdmin;
    private javax.swing.JPanel panelTableAdmin;
    private javax.swing.JPanel panelTableWaiter;
    private javax.swing.JTable tableAdmin;
    private javax.swing.JTable tableWaiter;
    private javax.swing.JTextField textDateWaiter;
    private javax.swing.JTextField textIdWaiter;
    private javax.swing.JTextField textIngredientsAdmin;
    private javax.swing.JTextField textItemsWaiter;
    private javax.swing.JTextField textNameAdmin;
    private javax.swing.JTextField textPriceAdmin;
    private javax.swing.JTextField textTableWaiter;
    private javax.swing.JTabbedPane userInterface;
    private javax.swing.JPanel waiterGUI;

    public View(Restaurant restaurant) {
        this.restaurant = restaurant;
        initComponents();
        setAdminView(restaurant.getMenuItem(0));
        setWaiterView(restaurant.getOrder(0));
    }

    private void initComponents() {

        userInterface = new javax.swing.JTabbedPane();
        administratorGUI = new javax.swing.JPanel();
        labelTitleAdmin = new javax.swing.JLabel();
        panelNameAdmin = new javax.swing.JPanel();
        labelNameAdmin = new javax.swing.JLabel();
        textNameAdmin = new javax.swing.JTextField();
        panelPriceAdmin = new javax.swing.JPanel();
        labelPriceAdmin = new javax.swing.JLabel();
        textPriceAdmin = new javax.swing.JTextField();
        panelIngredientsAdmin = new javax.swing.JPanel();
        labelIngredientsAdmin = new javax.swing.JLabel();
        textIngredientsAdmin = new javax.swing.JTextField();
        panelButtonsAdmin = new javax.swing.JPanel();
        buttonNextAdmin = new javax.swing.JButton();
        buttonPrevAdmin = new javax.swing.JButton();
        buttonNewAdmin = new javax.swing.JButton();
        buttonUpdateAdmin = new javax.swing.JButton();
        buttonDeleteAdmin = new javax.swing.JButton();
        panelTableAdmin = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAdmin = new javax.swing.JTable();
        waiterGUI = new javax.swing.JPanel();
        labelTitleWaiter = new javax.swing.JLabel();
        panelIdWaiter = new javax.swing.JPanel();
        labelIdWaiter = new javax.swing.JLabel();
        textIdWaiter = new javax.swing.JTextField();
        panelDateWaiter = new javax.swing.JPanel();
        labelDateWaiter = new javax.swing.JLabel();
        textDateWaiter = new javax.swing.JTextField();
        panelItemsWaiter = new javax.swing.JPanel();
        labelItemsWaiter = new javax.swing.JLabel();
        textItemsWaiter = new javax.swing.JTextField();
        panelTableWaiter = new javax.swing.JPanel();
        labelTableWaiter = new javax.swing.JLabel();
        textTableWaiter = new javax.swing.JTextField();
        panelButtonsWaiter = new javax.swing.JPanel();
        buttonNextWaiter = new javax.swing.JButton();
        buttonBillWaiter = new javax.swing.JButton();
        buttonPrevWaiter = new javax.swing.JButton();
        buttonNewWaiter = new javax.swing.JButton();
        buttonUpdateWaiter = new javax.swing.JButton();
        buttonDeleteWaiter = new javax.swing.JButton();
        panelOrderTableWaiter = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableWaiter = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitleAdmin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        labelTitleAdmin.setText("Administrator User Interface");

        panelNameAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelNameAdmin.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        labelNameAdmin.setText("Menu Item Name");

        textNameAdmin.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N

        javax.swing.GroupLayout panelNameAdminLayout = new javax.swing.GroupLayout(panelNameAdmin);
        panelNameAdmin.setLayout(panelNameAdminLayout);
        panelNameAdminLayout.setHorizontalGroup(
                panelNameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelNameAdminLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelNameAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(textNameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        panelNameAdminLayout.setVerticalGroup(
                panelNameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelNameAdminLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(panelNameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textNameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelNameAdmin))
                                .addContainerGap())
        );

        panelPriceAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelPriceAdmin.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        labelPriceAdmin.setText("Menu Item Price");

        textPriceAdmin.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N

        javax.swing.GroupLayout panelPriceAdminLayout = new javax.swing.GroupLayout(panelPriceAdmin);
        panelPriceAdmin.setLayout(panelPriceAdminLayout);
        panelPriceAdminLayout.setHorizontalGroup(
                panelPriceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPriceAdminLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelPriceAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textPriceAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPriceAdminLayout.setVerticalGroup(
                panelPriceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPriceAdminLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelPriceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textPriceAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelPriceAdmin))
                                .addContainerGap())
        );

        panelIngredientsAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelIngredientsAdmin.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        labelIngredientsAdmin.setText("Menu Item Ingredients");

        textIngredientsAdmin.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N

        javax.swing.GroupLayout panelIngredientsAdminLayout = new javax.swing.GroupLayout(panelIngredientsAdmin);
        panelIngredientsAdmin.setLayout(panelIngredientsAdminLayout);
        panelIngredientsAdminLayout.setHorizontalGroup(
                panelIngredientsAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelIngredientsAdminLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelIngredientsAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(textIngredientsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        panelIngredientsAdminLayout.setVerticalGroup(
                panelIngredientsAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelIngredientsAdminLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(panelIngredientsAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textIngredientsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelIngredientsAdmin))
                                .addContainerGap())
        );

        panelButtonsAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonNextAdmin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonNextAdmin.setText("Next");

        buttonPrevAdmin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonPrevAdmin.setText("Previous");

        buttonNewAdmin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonNewAdmin.setText("New");

        buttonUpdateAdmin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonUpdateAdmin.setText("Update");

        buttonDeleteAdmin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonDeleteAdmin.setText("Delete");

        javax.swing.GroupLayout panelButtonsAdminLayout = new javax.swing.GroupLayout(panelButtonsAdmin);
        panelButtonsAdmin.setLayout(panelButtonsAdminLayout);
        panelButtonsAdminLayout.setHorizontalGroup(
                panelButtonsAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelButtonsAdminLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelButtonsAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsAdminLayout.createSequentialGroup()
                                                .addComponent(buttonNextAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPrevAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(panelButtonsAdminLayout.createSequentialGroup()
                                                .addComponent(buttonNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(buttonUpdateAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonDeleteAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        panelButtonsAdminLayout.setVerticalGroup(
                panelButtonsAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelButtonsAdminLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelButtonsAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonPrevAdmin)
                                        .addComponent(buttonNextAdmin))
                                .addGap(18, 18, 18)
                                .addGroup(panelButtonsAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonNewAdmin)
                                        .addComponent(buttonDeleteAdmin)
                                        .addComponent(buttonUpdateAdmin))
                                .addGap(0, 13, Short.MAX_VALUE))
        );

        panelTableAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableAdmin.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        tableAdmin.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Name", "Price"
                }
        ));
        jScrollPane1.setViewportView(tableAdmin);

        javax.swing.GroupLayout panelTableAdminLayout = new javax.swing.GroupLayout(panelTableAdmin);
        panelTableAdmin.setLayout(panelTableAdminLayout);
        panelTableAdminLayout.setHorizontalGroup(
                panelTableAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTableAdminLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTableAdminLayout.setVerticalGroup(
                panelTableAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableAdminLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(325, 325, 325))
        );

        javax.swing.GroupLayout administratorGUILayout = new javax.swing.GroupLayout(administratorGUI);
        administratorGUI.setLayout(administratorGUILayout);
        administratorGUILayout.setHorizontalGroup(
                administratorGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(administratorGUILayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(administratorGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panelIngredientsAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelTitleAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(administratorGUILayout.createSequentialGroup()
                                                .addComponent(panelNameAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(panelPriceAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(panelButtonsAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelTableAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        administratorGUILayout.setVerticalGroup(
                administratorGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(administratorGUILayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelTitleAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(administratorGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelNameAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelPriceAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(panelIngredientsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelButtonsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelTableAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, Short.MAX_VALUE)
                                .addContainerGap())
        );

        userInterface.addTab("Administrator", administratorGUI);

        labelTitleWaiter.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        labelTitleWaiter.setText("Waiter User Interface");

        panelIdWaiter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelIdWaiter.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        labelIdWaiter.setText("ID");

        textIdWaiter.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N

        javax.swing.GroupLayout panelIdWaiterLayout = new javax.swing.GroupLayout(panelIdWaiter);
        panelIdWaiter.setLayout(panelIdWaiterLayout);
        panelIdWaiterLayout.setHorizontalGroup(
                panelIdWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelIdWaiterLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelIdWaiter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textIdWaiter)
                                .addContainerGap())
        );
        panelIdWaiterLayout.setVerticalGroup(
                panelIdWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelIdWaiterLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(panelIdWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textIdWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelIdWaiter))
                                .addContainerGap())
        );

        panelDateWaiter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelDateWaiter.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        labelDateWaiter.setText("Date");

        textDateWaiter.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N

        javax.swing.GroupLayout panelDateWaiterLayout = new javax.swing.GroupLayout(panelDateWaiter);
        panelDateWaiter.setLayout(panelDateWaiterLayout);
        panelDateWaiterLayout.setHorizontalGroup(
                panelDateWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDateWaiterLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelDateWaiter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textDateWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panelDateWaiterLayout.setVerticalGroup(
                panelDateWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDateWaiterLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(panelDateWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textDateWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelDateWaiter))
                                .addContainerGap())
        );

        panelItemsWaiter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelItemsWaiter.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        labelItemsWaiter.setText("Items ordered");

        textItemsWaiter.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N

        javax.swing.GroupLayout panelItemsWaiterLayout = new javax.swing.GroupLayout(panelItemsWaiter);
        panelItemsWaiter.setLayout(panelItemsWaiterLayout);
        panelItemsWaiterLayout.setHorizontalGroup(
                panelItemsWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelItemsWaiterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelItemsWaiter)
                                .addGap(18, 18, 18)
                                .addComponent(textItemsWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        panelItemsWaiterLayout.setVerticalGroup(
                panelItemsWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelItemsWaiterLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(panelItemsWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textItemsWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelItemsWaiter))
                                .addContainerGap())
        );

        panelTableWaiter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTableWaiter.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        labelTableWaiter.setText("Table");

        textTableWaiter.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N

        javax.swing.GroupLayout panelTableWaiterLayout = new javax.swing.GroupLayout(panelTableWaiter);
        panelTableWaiter.setLayout(panelTableWaiterLayout);
        panelTableWaiterLayout.setHorizontalGroup(
                panelTableWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTableWaiterLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTableWaiter)
                                .addGap(18, 18, 18)
                                .addComponent(textTableWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        panelTableWaiterLayout.setVerticalGroup(
                panelTableWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTableWaiterLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelTableWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textTableWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelTableWaiter))
                                .addContainerGap())
        );

        panelButtonsWaiter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonNextWaiter.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonNextWaiter.setText("Next");

        buttonBillWaiter.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonBillWaiter.setText("Generate Bill");

        buttonPrevWaiter.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonPrevWaiter.setText("Previous");

        buttonNewWaiter.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonNewWaiter.setText("New");

        buttonUpdateWaiter.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonUpdateWaiter.setText("Update");

        buttonDeleteWaiter.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonDeleteWaiter.setText("Delete");

        javax.swing.GroupLayout panelButtonsWaiterLayout = new javax.swing.GroupLayout(panelButtonsWaiter);
        panelButtonsWaiter.setLayout(panelButtonsWaiterLayout);
        panelButtonsWaiterLayout.setHorizontalGroup(
                panelButtonsWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsWaiterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelButtonsWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonNextWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonNewWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panelButtonsWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonBillWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonUpdateWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelButtonsWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonDeleteWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonPrevWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        panelButtonsWaiterLayout.setVerticalGroup(
                panelButtonsWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelButtonsWaiterLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelButtonsWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonPrevWaiter)
                                        .addComponent(buttonNextWaiter)
                                        .addComponent(buttonBillWaiter))
                                .addGap(18, 18, 18)
                                .addGroup(panelButtonsWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonNewWaiter)
                                        .addComponent(buttonDeleteWaiter)
                                        .addComponent(buttonUpdateWaiter))
                                .addGap(0, 13, Short.MAX_VALUE))
        );

        panelOrderTableWaiter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableWaiter.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        tableWaiter.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Id", "Date", "Table"
                }
        ));
        jScrollPane2.setViewportView(tableWaiter);

        javax.swing.GroupLayout panelOrderTableWaiterLayout = new javax.swing.GroupLayout(panelOrderTableWaiter);
        panelOrderTableWaiter.setLayout(panelOrderTableWaiterLayout);
        panelOrderTableWaiterLayout.setHorizontalGroup(
                panelOrderTableWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelOrderTableWaiterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOrderTableWaiterLayout.setVerticalGroup(
                panelOrderTableWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOrderTableWaiterLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(336, 336, 336))
        );

        javax.swing.GroupLayout waiterGUILayout = new javax.swing.GroupLayout(waiterGUI);
        waiterGUI.setLayout(waiterGUILayout);
        waiterGUILayout.setHorizontalGroup(
                waiterGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(waiterGUILayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(waiterGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelTitleWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(waiterGUILayout.createSequentialGroup()
                                                .addComponent(panelIdWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(panelDateWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(panelTableWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(panelButtonsWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelOrderTableWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelItemsWaiter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        waiterGUILayout.setVerticalGroup(
                waiterGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(waiterGUILayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelTitleWaiter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(waiterGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelIdWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelTableWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelDateWaiter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(panelItemsWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelButtonsWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelOrderTableWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, 127, Short.MAX_VALUE)
                                .addContainerGap())
        );

        userInterface.addTab("Waiter", waiterGUI);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userInterface)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userInterface)
        );

        pack();
    }

    @Override
    public void update(Observable o, Object arg) {
        JOptionPane.showMessageDialog(null, "New Order\n" + getTextItemsWaiter(), "Chef Notifier", JOptionPane.INFORMATION_MESSAGE);
    }

    // GETTERS =========================================================================================================

    public Date getTextDateWaiter() {
        return new Date(textDateWaiter.getText());
    }

    public int getTextIdWaiter() {
        return Integer.parseInt(textIdWaiter.getText());
    }

    public String getTextIngredientsAdmin() {
        return textIngredientsAdmin.getText();
    }

    public String getTextNameAdmin() {
        return textNameAdmin.getText();
    }

    public double getTextPriceAdmin() {
        return Double.parseDouble(textPriceAdmin.getText());
    }

    public int getTextTableWaiter() {
        return Integer.parseInt(textTableWaiter.getText());
    }

    public String getTextItemsWaiter() {
        return textItemsWaiter.getText();
    }

    // DISPLAY MESSAGES ================================================================================================

    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }

    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    // LISTENERS =======================================================================================================

    public void addNextItemAdminListener(ActionListener actionListener){
        buttonNextAdmin.addActionListener(actionListener);
    }

    public void addPrevItemAdminListener(ActionListener actionListener){
        buttonPrevAdmin.addActionListener(actionListener);
    }

    public void addNewItemAdminListener(ActionListener actionListener) {
        buttonNewAdmin.addActionListener(actionListener);
    }

    public void addUpdateItemAdminListener(ActionListener actionListener){
        buttonUpdateAdmin.addActionListener(actionListener);
    }

    public void addDeleteItemAdminListener(ActionListener actionListener){
        buttonDeleteAdmin.addActionListener(actionListener);
    }

    public void addNextOrderWaiterListener(ActionListener actionListener){
        buttonNextWaiter.addActionListener(actionListener);
    }

    public void addPrevOrderWaiterListener(ActionListener actionListener){
        buttonPrevWaiter.addActionListener(actionListener);
    }

    public void addNewOrderWaiterListener(ActionListener actionListener){
        buttonNewWaiter.addActionListener(actionListener);
    }

    public void addUpdateOrderWaiterListener(ActionListener actionListener){
        buttonUpdateWaiter.addActionListener(actionListener);
    }

    public void addDeleteOrderWaiterListener(ActionListener actionListener){
        buttonDeleteWaiter.addActionListener(actionListener);
    }

    public void addComputePriceWaiterListener(ActionListener actionListener){
        buttonNewWaiter.addActionListener(actionListener);
        buttonUpdateWaiter.addActionListener(actionListener);
    }

    public void addGenerateBillWaiterListener(ActionListener actionListener){
        buttonBillWaiter.addActionListener(actionListener);
    }

    // SETTERS =========================================================================================================

    public void setTableAdmin(){
        List<MenuItem> menuItems = restaurant.getMenuItemList();
        Object[][] objects = new Object[menuItems.size()][2];

        int i = 0;
        for (MenuItem m : menuItems){
            objects[i][0] = m.getName();
            objects[i][1] = m.getPrice();
            i++;
        }

        tableAdmin.setModel(new javax.swing.table.DefaultTableModel(objects, new String [] {"Name", "Price"}));
    }

    public void setTableWaiter(){
        Object[][] objects = new Object[restaurant.getOrderListSize()][3];

        int i = 0;
        while (i < restaurant.getOrderListSize()){
            Order order = restaurant.getOrder(i);
            objects[i][0] = order.getOrderId();
            objects[i][1] = order.getDate();
            objects[i][2] = order.getTable();
            i++;
        }

        tableWaiter.setModel(new javax.swing.table.DefaultTableModel(objects, new String [] {"Id", "Date", "Table"}));
    }

    public void setAdminView(MenuItem menuItem) {
        textNameAdmin.setText(menuItem.getName());
        textPriceAdmin.setText(String.valueOf(menuItem.computePrice()));
        textIngredientsAdmin.setText(menuItem.getIngredientList());
        setTableAdmin();
    }

    public void setWaiterView(Order order){
        textIdWaiter.setText(Integer.toString(order.getOrderId()));
        textDateWaiter.setText(String.valueOf(order.getDate()));
        textTableWaiter.setText(Integer.toString(order.getTable()));
        StringBuilder itemsOrdered = new StringBuilder();
        for(MenuItem m : restaurant.getMenuItemList(order))
            itemsOrdered.append(m.getName()).append(", ");
        textItemsWaiter.setText(String.valueOf(itemsOrdered));
        setTableWaiter();
    }


}