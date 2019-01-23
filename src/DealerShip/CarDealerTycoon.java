/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DealerShip;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

/**
 *
 * @author hunt4991
 */
public class CarDealerTycoon extends javax.swing.JFrame {

    //array list for vehicle lot
    public ArrayList<Vehicle> lot = new ArrayList<Vehicle>();
    //array list for your inventory
    public ArrayList<Vehicle> inv = new ArrayList<Vehicle>();// Vehicle a, b, c, d, e, f, g, h, i, j, k, l;
    //starting money and cost
    int money = 20000, cost;
    Vehicle v;
    private DefaultListModel list;

    public CarDealerTycoon() {
        initComponents();
        list = new DefaultListModel();
        //add all of the vehicles and display them on the table, as well as storing the starting price
        lot.add(new PassengerCar(15000, "Toyota", "Prius", 2005, "yes"));
        lot.add(new PassengerCar(5000, "Acura", "CSX", 2007, "no"));
        lot.add(new PassengerCar(47800, "Aston Martin", "Vantage V8", 2007, "no"));
        lot.add(new PassengerCar(19880, "Audi", "A4", 2014, "no"));
        lot.add(new PassengerCar(31980, "MINI", "Cooper Convertable", 2018, "no"));
        lot.add(new PassengerCar(31999, "Jaguar", "XF 3.0L", 2014, "no"));
        lot.add(new PassengerCar(52899, "Lexus", "RX 350", 2017, "no"));
        lot.add(new PassengerCar(13900, "Dodge", "Caravan", 2015, "no"));
        lot.add(new Truck(39999, "Dodge", "RAM 1500 Pickup", 2017, "yes"));
        lot.add(new Truck(17999, "Ford", "F-150", 2015, "yes"));
        lot.add(new Truck(22000, "Chevrolet", "1500 Pickup", 2016, "no"));
        lot.add(new Truck(14988, "Toyota", "Tacoma", 2008, "yes"));
        lot.add(new PassengerCar(100000, "Ford", "Mustang", 2018, "no"));
        lot.add(new PassengerCar(125000, "Tesla", "Model X", 2016, "yes"));
        lot.add(new Truck(37600, "Chevrolet", "Silverado 2500HD", 2019, "yes"));
        lot.add(new Truck(36140, "Dodge", "RAM 1500", 2019, "no"));
        lot.add(new PassengerCar(66845, "Alfa Romeo", "4C Coupe", 2018, "no"));
        lot.add(new PassengerCar(55999, "Tesla", "Model S", 2012, "yes"));
        lot.add(new PassengerCar(89800, "Jaguar", "I-PACE", 2019, "yes"));
        lot.add(new PassengerCar(129988, "Lamborghini", "Gallardo Superlegerra", 2007, "no"));

        for (int i = 0; i < 20; i++) {
            tblforsale.setValueAt(lot.get(i).sum(), i, 0);
            int startingp = lot.get(i).getPrice();
            lot.get(i).setStartingPrice(startingp);
        }
        txtmon.setText("Money: $" + money);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnbuy = new javax.swing.JButton();
        btnrestore = new javax.swing.JButton();
        btnsell = new javax.swing.JButton();
        btnrent = new javax.swing.JButton();
        btnscrap = new javax.swing.JButton();
        txtmon = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblforsale = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblowned = new javax.swing.JTable();
        btnstat = new javax.swing.JButton();
        btnsort = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cars Owned: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cars Available:");

        btnbuy.setText("Buy Selected");
        btnbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuyActionPerformed(evt);
            }
        });

        btnrestore.setText("Restore Selected");
        btnrestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestoreActionPerformed(evt);
            }
        });

        btnsell.setText("Sell Selected");
        btnsell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsellActionPerformed(evt);
            }
        });

        btnrent.setText("Rent Selected");
        btnrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrentActionPerformed(evt);
            }
        });

        btnscrap.setText("Scrap ($300)");
        btnscrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscrapActionPerformed(evt);
            }
        });

        txtmon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtmon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtmon.setText("Money: $50000");

        tblforsale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Car"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblforsale);
        if (tblforsale.getColumnModel().getColumnCount() > 0) {
            tblforsale.getColumnModel().getColumn(0).setPreferredWidth(170);
        }

        tblowned.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cars Owned"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblowned);
        if (tblowned.getColumnModel().getColumnCount() > 0) {
            tblowned.getColumnModel().getColumn(0).setResizable(false);
        }

        btnstat.setText("Statistics");
        btnstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatActionPerformed(evt);
            }
        });

        btnsort.setText("Sort(A-Z)");
        btnsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnrestore, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsell, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnscrap, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnstat, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(btnsort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmon, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsell, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(btnbuy, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(btnrestore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnstat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnrent, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addComponent(txtmon))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnscrap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsort)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyActionPerformed
        //buy the vehicle deducting the cost from money, if not you cannot buy it also moving the table up each time a car is bought, and removing it 
        //from the array list preventing you being able to buy it again. surrounded in a try catch
        try {
            int loc = tblforsale.getSelectedRow();
            StartingMenu menu = new StartingMenu(this, true);
            String locs = lot.get(loc).toString();
            menu.distext(locs);
            menu.setVisible(true);
            if (menu.getsig().equals("buy")) {
                cost = lot.get(loc).buy(lot.get(loc).getPrice());
                if (money < cost) {
                    JOptionPane.showMessageDialog(this, "You do not have enought money for this vehicle you need: " + cost);
                    return;
                }
                money -= cost;
            }
            inv.add(lot.get(loc));
            int loccs = inv.size();
            lot.remove(loc);
            for (int i = 0; i < 20; i++) {
                tblforsale.setValueAt("", i, 0);
            }
            for (int i = 0; i < lot.size(); i++) {
                tblforsale.setValueAt(lot.get(i).sum(), i, 0);
            }
            txtmon.setText("Money: $" + money);
            tblowned.setValueAt(inv.get(loccs - 1).sum(), loccs - 1, 0);
            tblforsale.getSelectionModel().clearSelection();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnbuyActionPerformed

    private void btnscrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscrapActionPerformed
        //you scrap a car and make sure you cannot remove the car again for money
        //also updating the table adding the money + 300
        try {
            int loc = tblowned.getSelectedRow();
            //if the nothing is selected on the owned row return a statement and dont allow it.
            if(loc==-1){
                JOptionPane.showMessageDialog(this, "Please select a car that you own to Scrap");
                return;
            }
            if(inv.get(loc)==null){
                JOptionPane.showMessageDialog(this, "Please select a car that you own to Scrap");
                return;
            }
            JOptionPane.showMessageDialog(this, "You have Scraped a car!!!! What a horrible person you are, you gained $300 dollars!");
            inv.remove(loc);
            money += 300;
            txtmon.setText("Money: $" + money);
            for (int i = 0; i < 20; i++) {
                tblowned.setValueAt("", i, 0);
            }
            for (int i = 0; i < inv.size(); i++) {
                tblowned.setValueAt(inv.get(i).sum(), i, 0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnscrapActionPerformed

    private void btnrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrentActionPerformed
        //if the carprice is lower than a certain ammount we do not allow it to be rented out. if the carprice is in a certain ammount,
        //we give them a certain gain back and also depreciate by a set ammount.
        try {
            Rent rent = new Rent(this, true);
            int loc = tblowned.getSelectedRow();
            //if the nothing is selected on the owned row return a statement and dont allow it.
            if(loc==-1){
                JOptionPane.showMessageDialog(this, "Please select a car that you own to Rent");
                return;
            }
            String locs = inv.get(loc).sum();
            int carprice = inv.get(loc).getPrice();
            if (carprice < 1500) {
                JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                return;
            } else if (carprice > 1500 && carprice < 10000) {
                if (carprice < 2000) {
                    JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                    return;
                }
                rent.textx(locs, 2000);
            } else if (carprice > 10000 && carprice < 25000) {
                if (carprice < 2000) {
                    JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                    return;
                }
                rent.textx(locs, 2000);
            } else if (carprice > 25000 && carprice < 50000) {
                if (carprice < 3000) {
                    JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                    return;
                }
                rent.textx(locs, 3000);
            } else if (carprice > 50000 && carprice < 100000) {
                if (carprice < 4000) {
                    JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                    return;
                }
                rent.textx(locs, 4000);
            } else if (carprice > 10000) {
                if (carprice < 5500) {
                    JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                    return;
                }
                rent.textx(locs, 5500);
            }
            rent.setVisible(true);
            if (rent.getsig().equals("yes")) {
                if (carprice > 1500 && carprice < 10000) {
                    money += 2400;
                    inv.get(loc).setPrice(carprice - 2000);
                    JOptionPane.showMessageDialog(this, "You have rented out a car, its value declines $2000, but you gain $2400, due to value");
                } else if (carprice > 10000 && carprice < 25000) {
                    money += 3000;
                    inv.get(loc).setPrice(carprice - 2000);
                    JOptionPane.showMessageDialog(this, "You have rented out a car, its value declines $2000, but you gain $3000, due to value");
                } else if (carprice > 25000 && carprice < 50000) {
                    money += 4500;
                    inv.get(loc).setPrice(carprice - 3000);
                    JOptionPane.showMessageDialog(this, "You have rented out a car, its value declines $3000, but you gain $4500, due to value");
                } else if (carprice > 50000 && carprice < 100000) {
                    money += 6000;
                    inv.get(loc).setPrice(carprice - 4000);
                    JOptionPane.showMessageDialog(this, "You have rented out a car, its value declines $4000, but you gain $6000, due to value");
                } else if (carprice > 100000) {
                    money += 10000;
                    inv.get(loc).setPrice(carprice - 5500);
                    JOptionPane.showMessageDialog(this, "You have rented out a car, its value declines $5500, but you gain $10000, due to value");
                }
            }
            txtmon.setText("Money: $" + money);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnrentActionPerformed

    private void btnstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatActionPerformed
        //display the cars stats
        try{
        int loc = tblowned.getSelectedRow();
        //if the nothing is selected on the owned row return a statement and dont allow it.
        if(loc==-1){
                JOptionPane.showMessageDialog(this, "Please select a car that you own to show the statistics");
                return;
        }
        JOptionPane.showMessageDialog(this, inv.get(loc).sum() + " Is now worth: " + inv.get(loc).getPrice());
        }catch(Exception e){}
    }//GEN-LAST:event_btnstatActionPerformed

    private void btnsellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsellActionPerformed
        //sell the car get the selected row and get that car ammount and add it on to money. also moving the list up cause the car is sold and will disappear.
        try {
            Selling sell = new Selling(this, true);
            int loc = tblowned.getSelectedRow();
            //if the nothing is selected on the owned row return a statement and dont allow it.
            if(loc==-1){
                JOptionPane.showMessageDialog(this, "Please select a car that you own to Sell it");
                return;
            }
            String locs = inv.get(loc).sum();
            int carprice = inv.get(loc).getPrice();
            sell.text(locs, carprice);
            sell.setVisible(true);
            if (sell.getsig().equals("yes")) {
                money += carprice;
                JOptionPane.showMessageDialog(this, "Car successfully sold, Thanks for your business DEALER!");
            }
            inv.remove(loc);
            txtmon.setText("Money: $" + money);
            for (int i = 0; i < 20; i++) {
                tblowned.setValueAt("", i, 0);
            }
            for (int i = 0; i < inv.size(); i++) {
                tblowned.setValueAt(inv.get(i).sum(), i, 0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnsellActionPerformed

    private void btnrestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestoreActionPerformed
        //restore the vehicle, i take the orginal cost and divide it by 2, andthat is the price that you will pay in order to restore it to its orginal ammount
        // if you do not have enough it will not be restored.
        try {
            Restore restore = new Restore(this, true);
            int loc = tblowned.getSelectedRow();
            //if the nothing is selected on the owned row return a statement and dont allow it.
            if(loc==-1){
                JOptionPane.showMessageDialog(this, "Please select a car that you own to Restore it");
                return;
            }
            String locs = inv.get(loc).sum();
            int carprice = inv.get(loc).getPrice();
            int ramm = inv.get(loc).getStartingprice() / 2;
            int org = inv.get(loc).getStartingprice();
            restore.text(locs, ramm);
            restore.setVisible(true);
            if (restore.getsig().equals("yes")) {
                if (ramm > money) {
                    JOptionPane.showMessageDialog(this, "You do not have enough money for this Restore!");
                    return;
                }
                money -= ramm;
                inv.get(loc).setPrice(org);
                JOptionPane.showMessageDialog(this, "Car successfully sold, Thanks for your business DEALER!");
            }
            txtmon.setText("Money: $" + money);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnrestoreActionPerformed

    private void btnsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortActionPerformed
        //compare all of the car makes and order them from a to b using comparable.
        Collections.sort(lot);
        for (int i = 0; i < 20; i++) {
            tblforsale.setValueAt("", i, 0);
        }
        for (int i = 0; i < lot.size(); i++) {
            tblforsale.setValueAt(lot.get(i).sum(), i, 0);
        }
    }//GEN-LAST:event_btnsortActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarDealerTycoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDealerTycoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDealerTycoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDealerTycoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarDealerTycoon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuy;
    private javax.swing.JButton btnrent;
    private javax.swing.JButton btnrestore;
    private javax.swing.JButton btnscrap;
    private javax.swing.JButton btnsell;
    private javax.swing.JButton btnsort;
    private javax.swing.JButton btnstat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblforsale;
    private javax.swing.JTable tblowned;
    private javax.swing.JLabel txtmon;
    // End of variables declaration//GEN-END:variables
}
