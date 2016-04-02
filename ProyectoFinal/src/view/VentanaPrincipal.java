/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.Usuario;
import javax.swing.JInternalFrame;
import util.Memoria;

/**
 *
 * @author RAFAEL
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        EstablecerTitulo();
        setExtendedState(MAXIMIZED_BOTH);
    }
        private void EstablecerTitulo() {
        Usuario bean = (Usuario) Memoria.get("Cuenta");
        String titulo = "MANAGER [Cuenta: "+ bean.getCuenta() +" ]";
        this.setTitle(titulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuProceso = new javax.swing.JMenu();
        menuProcesoIngNota = new javax.swing.JMenuItem();
        menuProcesoIngAlumno = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoSalir);

        menuBar.add(menuArchivo);

        menuProceso.setText("Procesos");

        menuProcesoIngNota.setText("Ingreso de notas");
        menuProcesoIngNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcesoIngNotaActionPerformed(evt);
            }
        });
        menuProceso.add(menuProcesoIngNota);

        menuProcesoIngAlumno.setText("Ingresar nuevo Alumno");
        menuProcesoIngAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcesoIngAlumnoActionPerformed(evt);
            }
        });
        menuProceso.add(menuProcesoIngAlumno);

        menuBar.add(menuProceso);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuArchivoSalirActionPerformed

    private void menuProcesoIngNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcesoIngNotaActionPerformed
        CargarFormulario (IngresoNotas.class);
    }//GEN-LAST:event_menuProcesoIngNotaActionPerformed

    private void menuProcesoIngAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcesoIngAlumnoActionPerformed
        CargarFormulario(IngresoAlumnos.class);
    }//GEN-LAST:event_menuProcesoIngAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuProceso;
    private javax.swing.JMenuItem menuProcesoIngAlumno;
    private javax.swing.JMenuItem menuProcesoIngNota;
    // End of variables declaration//GEN-END:variables

    private void CargarFormulario(Class<?> aClass) {
        try{
            JInternalFrame view;
            view = buscarFormulario(aClass);
            if(view == null){
            view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
            desktopPane.add(view);
            view.setVisible(true);
            }
            // Activando el formulario
            view.setSelected(true);
        }catch(Exception e){
        }
    }

    private JInternalFrame buscarFormulario(Class<?> aClass) {
        JInternalFrame view = null;
        for(JInternalFrame bean : desktopPane.getAllFrames()){
        if(aClass.isInstance(bean)){
        view = bean;
        break;
        }
        }
        return view;
    }



}
