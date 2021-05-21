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
import objetos.Curso;
import objetos.Edificio;
import objetos.Usuario;



/**
 *
 * @author erikssonherlo
 */
public class EditarCurso extends javax.swing.JFrame {

    private Curso cursoSeleccionado;
    /**
     * Creates new form Interfaz
     */
    public EditarCurso() {
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
        textoBusqueda = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        instruccionesUsuario1 = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        instruccionesUsuario3 = new javax.swing.JLabel();
        instruccionesUsuario4 = new javax.swing.JLabel();
        textoCodigo = new javax.swing.JTextField();
        instruccionesUsuario5 = new javax.swing.JLabel();
        textoCreditos = new javax.swing.JTextField();
        instruccionesUsuario6 = new javax.swing.JLabel();
        instruccionesUsuario7 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        textoNombre = new javax.swing.JTextField();
        textoSemestre = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoMini.png"))); // NOI18N
        logo.setText("Logo");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 130));

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 40)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 1, 1));
        titulo.setText("EDITAR CURSO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 330, 53));

        instruccionesUsuario.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario.setText("Código:");
        getContentPane().add(instruccionesUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 30));

        textoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBusquedaActionPerformed(evt);
            }
        });
        textoBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoBusquedaKeyTyped(evt);
            }
        });
        getContentPane().add(textoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 200, 30));

        buscar.setBackground(new java.awt.Color(43, 46, 46));
        buscar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        buscar.setForeground(new java.awt.Color(250, 250, 244));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 120, 40));

        instruccionesUsuario1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        instruccionesUsuario1.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario1.setText("Resultado de la Búsqueda:");
        getContentPane().add(instruccionesUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 410, 30));

        actualizar.setBackground(new java.awt.Color(43, 46, 46));
        actualizar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        actualizar.setForeground(new java.awt.Color(250, 250, 244));
        actualizar.setText("Actualizar");
        actualizar.setEnabled(false);
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 120, 40));

        instruccionesUsuario3.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        instruccionesUsuario3.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario3.setText("Ingrese el Codigo del Curso para realizar la Búsqueda:");
        getContentPane().add(instruccionesUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 460, 30));

        instruccionesUsuario4.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario4.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario4.setText("Código:");
        getContentPane().add(instruccionesUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 140, 30));

        textoCodigo.setEnabled(false);
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
        getContentPane().add(textoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 250, 30));

        instruccionesUsuario5.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario5.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario5.setText("Nombre:");
        getContentPane().add(instruccionesUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 120, 30));

        textoCreditos.setEnabled(false);
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
        getContentPane().add(textoCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 250, 30));

        instruccionesUsuario6.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario6.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario6.setText("Semestre:");
        getContentPane().add(instruccionesUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 150, 30));

        instruccionesUsuario7.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario7.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario7.setText("Creditos:");
        getContentPane().add(instruccionesUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 120, 30));

        eliminar.setBackground(new java.awt.Color(43, 46, 46));
        eliminar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        eliminar.setForeground(new java.awt.Color(250, 250, 244));
        eliminar.setText("Eliminar");
        eliminar.setEnabled(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 120, 40));

        textoNombre.setEnabled(false);
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 250, 30));

        textoSemestre.setEnabled(false);
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
        getContentPane().add(textoSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 250, 30));

        fondo.setBackground(new java.awt.Color(59, 55, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        fondo.setText("Fondo General");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCurso().setVisible(true);
            }
        });
    }
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       String idCurso = textoBusqueda.getText();
        Curso curso = EstructuraGeneral.buscarCurso(idCurso);
        if (curso != null)
        {
            cursoSeleccionado = curso;
            textoCodigo.setText(String.valueOf(curso.getId()));
            textoNombre.setText(curso.getNombre());
            textoSemestre.setText(String.valueOf(curso.getSemestre()));
            textoCreditos.setText(String.valueOf(curso.getCreditos()));
            
            textoNombre.setEnabled(true);
            textoSemestre.setEnabled(true);
            textoCreditos.setEnabled(true);
            actualizar.setEnabled(true);
            eliminar.setEnabled(true);
            textoBusqueda.setText("");
            
        } else
        {
            JOptionPane.showMessageDialog(this, "El curso no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void textoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBusquedaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textoBusquedaActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
         int idCurso = cursoSeleccionado.getId();
        String nombre = textoNombre.getText();
        int semestre  = Integer.parseInt(textoSemestre.getText());
        int creditos = Integer.parseInt(textoCreditos.getText());
        Curso curso = new Curso(idCurso, nombre, semestre, creditos);
        
        if(EstructuraGeneral.actualizarCurso(curso))
        {
            JOptionPane.showMessageDialog(this, "Se ha actualizado el curso correctamente", "Completado", JOptionPane.INFORMATION_MESSAGE);
            textoCodigo.setText("");
            textoNombre.setText("");
            textoSemestre.setText("");
            textoCreditos.setText("");
            
            textoNombre.setEnabled(false);
            textoSemestre.setEnabled(false);
            textoCreditos.setEnabled(false);
            actualizar.setEnabled(false);
            eliminar.setEnabled(false);
           
            cursoSeleccionado = null;
        } else
        {
            JOptionPane.showMessageDialog(this, "No se ha podido actualizar correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_actualizarActionPerformed

    private void textoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCodigoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_textoCodigoActionPerformed

    private void textoCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCodigoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_textoCodigoKeyTyped

    private void textoCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCreditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCreditosActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String idCurso = String.valueOf(cursoSeleccionado.getId());
        
        if(EstructuraGeneral.eliminarCurso(idCurso)){
            
            JOptionPane.showMessageDialog(this, "Se ha Eliminado Correctamente el Curso","Completado",JOptionPane.INFORMATION_MESSAGE);
             
             textoCodigo.setText("");
            textoNombre.setText("");
            textoSemestre.setText("");
            textoCreditos.setText("");
            
            textoNombre.setEnabled(false);
            textoSemestre.setEnabled(false);
            textoCreditos.setEnabled(false);
            actualizar.setEnabled(false);
            eliminar.setEnabled(false);
           
            cursoSeleccionado = null;
            
        }else{
            JOptionPane.showMessageDialog(this, "No se ha podido eliminar correctamente","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void textoBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBusquedaKeyTyped
       if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        
    }//GEN-LAST:event_textoBusquedaKeyTyped

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSemestreActionPerformed

    private void textoSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoSemestreKeyTyped
 if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_textoSemestreKeyTyped

    private void textoCreditosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCreditosKeyTyped
 if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_textoCreditosKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizar;
    public javax.swing.JButton buscar;
    public javax.swing.JButton eliminar;
    public javax.swing.JLabel fondo;
    public javax.swing.JLabel instruccionesUsuario;
    public javax.swing.JLabel instruccionesUsuario1;
    public javax.swing.JLabel instruccionesUsuario3;
    public javax.swing.JLabel instruccionesUsuario4;
    public javax.swing.JLabel instruccionesUsuario5;
    public javax.swing.JLabel instruccionesUsuario6;
    public javax.swing.JLabel instruccionesUsuario7;
    public javax.swing.JLabel logo;
    public javax.swing.JTextField textoBusqueda;
    public javax.swing.JTextField textoCodigo;
    public javax.swing.JTextField textoCreditos;
    public javax.swing.JTextField textoNombre;
    public javax.swing.JTextField textoSemestre;
    public javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
