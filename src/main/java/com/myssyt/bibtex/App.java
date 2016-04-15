package com.myssyt.bibtex;

import javax.swing.table.DefaultTableModel;

public class App extends javax.swing.JFrame {
    private ViiteManageri manageri;
    private DefaultTableModel model;

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        manageri = new ViiteManageri();
        lMessage.setText(manageri.lataaViitteet());
        model = (DefaultTableModel) tblReferences.getModel();
        for(Viite viite : manageri.getViitteet()) {
            model.addRow(new Object[] {
                viite.getAuthor(), 
                viite.getTitle(),
                ((Artikkeli) viite).getJournal(), 
                viite.getYear()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableScrollPane = new javax.swing.JScrollPane();
        tblReferences = new javax.swing.JTable();
        contPanel = new javax.swing.JPanel();
        lAuthor = new javax.swing.JLabel();
        lTitle = new javax.swing.JLabel();
        lJournal = new javax.swing.JLabel();
        lYear = new javax.swing.JLabel();
        tfAuthor = new javax.swing.JTextField();
        tfTitle = new javax.swing.JTextField();
        tfJournal = new javax.swing.JTextField();
        tfYear = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        lMessage = new javax.swing.JLabel();
        lType = new javax.swing.JLabel();
        bSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(785, 485));
        setResizable(false);

        tblReferences.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Author", "Title", "Journal", "Year"
            }
        ));
        tblReferences.setFillsViewportHeight(true);
        tblReferences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReferencesMouseClicked(evt);
            }
        });
        tableScrollPane.setViewportView(tblReferences);

        lAuthor.setText("Author");

        lTitle.setText("Title");

        lJournal.setText("Journal");

        lYear.setText("Year");

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        lMessage.setForeground(new java.awt.Color(255, 0, 0));

        lType.setText("Bibtex app v1.0");

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contPanelLayout = new javax.swing.GroupLayout(contPanel);
        contPanel.setLayout(contPanelLayout);
        contPanelLayout.setHorizontalGroup(
            contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contPanelLayout.createSequentialGroup()
                .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lAuthor)
                            .addComponent(lTitle)
                            .addComponent(lJournal)
                            .addComponent(lYear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAuthor)
                            .addComponent(tfTitle)
                            .addComponent(tfJournal)
                            .addGroup(contPanelLayout.createSequentialGroup()
                                .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(contPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contPanelLayout.createSequentialGroup()
                                .addComponent(bAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSave)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(contPanelLayout.createSequentialGroup()
                                .addComponent(lType, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        contPanelLayout.setVerticalGroup(
            contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAuthor)
                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTitle)
                    .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lJournal)
                    .addComponent(tfJournal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lYear)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd)
                    .addComponent(bUpdate)
                    .addComponent(bDelete)
                    .addComponent(bSave))
                .addGap(18, 18, 18)
                .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMessage)
                    .addComponent(lType))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableScrollPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        lMessage.setText("");
        String errorMessage = "";
        String formatErrorMessage = "";
        String author = tfAuthor.getText();
        String title = tfTitle.getText();
        String journal = tfJournal.getText();
        String year = tfYear.getText();
        if (author.trim().equals("")) {
            errorMessage += "Author, ";
        }
        if (title.trim().equals("")) {
            errorMessage += "Title, ";
        }
        if (journal.trim().equals("")) {
            errorMessage += "Journal, ";
        }
        if (year.trim().equals("")) {
            errorMessage += "Year, ";
        } else if (!year.matches ("[0-9]+")) {
            formatErrorMessage += "Year must contain only numbers. ";
        }
        if (errorMessage.equals("") && formatErrorMessage.equals("")) {
            model.addRow(new Object[] {
                author,
                title,
                journal,
                year
            });
            manageri.lisaaArtikkeli(journal, title, author, "julkaisija", Integer.parseInt(year));
        } else if (!errorMessage.equals("")) {
            lMessage.setText(formatErrorMessage + errorMessage + "can't be blank!");
        } else {
            lMessage.setText(formatErrorMessage);
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void tblReferencesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReferencesMouseClicked
        int row = tblReferences.getSelectedRow();
        if (row != -1) {
            tfAuthor.setText(model.getValueAt(row, 0).toString());
            tfTitle.setText(model.getValueAt(row, 1).toString());
            tfJournal.setText(model.getValueAt(row, 2).toString());
            tfYear.setText(model.getValueAt(row, 3).toString());
        }
    }//GEN-LAST:event_tblReferencesMouseClicked

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        lMessage.setText("");
        String errorMessage = "";
        String formatErrorMessage = "";
        String author = tfAuthor.getText();
        String title = tfTitle.getText();
        String journal = tfJournal.getText();
        String year = tfYear.getText();
        int row = tblReferences.getSelectedRow();
        
        if (row == -1) {
            if (tblReferences.getRowCount() == 0) {
                lMessage.setText("Table is empty.");
            } else {
                lMessage.setText("You must select a reference.");
            }
        } else {
            if (author.trim().equals("")) {
                errorMessage += "Author, ";
            }
            if (title.trim().equals("")) {
                errorMessage += "Title, ";
            }
            if (journal.trim().equals("")) {
                errorMessage += "Journal, ";
            }
            if (year.trim().equals("")) {
                errorMessage += "Year, ";
            } else if (!year.matches ("[0-9]+")) {
                formatErrorMessage += "Year must contain only numbers. ";
            }
            if (errorMessage.equals("") && formatErrorMessage.equals("")) {
                model.setValueAt(author, row, 0);
                model.setValueAt(title, row, 1);
                model.setValueAt(journal, row, 2);
                model.setValueAt(year, row, 3);
                manageri.getViitteet().set(row, new Artikkeli(journal, title, author, "julkaisija", Integer.parseInt(year)));
            } else if (!errorMessage.equals("")) { 
                lMessage.setText(formatErrorMessage + errorMessage + "can't be blank!");
            } else {
                lMessage.setText(formatErrorMessage);
            }
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        lMessage.setText("");
        int row = tblReferences.getSelectedRow();
        if (row == -1) {
            if (tblReferences.getRowCount() == 0) {
                lMessage.setText("Table is empty.");
            } else {
                lMessage.setText("You must select a refenrence.");
            }
        } else {
            model.removeRow(row);
            manageri.getViitteet().remove(row);
        } 
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        if (!manageri.getViitteet().isEmpty()) {
            lMessage.setText(manageri.tallennaViitteet());
        }
    }//GEN-LAST:event_bSaveActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bUpdate;
    private javax.swing.JPanel contPanel;
    private javax.swing.JLabel lAuthor;
    private javax.swing.JLabel lJournal;
    private javax.swing.JLabel lMessage;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lType;
    private javax.swing.JLabel lYear;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTable tblReferences;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfJournal;
    private javax.swing.JTextField tfTitle;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables
}