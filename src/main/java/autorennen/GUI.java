/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorennen;

import javax.swing.*;

/**
 * @author Leon
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI(SpielCtrl spielCtrl) {
        this.spielCtrl = spielCtrl;
        initComponents();
    }

    private SpielCtrl getSpielCtrl() {
        return this.spielCtrl;
    }

    private SpielCtrl spielCtrl;
    private static int startPos = 281;

    private void aktualisieren() {
        this.jProgressBarTankRechts.setValue(spielCtrl.getRennstrecke().getAutoRechts().getTank().getTankstand());
        this.jProgressBarTankLinks.setValue(spielCtrl.getRennstrecke().getAutoLinks().getTank().getTankstand());
        this.jLabelGeschwindigkeitLinks.setText(Integer.toString(this.spielCtrl.getRennstrecke().getAutoLinks().getGeschwindigkeit()));
        this.jLabelGeschwindigkeitRechts.setText(Integer.toString(this.spielCtrl.getRennstrecke().getAutoRechts().getGeschwindigkeit()));
        int xPosL = this.autoLinks.getX();
        int xPosR = this.autoRechts.getX();
        int yPosR = startPos - this.getSpielCtrl().getRennstrecke().getAutoRechtsPos() / 2;
        this.autoRechts.setLocation(xPosR, (int) yPosR);
        int yPosL = startPos - this.getSpielCtrl().getRennstrecke().getAutoLinksPos() / 2;
        this.autoLinks.setLocation(xPosL, (int) yPosL);
        this.jLabelWetter.setText((this.spielCtrl.getRennstrecke().getWetter().isIstEsAmRegnen() ? "Regen" : "Sonnig"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        weiterButtonLinks = new javax.swing.JButton();
        weiterButtonRechts = new javax.swing.JButton();
        beschleunigenButtonLinks = new javax.swing.JButton();
        beschleunigenButtonRechts = new javax.swing.JButton();
        bremsenButtonLinks = new javax.swing.JButton();
        bremsenButtonRechts = new javax.swing.JButton();
        jProgressBarTankRechts = new javax.swing.JProgressBar(0, this.getSpielCtrl().getRennstrecke().getAutoRechts().getTank().getTankstandMaximal());
        jLabelTankRechts = new javax.swing.JLabel();
        jLabelKMHRechts = new javax.swing.JLabel();
        jTextFieldNameRechts = new javax.swing.JTextField();
        jLabelKMHLinks = new javax.swing.JLabel();
        jLabelTankLinks = new javax.swing.JLabel();
        jProgressBarTankLinks = new javax.swing.JProgressBar(0, this.getSpielCtrl().getRennstrecke().getAutoLinks().getTank().getTankstandMaximal());
        jTextFieldNameLinks = new javax.swing.JTextField();
        jLabelWetterlage = new javax.swing.JLabel();
        jLabelGeschwindigkeitLinks = new javax.swing.JLabel();
        jLabelGeschwindigkeitRechts = new javax.swing.JLabel();
        jLabelWetter = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        autoLinks = new javax.swing.JLabel();
        autoRechts = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        weiterButtonLinks.setText("weiter");
        weiterButtonLinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weiterButtonLinksActionPerformed(evt);
            }
        });

        weiterButtonRechts.setText("weiter");
        weiterButtonRechts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weiterButtonRechtsActionPerformed(evt);
            }
        });

        beschleunigenButtonLinks.setText("beschleunigen");
        beschleunigenButtonLinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beschleunigenButtonLinksActionPerformed(evt);
            }
        });

        beschleunigenButtonRechts.setText("beschleunigen");
        beschleunigenButtonRechts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beschleunigenButtonRechtsActionPerformed(evt);
            }
        });

        bremsenButtonLinks.setText("bremsen");
        bremsenButtonLinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bremsenButtonLinksActionPerformed(evt);
            }
        });

        bremsenButtonRechts.setText("bremsen");
        bremsenButtonRechts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bremsenButtonRechtsActionPerformed(evt);
            }
        });

        jProgressBarTankRechts.setValue(this.getSpielCtrl().getRennstrecke().getAutoRechts().getTank().getTankstand());
        jProgressBarTankRechts.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jProgressBarTankRechtsAncestorAdded(evt);
            }

            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }

            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabelTankRechts.setText("Tank");

        jLabelKMHRechts.setText("km / h");

        jLabelKMHLinks.setText("km / h");

        jLabelTankLinks.setText("Tank");

        jProgressBarTankLinks.setValue(this.getSpielCtrl().getRennstrecke().getAutoLinks().getTank().getTankstand());

        jTextFieldNameLinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameLinksActionPerformed(evt);
            }
        });

        jLabelWetter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        autoLinks.setForeground(new java.awt.Color(64, 64, 64));
        autoLinks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autoLinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autorennen/ressources/Auto1.png"))); // NOI18N
        autoLinks.setName(""); // NOI18N
        autoLinks.setPreferredSize(new java.awt.Dimension(64, 64));

        autoRechts.setForeground(new java.awt.Color(64, 64, 64));
        autoRechts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autoRechts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autorennen/ressources/Auto2.png"))); // NOI18N
        autoRechts.setName(""); // NOI18N
        autoRechts.setPreferredSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(autoLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(autoRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(219, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(autoRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(autoLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelGeschwindigkeitLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelKMHLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(72, 72, 72)
                                                .addComponent(jLabelWetterlage, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(beschleunigenButtonLinks)
                                                                .addComponent(weiterButtonLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(bremsenButtonLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jTextFieldNameLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jProgressBarTankLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelTankLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(59, 59, 59)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(beschleunigenButtonRechts)
                                                                .addComponent(weiterButtonRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(bremsenButtonRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(15, 15, 15))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelGeschwindigkeitRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabelKMHRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabelTankRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldNameRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jProgressBarTankRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelWetter, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelWetterlage, javax.swing.GroupLayout.DEFAULT_SIZE, 3, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jLabelWetter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldNameLinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldNameRechts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jProgressBarTankLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jProgressBarTankRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelTankRechts)
                                                        .addComponent(jLabelTankLinks))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelGeschwindigkeitLinks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelGeschwindigkeitRechts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelKMHLinks)
                                                                .addComponent(jLabelKMHRechts)))
                                                .addGap(65, 65, 65)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(weiterButtonLinks)
                                                        .addComponent(weiterButtonRechts))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(beschleunigenButtonLinks)
                                                        .addComponent(beschleunigenButtonRechts))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(bremsenButtonLinks)
                                                        .addComponent(bremsenButtonRechts)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTankangabeLinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTankangabeLinksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTankangabeLinksActionPerformed

    private void jTextFieldNameLinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameLinksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameLinksActionPerformed

    private void jTextFieldTankangabeRechtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTankangabeRechtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTankangabeRechtsActionPerformed

    private void weiterButtonLinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weiterButtonLinksActionPerformed
        spielCtrl.knopfLinksWeiterFahren();
    }//GEN-LAST:event_weiterButtonLinksActionPerformed

    private void beschleunigenButtonLinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beschleunigenButtonLinksActionPerformed
        spielCtrl.knopfLinksBeschleunigen();
    }//GEN-LAST:event_beschleunigenButtonLinksActionPerformed

    private void bremsenButtonLinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bremsenButtonLinksActionPerformed
        spielCtrl.knopfLinksBremsen();
    }//GEN-LAST:event_bremsenButtonLinksActionPerformed

    private void weiterButtonRechtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weiterButtonRechtsActionPerformed
        spielCtrl.knopfRechtsWeiterFahren();
    }//GEN-LAST:event_weiterButtonRechtsActionPerformed

    private void beschleunigenButtonRechtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beschleunigenButtonRechtsActionPerformed
        spielCtrl.knopfRechtsBeschleunigen();
    }//GEN-LAST:event_beschleunigenButtonRechtsActionPerformed

    private void bremsenButtonRechtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bremsenButtonRechtsActionPerformed
        spielCtrl.knopfRechtsBremsen();
    }//GEN-LAST:event_bremsenButtonRechtsActionPerformed

    private void jProgressBarTankRechtsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jProgressBarTankRechtsAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jProgressBarTankRechtsAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autoLinks;
    private javax.swing.JLabel autoRechts;
    private javax.swing.JButton beschleunigenButtonLinks;
    private javax.swing.JButton beschleunigenButtonRechts;
    private javax.swing.JButton bremsenButtonLinks;
    private javax.swing.JButton bremsenButtonRechts;
    private javax.swing.JLabel jLabelGeschwindigkeitLinks;
    private javax.swing.JLabel jLabelGeschwindigkeitRechts;
    private javax.swing.JLabel jLabelKMHLinks;
    private javax.swing.JLabel jLabelKMHRechts;
    private javax.swing.JLabel jLabelTankLinks;
    private javax.swing.JLabel jLabelTankRechts;
    private javax.swing.JLabel jLabelWetter;
    private javax.swing.JLabel jLabelWetterlage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBarTankLinks;
    private javax.swing.JProgressBar jProgressBarTankRechts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldNameLinks;
    private javax.swing.JTextField jTextFieldNameRechts;
    private javax.swing.JButton weiterButtonLinks;
    private javax.swing.JButton weiterButtonRechts;
    // End of variables declaration//GEN-END:variables
}
