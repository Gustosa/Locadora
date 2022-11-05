/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.locadora.telas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabri
 */
public class MenuAdm extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdm
     */
    public MenuAdm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnCadastarUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        btnRemoverUsuario = new javax.swing.JButton();
        btnCadastrarFilme = new javax.swing.JButton();
        btnAlterarFilme = new javax.swing.JButton();
        btnRemoverFilme = new javax.swing.JButton();
        btnHistoricoGeral = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de Administração");

        btnCadastarUsuario.setText("Cadastrar Usuário");
        btnCadastarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastarUsuarioActionPerformed(evt);
            }
        });

        btnAlterarUsuario.setText("Alterar Usuário");
        btnAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuarioActionPerformed(evt);
            }
        });

        btnRemoverUsuario.setText("Remover Usuário");
        btnRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverUsuarioActionPerformed(evt);
            }
        });

        btnCadastrarFilme.setText("Cadastrar Filme");
        btnCadastrarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFilmeActionPerformed(evt);
            }
        });

        btnAlterarFilme.setText("Alterar Filme");
        btnAlterarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFilmeActionPerformed(evt);
            }
        });

        btnRemoverFilme.setText("Remover Filme");
        btnRemoverFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFilmeActionPerformed(evt);
            }
        });

        btnHistoricoGeral.setText("Histórico de Aluguéis");
        btnHistoricoGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoGeralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnAlterarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(btnAlterarUsuario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemoverUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoverFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(btnHistoricoGeral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastarUsuario)
                            .addComponent(btnAlterarUsuario))
                        .addGap(93, 93, 93)
                        .addComponent(btnHistoricoGeral)
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrarFilme)
                            .addComponent(btnAlterarFilme)
                            .addComponent(btnRemoverFilme)))
                    .addComponent(btnRemoverUsuario))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnCadastarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        TelaCadastrarse tela = new TelaCadastrarse();
        tela.setVisible(true);
        
        this.setVisible(false);
    }                                                  

    private void btnAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        TelaAlterarUsuario tela = null;
        try {
            tela = new TelaAlterarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
        
        this.setVisible(false);
    }                                                 

    private void btnRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        TelaRemoverUsuario tela = null;
        try {
            tela = new TelaRemoverUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
        
        this.setVisible(false);
    }                                                 

    private void btnHistoricoGeralActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        TelaHistoricoGeral tela = new TelaHistoricoGeral();
        tela.setVisible(true);
        
        this.setVisible(false);
    }                                                 

    private void btnCadastrarFilmeActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        TelaCadastrarFilme tela = new TelaCadastrarFilme();
        tela.setVisible(true);
        
        this.setVisible(false);
    }                                                 

    private void btnAlterarFilmeActionPerformed(java.awt.event.ActionEvent evt) {                                                
        TelaAlterarFilme tela = null;
        try {
            tela = new TelaAlterarFilme();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
        
        this.setVisible(false);
    }                                               

    private void btnRemoverFilmeActionPerformed(java.awt.event.ActionEvent evt) {                                                
        TelaRemoverFilme tela = null;
        try {
            tela = new TelaRemoverFilme();
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
        
        this.setVisible(false);
    }                                               

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
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAlterarFilme;
    private javax.swing.JButton btnAlterarUsuario;
    private javax.swing.JButton btnCadastarUsuario;
    private javax.swing.JButton btnCadastrarFilme;
    private javax.swing.JButton btnHistoricoGeral;
    private javax.swing.JButton btnRemoverFilme;
    private javax.swing.JButton btnRemoverUsuario;
    // End of variables declaration                   
}
