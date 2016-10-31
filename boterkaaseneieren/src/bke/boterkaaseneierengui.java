package bke;

import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class boterkaaseneierengui extends javax.swing.JFrame {
    



    private String wienszet = "X";

    public boterkaaseneierengui() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    private void wienszetishet() {
        if (wienszet.equalsIgnoreCase("X")) {
            wienszet = "O";
        } else {
            wienszet = "X";
        }
    }

    private void Xwint() {
        JOptionPane.showMessageDialog(this,
                "Speler 1 Wint",
                "Winnaar",
                JOptionpane.INFORMATION_MESSAGE);
        reset();
    }

    private void Owint() {
        JOptionPane.showMessageDialog(this,
                "Speler 2 Wint",
                "Winaar",
                JOptionpane.INFORMATION_MESSAGE);
        reset();
    }

    private void noWin() {
        JOptionPane.showMessageDialog(this,
                "Geen winnaar!",
                "",
                JOptionpane.INFORMATION_MESSAGE);
        reset();
    }

    private void reset() {
        knop1.setText(" ");
        knop2.setText(" ");
        knop3.setText(" ");
        knop4.setText(" ");
        knop5.setText(" ");
        knop6.setText(" ");
        knop7.setText(" ");
        knop8.setText(" ");
        knop9.setText(" ");
    }

    private void wiewint() {
        String hokjeeen = knop1.getText();
        String hokjetwee = knop2.getText();
        String hokjedrie = knop3.getText();
        String hokjevier = knop4.getText();
        String hokjevijf = knop5.getText();
        String hokjezes = knop6.getText();
        String hokjezeven = knop7.getText();
        String hokjeacht = knop8.getText();
        String hokjenegen = knop9.getText();

        
       
        if (hokjeeen == "X" && hokjetwee == "X" && hokjedrie == "X") {
            Xwint();
        }
        if (hokjevier == "X" && hokjevijf == "X" && hokjezes == "X") {
            Xwint();
        }

        if (hokjezeven == "X" && hokjeacht == "X" && hokjenegen == "X") {
            Xwint();
        }
        if (hokjeeen == "X" && hokjevier == "X" && hokjezeven == "X") {
            Xwint();
        }
        if (hokjetwee == "X" && hokjevijf == "X" && hokjeacht == "X") {
            Xwint();
        }
        if (hokjedrie == "X" && hokjezes == "X" && hokjenegen == "X") {
            Xwint();
        }
        if (hokjeeen == "X" && hokjevijf == "X" && hokjenegen == "X") {
            Xwint();
        }
        if (hokjedrie == "X" && hokjevijf == "X" && hokjezeven == "X") {
            Xwint();
        }
        if (hokjeeen == "O" && hokjetwee == "O" && hokjedrie == "O") {
            Owint();
        }
        if (hokjevier == "O" && hokjevijf == "O" && hokjezes == "O") {
            Owint();
        }
        if (hokjezeven == "O" && hokjeacht == "O" && hokjenegen == "O") {
            Owint();
        }
        if (hokjeeen == "O" && hokjevier == "O" && hokjezeven == "O") {
            Owint();
        }
        if (hokjetwee == "O" && hokjevijf == "O" && hokjeacht == "O") {
            Owint();
        }
        if (hokjedrie == "O" && hokjezes == "O" && hokjenegen == "O") {
            Owint();
        }
        if (hokjeeen == "O" && hokjevijf == "O" && hokjenegen == "O") {
            Owint();
        }
        if (hokjedrie == "O" && hokjevijf == "O" && hokjezeven == "O") {
            Owint();
        }
        if ((hokjeeen == "O" || hokjeeen == "X") && (hokjetwee == "X" ||hokjetwee == "O") && (hokjedrie == "O"|| hokjedrie == "X") && (hokjevier == "O" || hokjevier == "X") && (hokjevijf == "O" || hokjevijf == "X") &&
                (hokjezes == "O" || hokjezes == "X") &&(hokjezeven == "O" || hokjezeven == "X") && (hokjeacht == "O" || hokjeacht == "X") && (hokjenegen == "O" || hokjenegen == "X")){
            noWin();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gridholder = new javax.swing.JPanel();
        hokje1 = new javax.swing.JPanel();
        knop1 = new javax.swing.JButton();
        hokje2 = new javax.swing.JPanel();
        knop2 = new javax.swing.JButton();
        hokje3 = new javax.swing.JPanel();
        knop3 = new javax.swing.JButton();
        hokje4 = new javax.swing.JPanel();
        knop4 = new javax.swing.JButton();
        hokje5 = new javax.swing.JPanel();
        knop5 = new javax.swing.JButton();
        hokje6 = new javax.swing.JPanel();
        knop6 = new javax.swing.JButton();
        hokje7 = new javax.swing.JPanel();
        knop7 = new javax.swing.JButton();
        hokje8 = new javax.swing.JPanel();
        knop8 = new javax.swing.JButton();
        hokje9 = new javax.swing.JPanel();
        knop9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("placeholde for score");
        jPanel3.add(jLabel1, java.awt.BorderLayout.PAGE_END);

        gridholder.setBackground(new java.awt.Color(204, 204, 204));
        gridholder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        hokje1.setBackground(new java.awt.Color(255, 255, 255));
        hokje1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hokje1.setLayout(new java.awt.BorderLayout());

        knop1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        knop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knop1ActionPerformed(evt);
            }
        });
        hokje1.add(knop1, java.awt.BorderLayout.CENTER);

        gridholder.add(hokje1);

        hokje2.setBackground(new java.awt.Color(255, 255, 255));
        hokje2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hokje2.setLayout(new java.awt.BorderLayout());

        knop2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        knop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knop2ActionPerformed(evt);
            }
        });
        hokje2.add(knop2, java.awt.BorderLayout.CENTER);

        gridholder.add(hokje2);

        hokje3.setBackground(new java.awt.Color(255, 255, 255));
        hokje3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hokje3.setLayout(new java.awt.BorderLayout());

        knop3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        knop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knop3ActionPerformed(evt);
            }
        });
        hokje3.add(knop3, java.awt.BorderLayout.CENTER);

        gridholder.add(hokje3);

        hokje4.setBackground(new java.awt.Color(255, 255, 255));
        hokje4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hokje4.setLayout(new java.awt.BorderLayout());

        knop4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        knop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knop4ActionPerformed(evt);
            }
        });
        hokje4.add(knop4, java.awt.BorderLayout.CENTER);

        gridholder.add(hokje4);

        hokje5.setBackground(new java.awt.Color(255, 255, 255));
        hokje5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hokje5.setLayout(new java.awt.BorderLayout());

        knop5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        knop5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knop5ActionPerformed(evt);
            }
        });
        hokje5.add(knop5, java.awt.BorderLayout.CENTER);

        gridholder.add(hokje5);

        hokje6.setBackground(new java.awt.Color(255, 255, 255));
        hokje6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hokje6.setLayout(new java.awt.BorderLayout());

        knop6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        knop6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knop6ActionPerformed(evt);
            }
        });
        hokje6.add(knop6, java.awt.BorderLayout.CENTER);

        gridholder.add(hokje6);

        hokje7.setBackground(new java.awt.Color(255, 255, 255));
        hokje7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hokje7.setLayout(new java.awt.BorderLayout());

        knop7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        knop7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knop7ActionPerformed(evt);
            }
        });
        hokje7.add(knop7, java.awt.BorderLayout.CENTER);

        gridholder.add(hokje7);

        hokje8.setBackground(new java.awt.Color(255, 255, 255));
        hokje8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hokje8.setLayout(new java.awt.BorderLayout());

        knop8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        knop8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knop8ActionPerformed(evt);
            }
        });
        hokje8.add(knop8, java.awt.BorderLayout.CENTER);

        gridholder.add(hokje8);

        hokje9.setBackground(new java.awt.Color(255, 255, 255));
        hokje9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hokje9.setLayout(new java.awt.BorderLayout());

        knop9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        knop9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knop9ActionPerformed(evt);
            }
        });
        hokje9.add(knop9, java.awt.BorderLayout.CENTER);

        gridholder.add(hokje9);

        jPanel3.add(gridholder, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void knop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knop1ActionPerformed
        knop1.setText(wienszet);
        if (wienszet.equalsIgnoreCase("X")) {
            knop1.setForeground(Color.red);
        } else {
            knop1.setForeground(Color.blue);
        }
        wienszetishet();

    }//GEN-LAST:event_knop1ActionPerformed

    private void knop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knop4ActionPerformed
        knop4.setText(wienszet);
        if (wienszet.equalsIgnoreCase("X")) {
            knop4.setForeground(Color.red);
        } else {
            knop4.setForeground(Color.blue);
        }
        wienszetishet();
        wiewint();
    }//GEN-LAST:event_knop4ActionPerformed

    private void knop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knop2ActionPerformed
        knop2.setText(wienszet);
        if (wienszet.equalsIgnoreCase("X")) {
            knop2.setForeground(Color.red);
        } else {
            knop2.setForeground(Color.blue);
        }
        wienszetishet();
        wiewint();
    }//GEN-LAST:event_knop2ActionPerformed

    private void knop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knop3ActionPerformed
        knop3.setText(wienszet);
        if (wienszet.equalsIgnoreCase("X")) {
            knop3.setForeground(Color.red);
        } else {
            knop3.setForeground(Color.blue);
        }
        wienszetishet();
        wiewint();
    }//GEN-LAST:event_knop3ActionPerformed

    private void knop5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knop5ActionPerformed
        knop5.setText(wienszet);
        if (wienszet.equalsIgnoreCase("X")) {
            knop5.setForeground(Color.red);
        } else {
            knop5.setForeground(Color.blue);
        }
        wienszetishet();
        wiewint();
    }//GEN-LAST:event_knop5ActionPerformed

    private void knop6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knop6ActionPerformed
        knop6.setText(wienszet);
        if (wienszet.equalsIgnoreCase("X")) {
            knop6.setForeground(Color.red);
        } else {
            knop6.setForeground(Color.blue);
        }
        wienszetishet();
        wiewint();
    }//GEN-LAST:event_knop6ActionPerformed

    private void knop7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knop7ActionPerformed
        knop7.setText(wienszet);
        if (wienszet.equalsIgnoreCase("X")) {
            knop7.setForeground(Color.red);
        } else {
            knop7.setForeground(Color.blue);
        }
        wienszetishet();
        wiewint();
    }//GEN-LAST:event_knop7ActionPerformed

    private void knop8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knop8ActionPerformed
        knop8.setText(wienszet);
        if (wienszet.equalsIgnoreCase("X")) {
            knop8.setForeground(Color.red);
        } else {
            knop8.setForeground(Color.blue);
        }
        wienszetishet();
        wiewint();
    }//GEN-LAST:event_knop8ActionPerformed

    private void knop9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knop9ActionPerformed
        knop9.setText(wienszet);
        if (wienszet.equalsIgnoreCase("X")) {
            knop9.setForeground(Color.red);
        } else {
            knop9.setForeground(Color.blue);
        }
        wienszetishet();
        wiewint();
    }//GEN-LAST:event_knop9ActionPerformed

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
            java.util.logging.Logger.getLogger(boterkaaseneierengui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(boterkaaseneierengui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(boterkaaseneierengui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(boterkaaseneierengui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new boterkaaseneierengui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gridholder;
    private javax.swing.JPanel hokje1;
    private javax.swing.JPanel hokje2;
    private javax.swing.JPanel hokje3;
    private javax.swing.JPanel hokje4;
    private javax.swing.JPanel hokje5;
    private javax.swing.JPanel hokje6;
    private javax.swing.JPanel hokje7;
    private javax.swing.JPanel hokje8;
    private javax.swing.JPanel hokje9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton knop1;
    private javax.swing.JButton knop2;
    private javax.swing.JButton knop3;
    private javax.swing.JButton knop4;
    private javax.swing.JButton knop5;
    private javax.swing.JButton knop6;
    private javax.swing.JButton knop7;
    private javax.swing.JButton knop8;
    private javax.swing.JButton knop9;
    // End of variables declaration//GEN-END:variables

}
