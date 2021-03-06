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



/**
 *
 * @author erikssonherlo
 */
public class AgregarEdificio extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public AgregarEdificio() {
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
        Ingresar = new javax.swing.JButton();
        instruccionesUsuario1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoMini.png"))); // NOI18N
        logo.setText("Logo");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 130));

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 40)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 1, 1));
        titulo.setText("AGREGAR EDIFICIO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 420, 53));

        instruccionesUsuario.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario.setText("Nombre:");
        getContentPane().add(instruccionesUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 120, 30));

        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 260, 30));

        Ingresar.setBackground(new java.awt.Color(43, 46, 46));
        Ingresar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(250, 250, 244));
        Ingresar.setText("Agregar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 180, 40));

        instruccionesUsuario1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        instruccionesUsuario1.setForeground(new java.awt.Color(4, 2, 2));
        instruccionesUsuario1.setText("Ingrese la informaci??n que se le solicita:");
        getContentPane().add(instruccionesUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 390, 30));

        fondo.setBackground(new java.awt.Color(59, 55, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        fondo.setText("Fondo General");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

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
            java.util.logging.Logger.getLogger(AgregarEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AgregarEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AgregarEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AgregarEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEdificio().setVisible(true);
            }
        });
    }
    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
       
       String nombre = textoUsuario.getText().trim();
        if (!nombre.equals(""))
        {
            if (EstructuraGeneral.agregarEdificio(nombre))
            {
                JOptionPane.showMessageDialog(this, "El Edificio: " + nombre + " se ha agregado correctamente.","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
                textoUsuario.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "No se ha podido agregar el edificio porque este nombre ya existe.","Error",JOptionPane.ERROR_MESSAGE);
            }
        } else
        {
            JOptionPane.showMessageDialog(this, "Nombre no valido","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Ingresar;
    public javax.swing.JLabel fondo;
    public javax.swing.JLabel instruccionesUsuario;
    public javax.swing.JLabel instruccionesUsuario1;
    public javax.swing.JLabel logo;
    public javax.swing.JTextField textoUsuario;
    public javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
