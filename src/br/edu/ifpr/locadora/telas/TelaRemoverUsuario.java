/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.locadora.telas;

import br.edu.ifpr.locadora.DAOs.UsuarioDAO;
import br.edu.ifpr.locadora.entities.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fabri
 */
public class TelaRemoverUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaRemoverUsuario
     */
    public TelaRemoverUsuario() throws SQLException {
        initComponents();
        
        UsuarioDAO dao = new UsuarioDAO();
        ArrayList<Usuario> usuarios = dao.selecionarUsuario();
        
        for (int i = 0; i < usuarios.size(); i++) {
            cmbRemoverUsuario.addItem(usuarios.get(i));
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

        lblUsuario = new javax.swing.JLabel();
        btnRemoverUsuario = new javax.swing.JButton();
        btnMenuAdm = new javax.swing.JButton();
        usuarioNomeLBL = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        cmbRemoverUsuario = new javax.swing.JComboBox<>();
        loginUsuarioLBL = new javax.swing.JLabel();
        lblLoginUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remover Usuário");

        lblUsuario.setText("Selecione um usuário:");

        btnRemoverUsuario.setText("Remover Usuário");
        btnRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverUsuarioActionPerformed(evt);
            }
        });

        btnMenuAdm.setText("Voltar");
        btnMenuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAdmActionPerformed(evt);
            }
        });

        usuarioNomeLBL.setText("Nome do Usuário:");

        lblNomeUsuario.setText(" ");

        cmbRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRemoverUsuarioActionPerformed(evt);
            }
        });

        loginUsuarioLBL.setText("Login do Usuário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuarioNomeLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(cmbRemoverUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginUsuarioLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenuAdm))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(lblLoginUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemoverUsuario)
                                .addGap(11, 11, 11)))))
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(cmbRemoverUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioNomeLBL)
                    .addComponent(lblNomeUsuario))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUsuarioLBL)
                    .addComponent(lblLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverUsuario)
                    .addComponent(btnMenuAdm))
                .addGap(119, 119, 119))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRemoverUsuarioActionPerformed
        Usuario usuarioSelect = (Usuario) cmbRemoverUsuario.getSelectedItem();
        
        lblNomeUsuario.setText(usuarioSelect.getNome());
        lblLoginUsuario.setText(usuarioSelect.getLogin());
    }//GEN-LAST:event_cmbRemoverUsuarioActionPerformed

    private void btnRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverUsuarioActionPerformed
        Usuario usuarioSelect = (Usuario) cmbRemoverUsuario.getSelectedItem();
        
        UsuarioDAO dao = new UsuarioDAO();
        
        try {
            dao.removerUsuario(usuarioSelect);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRemoverUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "Usuário removido! ");
        
        MenuAdm tela = new MenuAdm();
        tela.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnRemoverUsuarioActionPerformed

    private void btnMenuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAdmActionPerformed
        MenuAdm tela = new MenuAdm();
        tela.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuAdmActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRemoverUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaRemoverUsuario().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaRemoverUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuAdm;
    private javax.swing.JButton btnRemoverUsuario;
    private javax.swing.JComboBox<Usuario> cmbRemoverUsuario;
    private javax.swing.JLabel lblLoginUsuario;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel loginUsuarioLBL;
    private javax.swing.JLabel usuarioNomeLBL;
    // End of variables declaration//GEN-END:variables
}
