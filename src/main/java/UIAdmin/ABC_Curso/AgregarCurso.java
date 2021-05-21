/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIAdmin.ABC_Curso;

import UIAdmin.ABC_Usuario.*;
import UIAdmin.ABC_Edificio.*;
import implementacion.EstructuraGeneral;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import objetos.Estudiante;
import objetos.Usuario;



/**
 *
 * @author erikssonherlo
 */
public class AgregarCurso extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public AgregarCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        instruccionesUsuario = new javax.swing.JLabel();
        textoCodigo = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        instruccionesUsuario1 = new javax.swing.JLabel();
        instruccionesUsuario2 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        instruccionesUsuario3 = new javax.swing.JLabel();
        instruccionesUsuario4 = new javax.swing.JLabel();
        textoSemestre = new javax.swing.JTextField();
        textoCreditos = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoMini.png"))); // NOI18N
        logo.setText("Logo");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 130));

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 40)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 1, 1));
        titulo.setText("AGREGAR CURSO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 380, 53));

        instruccionesUsuario.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario.setText("Código:");
        getContentPane().add(instruccionesUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 140, 30));

        textoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCodigoActionPerformed(evt);
            }
        });
        textoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(textoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 250, 30));

        agregar.setBackground(new java.awt.Color(43, 46, 46));
        agregar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        agregar.setForeground(new java.awt.Color(250, 250, 244));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 180, 40));

        instruccionesUsuario1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario1.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario1.setText("Ingrese la información que se le solicita:");
        getContentPane().add(instruccionesUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 390, 30));

        instruccionesUsuario2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario2.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario2.setText("Creditos:");
        getContentPane().add(instruccionesUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 120, 30));

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 250, 30));

        instruccionesUsuario3.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario3.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario3.setText("Semestre:");
        getContentPane().add(instruccionesUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 160, 30));

        instruccionesUsuario4.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario4.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario4.setText("Nombre:");
        getContentPane().add(instruccionesUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 120, 30));

        textoSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSemestreActionPerformed(evt);
            }
        });
        textoSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoSemestreKeyTyped(evt);
            }
        });
        getContentPane().add(textoSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 250, 30));

        textoCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCreditosActionPerformed(evt);
            }
        });
        textoCreditos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoCreditosKeyTyped(evt);
            }
        });
        getContentPane().add(textoCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 250, 30));

        fondo.setBackground(new java.awt.Color(59, 55, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        fondo.setText("Fondo General");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCurso().setVisible(true);
            }
        });
    }
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
       try
        {
            int id = Integer.parseInt(textoCodigo.getText());
            String nombre = textoNombre.getText().trim();
            int semestre = Integer.parseInt(textoSemestre.getText());
            int creditos = Integer.parseInt(textoCreditos.getText());
            
            if (!nombre.equals(""))
            {
                if(EstructuraGeneral.agregarCurso(id, nombre, semestre, creditos))
                {
                    JOptionPane.showMessageDialog(this, "Se ha agregado el curso de " + nombre + " correctamente. ","Completado",JOptionPane.INFORMATION_MESSAGE);
                    textoCodigo.setText("");
                    textoNombre.setText("");
                    textoSemestre.setText("");
                    textoCreditos.setText("");
                    
                    EstructuraGeneral.getListaCursos().mostrarDatos();
                } else
                {
                    JOptionPane.showMessageDialog(this, "No se ha agregado al curso " + id + " porque este codigo ya existe. ","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else
            {
                JOptionPane.showMessageDialog(this, "Los campos estan incompletos","Error",JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "No ingreso los datos correctamente","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void textoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCodigoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textoCodigoActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCodigoKeyTyped
    if(!Character.isDigit(evt.getKeyChar())){
       evt.consume();
   } 
    }//GEN-LAST:event_textoCodigoKeyTyped

    private void textoSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSemestreActionPerformed

    private void textoSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoSemestreKeyTyped
    if(!Character.isDigit(evt.getKeyChar())){
       evt.consume();
   }         // TODO add your handling code here:
    }//GEN-LAST:event_textoSemestreKeyTyped

    private void textoCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCreditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCreditosActionPerformed

    private void textoCreditosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCreditosKeyTyped
if(!Character.isDigit(evt.getKeyChar())){
       evt.consume();
   }         // TODO add your handling code here:
    }//GEN-LAST:event_textoCreditosKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregar;
    public javax.swing.JLabel fondo;
    public javax.swing.JLabel instruccionesUsuario;
    public javax.swing.JLabel instruccionesUsuario1;
    public javax.swing.JLabel instruccionesUsuario2;
    public javax.swing.JLabel instruccionesUsuario3;
    public javax.swing.JLabel instruccionesUsuario4;
    public javax.swing.JLabel logo;
    public javax.swing.JTextField textoCodigo;
    public javax.swing.JTextField textoCreditos;
    public javax.swing.JTextField textoNombre;
    public javax.swing.JTextField textoSemestre;
    public javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
