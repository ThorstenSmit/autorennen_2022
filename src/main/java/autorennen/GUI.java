/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorennen;

/**
 *
 * @author Leon
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }
    private SpielCtrl spielCtrl;

    public void setSpielCtrl(SpielCtrl spielCtrl) {
        this.spielCtrl = spielCtrl;
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
        jTextFieldTankangabeRechts = new javax.swing.JTextField();
        jProgressBarTankRechts = new javax.swing.JProgressBar(0, spielCtrl.getRennstrecke().getAutoRechts().getTank().getTankstandMaximal());
        jLabelTankRechts = new javax.swing.JLabel();
        jLabelKMHRechts = new javax.swing.JLabel();
        jTextFieldNameRechts = new javax.swing.JTextField();
        jTextFieldTankangabeLinks = new javax.swing.JTextField();
        jLabelKMHLinks = new javax.swing.JLabel();
        jLabelTankLinks = new javax.swing.JLabel();
        jProgressBarTankLinks = new javax.swing.JProgressBar(0, spielCtrl.getRennstrecke().getAutoLinks().getTank().getTankstandMaximal());
        jTextFieldNameLinks = new javax.swing.JTextField();
        jTextFieldWetterlage = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();

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

        jTextFieldTankangabeRechts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTankangabeRechtsActionPerformed(evt);
            }
        });

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

        jTextFieldTankangabeLinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTankangabeLinksActionPerformed(evt);
            }
        });

        jLabelKMHLinks.setText("km / h");

        jLabelTankLinks.setText("Tank");

        jTextFieldNameLinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameLinksActionPerformed(evt);
            }
        });

        jTextFieldWetterlage.setText("Wetterlage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldTankangabeLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelKMHLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldWetterlage, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldNameLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBarTankLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTankLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(beschleunigenButtonLinks)
                            .addComponent(weiterButtonLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bremsenButtonLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(218, 218, 218)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(beschleunigenButtonRechts)
                                .addComponent(weiterButtonRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bremsenButtonRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldTankangabeRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelTankRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabelKMHRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNameRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBarTankRechts, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldWetterlage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTankangabeLinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKMHLinks)
                            .addComponent(jTextFieldTankangabeRechts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKMHRechts))
                        .addGap(62, 62, 62)
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
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
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
    private javax.swing.JButton beschleunigenButtonLinks;
    private javax.swing.JButton beschleunigenButtonRechts;
    private javax.swing.JButton bremsenButtonLinks;
    private javax.swing.JButton bremsenButtonRechts;
    private javax.swing.JLabel jLabelKMHLinks;
    private javax.swing.JLabel jLabelKMHRechts;
    private javax.swing.JLabel jLabelTankLinks;
    private javax.swing.JLabel jLabelTankRechts;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBarTankLinks;
    private javax.swing.JProgressBar jProgressBarTankRechts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldNameLinks;
    private javax.swing.JTextField jTextFieldNameRechts;
    private javax.swing.JTextField jTextFieldTankangabeLinks;
    private javax.swing.JTextField jTextFieldTankangabeRechts;
    private javax.swing.JTextField jTextFieldWetterlage;
    private javax.swing.JButton weiterButtonLinks;
    private javax.swing.JButton weiterButtonRechts;
    // End of variables declaration//GEN-END:variables
}
