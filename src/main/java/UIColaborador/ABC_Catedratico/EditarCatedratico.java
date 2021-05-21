/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIColaborador.ABC_Catedratico;

import UIAdmin.ABC_Usuario.*;
import UIAdmin.ABC_Edificio.*;
import implementacion.EstructuraGeneral;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import objetos.Catedratico;
import objetos.Edificio;
import objetos.Usuario;



/**
 *
 * @author erikssonherlo
 */
public class EditarCatedratico extends javax.swing.JFrame {

    private Catedratico catedraticoSeleccionado;
    /**
     * Creates new form Interfaz
     */
    public EditarCatedratico() {
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
        textoIdentificador = new javax.swing.JTextField();
        instruccionesUsuario5 = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JTextField();
        instruccionesUsuario6 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
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
        titulo.setText("EDITAR CATEDRATICO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 480, 53));

        instruccionesUsuario.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario.setText("Identificador:");
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
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 120, 40));

        instruccionesUsuario3.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        instruccionesUsuario3.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario3.setText("Ingrese el Identificador del Catedrático para realizar la Búsqueda:");
        getContentPane().add(instruccionesUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 490, 30));

        instruccionesUsuario4.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario4.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario4.setText("Identificador:");
        getContentPane().add(instruccionesUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 140, 30));

        textoIdentificador.setEnabled(false);
        textoIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIdentificadorActionPerformed(evt);
            }
        });
        textoIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoIdentificadorKeyTyped(evt);
            }
        });
        getContentPane().add(textoIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 250, 30));

        instruccionesUsuario5.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario5.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario5.setText("Nombre:");
        getContentPane().add(instruccionesUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 120, 30));

        textoDireccion.setEnabled(false);
        textoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(textoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 250, 30));

        instruccionesUsuario6.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario6.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario6.setText("Dirección:");
        getContentPane().add(instruccionesUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 130, 30));

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
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 120, 40));

        textoNombre.setEnabled(false);
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 250, 30));

        fondo.setBackground(new java.awt.Color(59, 55, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        fondo.setText("Fondo General");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 650));

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
            java.util.logging.Logger.getLogger(EditarCatedratico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(EditarCatedratico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(EditarCatedratico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EditarCatedratico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EditarCatedratico().setVisible(true);
            }
        });
    }
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try
        {
            int id = Integer.parseInt(textoBusqueda.getText());
            Catedratico catedratico = EstructuraGeneral.buscarCatedratico(id);
            if (catedratico != null)
            {
                catedraticoSeleccionado = catedratico;
                textoIdentificador.setText(String.valueOf(catedratico.getId()));
                
                textoNombre.setText(catedratico.getNombre());
                textoNombre.setEnabled(true);
                
                textoDireccion.setText(catedratico.getDireccion());
                
                textoDireccion.setEnabled(true);
                
                textoBusqueda.setText("");
                
                actualizar.setEnabled(true);
                eliminar.setEnabled(true);
            } else
            {
                JOptionPane.showMessageDialog(this, "El Catedratico no existe","Error",JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "El ID debe ser numerico","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void textoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBusquedaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textoBusquedaActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        if(catedraticoSeleccionado!= null){
            
        int id = Integer.parseInt(textoIdentificador.getText());
        String nombre = textoNombre.getText();
        String direccion = textoDireccion.getText();
        
        if(EstructuraGeneral.actualizarCatedratico(new Catedratico(id, nombre, direccion))){
            JOptionPane.showMessageDialog(this, "Se ha actualizado Correctamente el Catedratico","Completado",JOptionPane.INFORMATION_MESSAGE);
           
            textoIdentificador.setText("");
                
            textoNombre.setText("");
            textoNombre.setEnabled(false);
                
                textoDireccion.setText("");
                
                textoDireccion.setEnabled(false);
                
                textoBusqueda.setText("");
                
                actualizar.setEnabled(false);
                eliminar.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(this, "No se ha podido actualizar correctamente","Error",JOptionPane.ERROR_MESSAGE);
        }
        }         
       
    }//GEN-LAST:event_actualizarActionPerformed

    private void textoIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIdentificadorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_textoIdentificadorActionPerformed

    private void textoIdentificadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoIdentificadorKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        
    }//GEN-LAST:event_textoIdentificadorKeyTyped

    private void textoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDireccionActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (catedraticoSeleccionado != null)
        {
            if (EstructuraGeneral.eliminarCatedratico(catedraticoSeleccionado.getId()))
            {
               JOptionPane.showMessageDialog(this, "Se ha Eliminado Correctamente el Catedratico","Completado",JOptionPane.INFORMATION_MESSAGE);
           
            textoIdentificador.setText("");
                
            textoNombre.setText("");
            textoNombre.setEnabled(false);
                
                textoDireccion.setText("");
                
                textoDireccion.setEnabled(false);
                
                textoBusqueda.setText("");
                
                actualizar.setEnabled(false);
                eliminar.setEnabled(false);
                catedraticoSeleccionado = null;
                EstructuraGeneral.getArbolCatedraticos().mostrarArbol();
            } else
            {
                JOptionPane.showMessageDialog(this, "No se ha podido eliminar correctamente", "Error", JOptionPane.ERROR_MESSAGE);
            }
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
    public javax.swing.JLabel logo;
    public javax.swing.JTextField textoBusqueda;
    public javax.swing.JTextField textoDireccion;
    public javax.swing.JTextField textoIdentificador;
    public javax.swing.JTextField textoNombre;
    public javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
