/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controllers.UserController;
import Models.Etudiants;
import Models.Personne;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabro
 */
public class Admin extends javax.swing.JFrame {
  public DefaultTableModel model ;
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        LoadJtable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SideBtnEns = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EtudiantsPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEtd = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        CinTxt = new javax.swing.JTextField();
        NomTxt = new javax.swing.JTextField();
        PrenomTxt = new javax.swing.JTextField();
        MailTxt = new javax.swing.JTextField();
        NumInscTxt = new javax.swing.JTextField();
        PasswordTxt = new javax.swing.JPasswordField();
        SuppBtn = new javax.swing.JButton();
        AjouterBtn1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));

        jButton1.setBackground(new java.awt.Color(23, 35, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Acceuil");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);

        jButton2.setBackground(new java.awt.Color(23, 35, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Etudiants");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);

        SideBtnEns.setBackground(new java.awt.Color(23, 35, 51));
        SideBtnEns.setForeground(new java.awt.Color(255, 255, 255));
        SideBtnEns.setText("Enseignants");
        SideBtnEns.setBorder(null);
        SideBtnEns.setBorderPainted(false);
        SideBtnEns.setContentAreaFilled(false);
        SideBtnEns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SideBtnEnsMouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(23, 35, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Statistiques");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(SideBtnEns)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jButton1)
                .addGap(48, 48, 48)
                .addComponent(jButton2)
                .addGap(39, 39, 39)
                .addComponent(SideBtnEns)
                .addGap(44, 44, 44)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(23, 35, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Poly INTL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jPanel3.setBackground(new java.awt.Color(23, 35, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mabro\\IdeaProjects\\SwingInspire\\src\\swing\\images\\icons8_Contacts_25px.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mabro\\IdeaProjects\\SwingInspire\\src\\swing\\images\\icons8_Secured_Letter_25px_2.png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 52)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("02");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel6)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(81, 81, 81))
        );

        EtudiantsPane.setBackground(new java.awt.Color(23, 35, 51));

        jTableEtd.setBackground(new java.awt.Color(23, 35, 51));
        jTableEtd.setForeground(new java.awt.Color(255, 255, 255));
        jTableEtd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cin", "NumInsc", "Nom", "Prenom", "Mail"
            }
        ));
        jScrollPane1.setViewportView(jTableEtd);
        if (jTableEtd.getColumnModel().getColumnCount() > 0) {

        }

        CinTxt.setBackground(new java.awt.Color(23, 35, 51));
        CinTxt.setForeground(new java.awt.Color(255, 255, 255));
        CinTxt.setText("Cin");
        CinTxt.setBorder(null);
        CinTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CinTxtMouseClicked(evt);
            }
        });

        NomTxt.setBackground(new java.awt.Color(23, 35, 51));
        NomTxt.setForeground(new java.awt.Color(255, 255, 255));
        NomTxt.setText("Nom");
        NomTxt.setBorder(null);
        NomTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomTxtMouseClicked(evt);
            }
        });

        PrenomTxt.setBackground(new java.awt.Color(23, 35, 51));
        PrenomTxt.setForeground(new java.awt.Color(255, 255, 255));
        PrenomTxt.setText("Prenom");
        PrenomTxt.setBorder(null);
        PrenomTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrenomTxtMouseClicked(evt);
            }
        });

        MailTxt.setBackground(new java.awt.Color(23, 35, 51));
        MailTxt.setForeground(new java.awt.Color(255, 255, 255));
        MailTxt.setText("Email");
        MailTxt.setBorder(null);
        MailTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MailTxtMouseClicked(evt);
            }
        });

        NumInscTxt.setBackground(new java.awt.Color(23, 35, 51));
        NumInscTxt.setForeground(new java.awt.Color(255, 255, 255));
        NumInscTxt.setText("NumInsc");
        NumInscTxt.setBorder(null);
        NumInscTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumInscTxtMouseClicked(evt);
            }
        });

        PasswordTxt.setBackground(new java.awt.Color(23, 35, 51));
        PasswordTxt.setForeground(new java.awt.Color(255, 255, 255));
        PasswordTxt.setText("jPasswordField1");
        PasswordTxt.setBorder(null);
        PasswordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordTxtMouseClicked(evt);
            }
        });

        SuppBtn.setBackground(new java.awt.Color(23, 35, 51));
        SuppBtn.setForeground(new java.awt.Color(255, 255, 255));
        SuppBtn.setText("Supprimer");

        SuppBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnClickedSupp(evt);
            }
        });

        AjouterBtn1.setBackground(new java.awt.Color(23, 35, 51));
        AjouterBtn1.setForeground(new java.awt.Color(255, 255, 255));
        AjouterBtn1.setText("Ajouter"); // NOI18N
        AjouterBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterBtn1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(23, 35, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout EtudiantsPaneLayout = new javax.swing.GroupLayout(EtudiantsPane);
        EtudiantsPane.setLayout(EtudiantsPaneLayout);
        EtudiantsPaneLayout.setHorizontalGroup(
            EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(NumInscTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                        .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator7)
                                    .addComponent(jSeparator6)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jSeparator4)
                                    .addComponent(jSeparator5)))
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(CinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(NomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(PrenomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(MailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EtudiantsPaneLayout.createSequentialGroup()
                .addGap(0, 412, Short.MAX_VALUE)
                .addComponent(SuppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
            .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(AjouterBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(568, Short.MAX_VALUE)))
        );
        EtudiantsPaneLayout.setVerticalGroup(
            EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addComponent(CinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(NomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(PrenomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(MailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0)
                .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NumInscTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(SuppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EtudiantsPaneLayout.createSequentialGroup()
                    .addContainerGap(441, Short.MAX_VALUE)
                    .addComponent(AjouterBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(EtudiantsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtudiantsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClickedSupp(java.awt.event.MouseEvent evt){
            System.out.println(jTableEtd.rowAtPoint(evt.getPoint()));
            if(jTableEtd.rowAtPoint(evt.getPoint()) != -1){
                UserController uc = new UserController();
                if(uc.DeletePersonne(jTableEtd.getValueAt(jTableEtd.rowAtPoint(evt.getPoint()), 0).toString())){
                    JOptionPane.showMessageDialog(null, "Suppression effectuée avec succès");
                    model.removeRow(jTableEtd.rowAtPoint(evt.getPoint()));
                    LoadJtable();
                }else JOptionPane.showMessageDialog(null, "Suppression échouée");


            }
    }
    private void CinTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinTxtMouseClicked
        // TODO add your handling code here:
        CinTxt.setText("");
    }//GEN-LAST:event_CinTxtMouseClicked

    private void NomTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomTxtMouseClicked
        // TODO add your handling code here:
        NomTxt.setText("");
    }//GEN-LAST:event_NomTxtMouseClicked

    private void PrenomTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenomTxtMouseClicked
        // TODO add your handling code here:
         PrenomTxt.setText("");
    }//GEN-LAST:event_PrenomTxtMouseClicked

    private void MailTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MailTxtMouseClicked
        // TODO add your handling code here:
        MailTxt.setText("");
    }//GEN-LAST:event_MailTxtMouseClicked

    private void PasswordTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTxtMouseClicked
        // TODO add your handling code here:
        PasswordTxt.setText("");
    }//GEN-LAST:event_PasswordTxtMouseClicked

    private void NumInscTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumInscTxtMouseClicked
        // TODO add your handling code here:
        NumInscTxt.setText("");
    }//GEN-LAST:event_NumInscTxtMouseClicked

    public void  LoadJtable(){
        jTableEtd.clearSelection();
        UserController userController = new UserController();
        List<Personne> personnes = new ArrayList<>();
        personnes =userController.getAllPersonne();
         model = (DefaultTableModel) jTableEtd.getModel();
        Object rowData[] = new Object[20];
        for(int i =0;i<personnes.size();i++){
            rowData[0] = personnes.get(i).getCin();
            rowData[2] = personnes.get(i).getNom();
            rowData[3] = personnes.get(i).getPrenom();
            rowData[4] = personnes.get(i).getMail();
            System.out.println("Hello");
            model.addRow(rowData);
        }
        
    }

    private void AjouterBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterBtn1ActionPerformed
        // TODO add your handling code here:
                 Personne personne = new Personne();
        UserController userController = new UserController();
        personne.setCin(CinTxt.getText());
        personne.setNom(NomTxt.getText());
        personne.setPrenom(PrenomTxt.getText());
        personne.setMail(MailTxt.getText());
        personne.setPassword(PasswordTxt.getText());

        personne.setRole("Etudiant");
        if(userController.SignIn(personne,Integer.parseInt(NumInscTxt.getText()),0)){

            JOptionPane.showMessageDialog(null, "Etudiant ajouté avec succès");
            CinTxt.setText("Cin");
            MailTxt.setText("Email");
            PasswordTxt.setText("*****");
            NomTxt.setText("Nom");
            PrenomTxt.setText("Prenom");
            NumInscTxt.setText("NumInsc");
            LoadJtable();
        }else {
            JOptionPane.showMessageDialog(null, "Etudiant non ajouté");
        }
    }//GEN-LAST:event_AjouterBtn1ActionPerformed

    private void SideBtnEnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SideBtnEnsMouseClicked
     
               System.out.println("Clicked");
               Dashboard D = new Dashboard();
               D.pack();
               D.setVisible(true);
               this.dispose();
    }//GEN-LAST:event_SideBtnEnsMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowOpened
  
  
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {


                new Admin().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterBtn1;
    private javax.swing.JTextField CinTxt;
    private javax.swing.JPanel EtudiantsPane;
    private javax.swing.JTextField MailTxt;
    private javax.swing.JTextField NomTxt;
    private javax.swing.JTextField NumInscTxt;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JTextField PrenomTxt;
    private javax.swing.JButton SideBtnEns;
    private javax.swing.JButton SuppBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTableEtd;
    // End of variables declaration//GEN-END:variables
}
