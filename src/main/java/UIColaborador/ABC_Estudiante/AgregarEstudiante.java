/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIColaborador.ABC_Estudiante;

import UIColaborador.ABC_Catedratico.*;
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
public class AgregarEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public AgregarEstudiante() {
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
        textoId = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        instruccionesUsuario1 = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JTextField();
        instruccionesUsuario3 = new javax.swing.JLabel();
        instruccionesUsuario4 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoMini.png"))); // NOI18N
        logo.setText("Logo");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 130));

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 40)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 1, 1));
        titulo.setText("AGREGAR ESTUDIANTE");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 500, 53));

        instruccionesUsuario.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario.setText("Identificador:");
        getContentPane().add(instruccionesUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 140, 30));

        textoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIdActionPerformed(evt);
            }
        });
        textoId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoIdKeyTyped(evt);
            }
        });
        getContentPane().add(textoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 250, 30));

        agregar.setBackground(new java.awt.Color(43, 46, 46));
        agregar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        agregar.setForeground(new java.awt.Color(250, 250, 244));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 180, 40));

        instruccionesUsuario1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario1.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario1.setText("Ingrese la información que se le solicita:");
        getContentPane().add(instruccionesUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 390, 30));

        textoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(textoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 250, 30));

        instruccionesUsuario3.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario3.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario3.setText("Dirección:");
        getContentPane().add(instruccionesUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 110, 30));

        instruccionesUsuario4.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario4.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario4.setText("Nombre:");
        getContentPane().add(instruccionesUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 120, 30));

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 250, 30));

        fondo.setBackground(new java.awt.Color(59, 55, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        fondo.setText("Fondo General");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEstudiante().setVisible(true);
            }
        });
    }
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
       
       try
        {
            int id = Integer.parseInt(textoId.getText());
            String nombre = textoNombre.getText().trim();
            String direccion = textoDireccion.getText().trim();
            if (!nombre.equals("") && !direccion.equals(""))
            {
                if(EstructuraGeneral.agregarEstudiante(id, nombre, direccion))
                {
                        JOptionPane.showMessageDialog(this, "Se ha agregado al Estudiante "+ nombre+" con el Identificador: " + id + " correctamente. ","Completado",JOptionPane.INFORMATION_MESSAGE);
                        
                        textoId.setText("");
                        textoNombre.setText("");
                        textoDireccion.setText("");
                        System.out.println(EstructuraGeneral.getTablaEstudiante());
                       
                        
                } else
                {
                        JOptionPane.showMessageDialog(this, "No se ha agregado al Estudiante: " + id + " porque este ID ya existe. ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else
            {
                JOptionPane.showMessageDialog(this, "Los campos estan incompletos", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "El ID debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void textoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textoIdActionPerformed

    private void textoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDireccionActionPerformed

    private void textoIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoIdKeyTyped
    if(!Character.isDigit(evt.getKeyChar())){
       evt.consume();
   } 
    }//GEN-LAST:event_textoIdKeyTyped

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregar;
    public javax.swing.JLabel fondo;
    public javax.swing.JLabel instruccionesUsuario;
    public javax.swing.JLabel instruccionesUsuario1;
    public javax.swing.JLabel instruccionesUsuario3;
    public javax.swing.JLabel instruccionesUsuario4;
    public javax.swing.JLabel logo;
    public javax.swing.JTextField textoDireccion;
    public javax.swing.JTextField textoId;
    public javax.swing.JTextField textoNombre;
    public javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
