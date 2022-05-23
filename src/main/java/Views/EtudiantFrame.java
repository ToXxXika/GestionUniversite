/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author mabro
 */
public class EtudiantFrame extends javax.swing.JFrame {

    /**
     * Creates new form EtudiantFrame
     */
    public EtudiantFrame() {
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
        jSeparator1 = new javax.swing.JSeparator();
        AbsBtn = new javax.swing.JButton();
        NotesBtn = new javax.swing.JButton();
        MoyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(23, 35, 51));

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(242, 242, 242));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        AbsBtn.setBackground(new java.awt.Color(23, 35, 51));
        AbsBtn.setForeground(new java.awt.Color(242, 242, 242));
        AbsBtn.setText("Absences");
        AbsBtn.setBorder(null);
        AbsBtn.setBorderPainted(false);
        AbsBtn.setContentAreaFilled(false);
        AbsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbsBtnMouseClicked(evt);
            }
        });

        NotesBtn.setBackground(new java.awt.Color(23, 35, 51));
        NotesBtn.setForeground(new java.awt.Color(242, 242, 242));
        NotesBtn.setText("Notes");
        NotesBtn.setBorder(null);
        NotesBtn.setBorderPainted(false);
        NotesBtn.setContentAreaFilled(false);
        NotesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotesBtnMouseClicked(evt);
            }
        });

        MoyBtn.setBackground(new java.awt.Color(23, 35, 51));
        MoyBtn.setForeground(new java.awt.Color(242, 242, 242));
        MoyBtn.setText("Moyenne");
        MoyBtn.setBorder(null);
        MoyBtn.setBorderPainted(false);
        MoyBtn.setContentAreaFilled(false);
        MoyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoyBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AbsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(NotesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(773, 773, 773))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(NotesBtn)
                .addGap(112, 112, 112)
                .addComponent(AbsBtn)
                .addGap(100, 100, 100)
                .addComponent(MoyBtn)
                .addContainerGap(117, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void NotesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotesBtnMouseClicked
        EtudiantFrameNote EFN =  new EtudiantFrameNote();
        EFN.pack();
        EFN.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NotesBtnMouseClicked

    private void AbsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbsBtnMouseClicked
        EtudiantFrameAbsences EFN =  new EtudiantFrameAbsences();
        EFN.pack();
        EFN.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AbsBtnMouseClicked

    private void MoyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoyBtnMouseClicked
              EtudiantFrameMoyenne EFN =  new EtudiantFrameMoyenne();
        EFN.pack();
        EFN.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_MoyBtnMouseClicked

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
            java.util.logging.Logger.getLogger(EtudiantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtudiantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtudiantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtudiantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtudiantFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbsBtn;
    private javax.swing.JButton MoyBtn;
    private javax.swing.JButton NotesBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
