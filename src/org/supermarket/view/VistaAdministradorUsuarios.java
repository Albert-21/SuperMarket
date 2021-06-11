/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.supermarket.view;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.supermarket.controller.DAOUsuario;
import org.supermarket.model.Usuarios;

/**
 *
 * @author victorm
 */
public class VistaAdministradorUsuarios extends javax.swing.JInternalFrame {

    private static VistaAdministradorUsuarios vistaAdministradorUsuarios = null;
    private Usuarios usuario;
    private final DAOUsuario daoUsuario;
    private final DefaultTableModel modeloTabla;
    private List<Usuarios> lista;

    /**
     * Creates new form VistaAdministradorProductos
     */
    private VistaAdministradorUsuarios() {
        initComponents();
        daoUsuario = new DAOUsuario();
        modeloTabla = (DefaultTableModel) tablaUsuarios.getModel();
    }

    public static VistaAdministradorUsuarios getInstance() {
        if (vistaAdministradorUsuarios == null) {
            return vistaAdministradorUsuarios = new VistaAdministradorUsuarios();
        }
        return vistaAdministradorUsuarios;
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
        jToolBar1 = new javax.swing.JToolBar();
        btnGuardarUsuario = new javax.swing.JToggleButton();
        btnActualizar = new javax.swing.JToggleButton();
        btenEliminar = new javax.swing.JToggleButton();
        btnBuscar = new javax.swing.JToggleButton();
        btnMostarTodo = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        comboRol = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        btnGuardarUsuario.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/supermarket/images/file-add_114479.png"))); // NOI18N
        btnGuardarUsuario.setText("Crear Usuario");
        btnGuardarUsuario.setFocusable(false);
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardarUsuario);

        btnActualizar.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/supermarket/images/Save-as_37111.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setFocusable(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnActualizar);

        btenEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btenEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btenEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/supermarket/images/recycle_recyclebin_full_delete_trash_1772.png"))); // NOI18N
        btenEliminar.setText("Eliminar");
        btenEliminar.setFocusable(false);
        btenEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btenEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btenEliminar);

        btnBuscar.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/supermarket/images/1486505375-files-folder-search-magnifying-glass-file-search-magnifier-storage_81440.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscar);

        btnMostarTodo.setBackground(new java.awt.Color(153, 153, 153));
        btnMostarTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnMostarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/supermarket/images/search_book_open_search_locate_6178.png"))); // NOI18N
        btnMostarTodo.setText("Consultar Todo");
        btnMostarTodo.setFocusable(false);
        btnMostarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarTodoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMostarTodo);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Completo : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Direccion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 140, -1));

        comboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "cajero" }));
        jPanel1.add(comboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 140, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rol:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 140, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 140, -1));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 140, -1));

        txtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 140, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuarios");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Direccion ", "Telefono", "Nombre de Usuario", "Contraseña", "Rol"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 780, 220));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/supermarket/images/4882066.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 780, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed
        try {
            // TODO add your handling code here:
            if ("".equals(txtNombre.getText().trim()) && txtDireccion.getText().trim() == "" && txtTelefono.getText().trim() == "" && txtNombreUsuario.getText().trim() == "" && String.valueOf(txtContraseña.getPassword()) == "" && String.valueOf(comboRol.getSelectedItem()) == "") {
                JOptionPane.showMessageDialog(null, "Hay campos vacios");
            } else {
                usuario = new Usuarios(txtNombre.getText().trim(), txtDireccion.getText().trim(), txtTelefono.getText().trim(), txtNombreUsuario.getText().trim(), String.valueOf(txtContraseña.getPassword()), String.valueOf(comboRol.getSelectedItem()));
                daoUsuario.guardar(usuario);
            }

        } catch (Exception ex) {
            Logger.getLogger(VistaAdministradorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    private void btnMostarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarTodoActionPerformed
        // TODO add your handling code here:
        lista = daoUsuario.mostrarTodos();
        modeloTabla.setRowCount(0);
        lista.forEach((Usuarios usuario) -> {
            try {
                modeloTabla.addRow(new Object[]{usuario.getId(), usuario.getNombre_completo(), usuario.getDireccion(), usuario.getTelefono(), usuario.getNombre_usuario(), txtContraseña.getPassword(), usuario.getRol()});
            } catch (Exception ex) {
                Logger.getLogger(VistaAdministradorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }//GEN-LAST:event_btnMostarTodoActionPerformed

    private void btenEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btenEliminarActionPerformed
        // TODO add your handling code here:
        long res = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el id"));
        usuario = new Usuarios();
        usuario.setId(res);

        daoUsuario.borrar(usuario);
    }//GEN-LAST:event_btenEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            // TODO add your handling code here:
            usuario = new Usuarios(txtNombre.getText().trim(), txtDireccion.getText().trim(), txtTelefono.getText().trim(), txtNombreUsuario.getText().trim(), String.valueOf(txtContraseña.getPassword()), String.valueOf(comboRol.getSelectedItem()));
            long res = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el id"));
            usuario.setId(res);
            if ("".equals(txtNombre.getText().trim()) && txtDireccion.getText().trim() == "" && txtTelefono.getText().trim() == "" && txtNombreUsuario.getText().trim() == "" && String.valueOf(txtContraseña.getPassword()) == "" && String.valueOf(comboRol.getSelectedItem()) == "") {
                JOptionPane.showMessageDialog(null, "Hay campos vacios");
            } else {
                daoUsuario.actualizar(usuario);
            }
        } catch (Exception ex) {
            Logger.getLogger(VistaAdministradorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        daoUsuario.actualizar(usuario);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        modeloTabla.setRowCount(0);
        long res = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el id del Usuario"));
        usuario = new Usuarios();
        usuario.setId(res);

        Usuarios result = daoUsuario.mostrarUno(usuario);
        try {
            modeloTabla.addRow(new Object[]{
                result.getId(),
                result.getNombre_completo(),
                result.getDireccion(),
                result.getTelefono(),
                result.getNombre_usuario(),
                result.getContraseña(),
                result.getRol()
            });
        } catch (Exception ex) {
            Logger.getLogger(VistaAdministradorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo hay periten caracteres alfabeticos");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo hay perite digitos");
        }

        if (txtTelefono.getText().trim().length() == 10) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo hay perite 10 digitos");
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo hay periten caracteres alfabeticos");
        }
    }//GEN-LAST:event_txtNombreUsuarioKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo hay periten caracteres alfabeticos");
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btenEliminar;
    private javax.swing.JToggleButton btnActualizar;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JToggleButton btnGuardarUsuario;
    private javax.swing.JToggleButton btnMostarTodo;
    private javax.swing.JComboBox<String> comboRol;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
