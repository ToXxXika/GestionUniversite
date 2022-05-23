/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controllers.NoteController;
import Controllers.UserController;
import Models.Etudiants;
import Models.Personne;
import com.opencsv.CSVWriter;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabro
 */
public class Notes extends javax.swing.JFrame {

    public File csvFile = new File("src/main/java/notes.csv");
    String[] header={"NumInsc","Nom","Prenom","Note"};

    /**
     * Creates new form Notes
     */
    public Notes() {
        initComponents();
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
        jTableNote = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        MatiereTxt = new javax.swing.JTextField();
        NomTxt = new javax.swing.JTextField();
        PrenomTxt = new javax.swing.JTextField();
        TypeNoteTxt = new javax.swing.JTextField();
        NoteTxt = new javax.swing.JTextField();
        SuppBtn = new javax.swing.JButton();
        AjouterBtn1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        NumInscTxt = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        MatiereTxt2 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        NoteTxt2 = new javax.swing.JTextField();
        CalculNoteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jTableNote.setBackground(new java.awt.Color(23, 35, 51));
        jTableNote.setForeground(new java.awt.Color(255, 255, 255));
        jTableNote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Prenom", "Matiere", "Type", "Note"
            }
        ));
        jScrollPane1.setViewportView(jTableNote);

        MatiereTxt.setBackground(new java.awt.Color(23, 35, 51));
        MatiereTxt.setForeground(new java.awt.Color(255, 255, 255));
        MatiereTxt.setText("Matiere");
        MatiereTxt.setBorder(null);
        MatiereTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatiereTxtMouseClicked(evt);
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

        TypeNoteTxt.setBackground(new java.awt.Color(23, 35, 51));
        TypeNoteTxt.setForeground(new java.awt.Color(255, 255, 255));
        TypeNoteTxt.setText("Type");
        TypeNoteTxt.setBorder(null);
        TypeNoteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TypeNoteTxtMouseClicked(evt);
            }
        });

        NoteTxt.setBackground(new java.awt.Color(23, 35, 51));
        NoteTxt.setForeground(new java.awt.Color(255, 255, 255));
        NoteTxt.setText("Note");
        NoteTxt.setBorder(null);
        NoteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoteTxtMouseClicked(evt);
            }
        });

        SuppBtn.setBackground(new java.awt.Color(23, 35, 51));
        SuppBtn.setForeground(new java.awt.Color(255, 255, 255));
        SuppBtn.setText("Supprimer");
        SuppBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SuppBtnBtnClickedSupp(evt);
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

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        NumInscTxt.setBackground(new java.awt.Color(23, 35, 51));
        NumInscTxt.setForeground(new java.awt.Color(255, 255, 255));
        NumInscTxt.setText("NumInsc");
        NumInscTxt.setBorder(null);
        NumInscTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumInscTxtMouseClicked(evt);
            }
        });

        MatiereTxt2.setBackground(new java.awt.Color(23, 35, 51));
        MatiereTxt2.setForeground(new java.awt.Color(255, 255, 255));
        MatiereTxt2.setText("Matiere");
        MatiereTxt2.setBorder(null);
        MatiereTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatiereTxt2MouseClicked(evt);
            }
        });

        NoteTxt2.setBackground(new java.awt.Color(23, 35, 51));
        NoteTxt2.setForeground(new java.awt.Color(255, 255, 255));
        NoteTxt2.setText("Note");
        NoteTxt2.setBorder(null);
        NoteTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoteTxt2MouseClicked(evt);
            }
        });

        CalculNoteBtn.setBackground(new java.awt.Color(23, 35, 51));
        CalculNoteBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalculNoteBtn.setText("Calculer");
        CalculNoteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalculNoteBtnBtnClickedSupp(evt);
            }
        });
        CalculNoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculNoteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EtudiantsPaneLayout = new javax.swing.GroupLayout(EtudiantsPane);
        EtudiantsPane.setLayout(EtudiantsPaneLayout);
        EtudiantsPaneLayout.setHorizontalGroup(
            EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EtudiantsPaneLayout.createSequentialGroup()
                .addGap(0, 442, Short.MAX_VALUE)
                .addComponent(SuppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                        .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator6)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jSeparator4)
                                    .addComponent(jSeparator5)))
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(NomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(PrenomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(TypeNoteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(MatiereTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(NoteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumInscTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(NoteTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MatiereTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalculNoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(AjouterBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(568, Short.MAX_VALUE)))
        );
        EtudiantsPaneLayout.setVerticalGroup(
            EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EtudiantsPaneLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumInscTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MatiereTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(NoteTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CalculNoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EtudiantsPaneLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(EtudiantsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EtudiantsPaneLayout.createSequentialGroup()
                                .addComponent(MatiereTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(TypeNoteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(NoteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
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

    private void SideBtnEnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SideBtnEnsMouseClicked

        System.out.println("Clicked");
        Dashboard D = new Dashboard();
        D.pack();
        D.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SideBtnEnsMouseClicked

    private void MatiereTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatiereTxtMouseClicked
        // TODO add your handling code here:
        MatiereTxt.setText("");
    }//GEN-LAST:event_MatiereTxtMouseClicked

    private void NomTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomTxtMouseClicked
        // TODO add your handling code here:
        NomTxt.setText("");
    }//GEN-LAST:event_NomTxtMouseClicked

    private void PrenomTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenomTxtMouseClicked
        // TODO add your handling code here:
        PrenomTxt.setText("");
    }//GEN-LAST:event_PrenomTxtMouseClicked

    private void TypeNoteTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TypeNoteTxtMouseClicked
        // TODO add your handling code here:
        TypeNoteTxt.setText("");
    }//GEN-LAST:event_TypeNoteTxtMouseClicked

    private void NoteTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoteTxtMouseClicked
        // TODO add your handling code here:
        NoteTxt.setText("");
    }//GEN-LAST:event_NoteTxtMouseClicked

    private void SuppBtnBtnClickedSupp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuppBtnBtnClickedSupp
        // TODO add your handling code here:
    }//GEN-LAST:event_SuppBtnBtnClickedSupp

    void cleanText(){
        MatiereTxt.setText("");
        NomTxt.setText("");
        PrenomTxt.setText("");
        TypeNoteTxt.setText("");
        NoteTxt.setText("");
    }
    private void AjouterBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterBtn1ActionPerformed
        // TODO add your handling code here:
        NoteController NC = new NoteController();
         String Matiere = MatiereTxt.getText();
         String type = TypeNoteTxt.getText();
         float Note = Float.parseFloat(NoteTxt.getText());
         String Nom = NomTxt.getText();
         String Prenom = PrenomTxt.getText();
         if(NC.AjouterNote(Note, Matiere,type, Nom, Prenom)){
             JOptionPane.showMessageDialog(null, "Note Ajoutée");
             cleanText();
         }else {
             JOptionPane.showMessageDialog(null, "Note non Ajoutée");
         }
    }//GEN-LAST:event_AjouterBtn1ActionPerformed

    private void NumInscTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumInscTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NumInscTxtMouseClicked

    private void MatiereTxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatiereTxt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MatiereTxt2MouseClicked

    private void NoteTxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoteTxt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NoteTxt2MouseClicked

    private void CalculNoteBtnBtnClickedSupp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculNoteBtnBtnClickedSupp
        // TODO add your handling code here:
    }//GEN-LAST:event_CalculNoteBtnBtnClickedSupp

    private void CalculNoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculNoteBtnActionPerformed
        NoteController nc = new NoteController();


        try {
            FileWriter outputfile = new FileWriter(csvFile.getAbsoluteFile(), true);
            CSVWriter writer = new CSVWriter(outputfile);
            writer.writeNext(header);

            UserController uc = new UserController();
            Personne rs = new Personne();
             rs = uc.VerifEtudiant(Integer.parseInt(NumInscTxt.getText()));
             if(rs==null){
                 System.out.println("Etudiant introuvable");
             }  else {

                 System.out.println("CIN DE CET ETUDIANT " +rs.getCin() );
                 float Moyenne = nc.getMoyenne(rs.getCin(), MatiereTxt2.getText());
                 NoteTxt2.setText(Moyenne + "");
                 String[] data = {NumInscTxt.getText(), rs.getNom(), rs.getPrenom(), MatiereTxt2.getText(), NoteTxt2.getText()};
                 writer.writeNext(data);
                 if (nc.SaveMoyenne(Integer.parseInt(NumInscTxt.getText()), rs.getNom(), rs.getPrenom(), MatiereTxt2.getText(), Float.parseFloat(NoteTxt2.getText()))) {
                     JOptionPane.showMessageDialog(null, "Moyenne enregistrée avec succès");
                 }
             }

            writer.close();

        }catch (Exception E){
            System.out.println(E);
        }


    }//GEN-LAST:event_CalculNoteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterBtn1;
    private javax.swing.JButton CalculNoteBtn;
    private javax.swing.JPanel EtudiantsPane;
    private javax.swing.JTextField MatiereTxt;
    private javax.swing.JTextField MatiereTxt2;
    private javax.swing.JTextField NomTxt;
    private javax.swing.JTextField NoteTxt;
    private javax.swing.JTextField NoteTxt2;
    private javax.swing.JTextField NumInscTxt;
    private javax.swing.JTextField PrenomTxt;
    private javax.swing.JButton SideBtnEns;
    private javax.swing.JButton SuppBtn;
    private javax.swing.JTextField TypeNoteTxt;
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
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTableNote;
    // End of variables declaration//GEN-END:variables
}
