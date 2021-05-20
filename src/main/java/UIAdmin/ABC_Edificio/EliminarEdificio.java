/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIAdmin.ABC_Edificio;

import implementacion.EstructuraGeneral;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import objetos.Edificio;



/**
 *
 * @author erikssonherlo
 */
public class EliminarEdificio extends javax.swing.JFrame {

    private Edificio edificioSeleccionado;
    /**
     * Creates new form Interfaz
     */
    public EliminarEdificio() {
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
        textoUsuario = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        instruccionesUsuario1 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        instruccionesUsuario2 = new javax.swing.JLabel();
        textoUsuario1 = new javax.swing.JTextField();
        instruccionesUsuario3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoMini.png"))); // NOI18N
        logo.setText("Logo");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 130));

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 40)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 1, 1));
        titulo.setText("ELIMINAR EDIFICIO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 430, 53));

        instruccionesUsuario.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario.setText("Nombre:");
        getContentPane().add(instruccionesUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 120, 30));

        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 200, 30));

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
        getContentPane().add(instruccionesUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 410, 30));

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
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 120, 40));

        instruccionesUsuario2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario2.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario2.setText("Nombre:");
        getContentPane().add(instruccionesUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 120, 30));

        textoUsuario1.setEnabled(false);
        textoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 200, 30));

        instruccionesUsuario3.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        instruccionesUsuario3.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario3.setText("Ingrese el Nombre del Edificio para realizar la Búsqueda:");
        getContentPane().add(instruccionesUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 410, 30));

        fondo.setBackground(new java.awt.Color(59, 55, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        fondo.setText("Fondo General");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

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
            java.util.logging.Logger.getLogger(EliminarEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(EliminarEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(EliminarEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EliminarEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarEdificio().setVisible(true);
            }
        });
    }
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String nombre = textoUsuario.getText();
        Edificio edificio = EstructuraGeneral.buscarEdificio(nombre);
              
        if (edificio != null)
        {
            
            edificioSeleccionado = edificio;
            textoUsuario1.setText(edificioSeleccionado.getNombre());
            textoUsuario.setText("");
            eliminar.setEnabled(true);
            
        } else
        {
            JOptionPane.showMessageDialog(this, "El edificio no existe","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textoUsuarioActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
         
        if(EstructuraGeneral.eliminarEdificio(edificioSeleccionado.getNombre()))
        {
            JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente el edificio");
            eliminar.setEnabled(false);
            textoUsuario1.setText("");
            edificioSeleccionado = null;
            EstructuraGeneral.getListaEdificios().mostrarDatos();
        } else
        {
            JOptionPane.showMessageDialog(this, "No se ha podido eliminar correctamente","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void textoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buscar;
    public javax.swing.JButton eliminar;
    public javax.swing.JLabel fondo;
    public javax.swing.JLabel instruccionesUsuario;
    public javax.swing.JLabel instruccionesUsuario1;
    public javax.swing.JLabel instruccionesUsuario2;
    public javax.swing.JLabel instruccionesUsuario3;
    public javax.swing.JLabel logo;
    public javax.swing.JTextField textoUsuario;
    public javax.swing.JTextField textoUsuario1;
    public javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}