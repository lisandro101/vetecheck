/*
 * Buscar.java
 *
 * Created on 21 de junio de 2007, 17:08
 */

package vete.Interfaz;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vete.Entidad.Perfil;
import vete.Entidad.Usuario;

/**
 *
 * @author  Lisandro
 */
public class Buscar extends javax.swing.JFrame {
    
    //private String tipoVentana = null;
    DefaultTableModel dtm = null;
    Vector<Object> objetos = null;
    //Vector<Usuario> usuarios = null;
    //Vector<Perfil> perfiles = null;
    
    /** Creates new form Buscar 
     * @param objs 
     * @param tipo 
     */
    public Buscar(Vector<Object> objs) {
        initComponents();
        init(objs);
        this.objetos = objs;
        //this.tipoVentana = tipo;
    }
    
    Vector<Usuario> objetoAUsuario(Vector<Object> objs){
    
        Vector<Usuario> u = null;
        
        for (int i=0; i<objs.size(); i++){
            
            u.set(i, (Usuario) objs.elementAt(i));
            
        }
        
        return u;
    }
    
    Vector<Perfil> objetoAPerfil(Vector<Object> objs){
        
        Vector<Perfil> p = null;
        
        for (int i=0; i<objs.size(); i++){
            
            p.set(i, (Perfil) objs.elementAt(i));
            
        }
        
        return p;
    }
    
    private void init(Vector<Object> objs) {
        
        if (objs.firstElement() instanceof Usuario) {
            this.setTitle("Busqueda de Usuarios");
            String[] columnas = {"Usuario"};
            dtm = new DefaultTableModel(columnas, 0);
            
            cargarUsuarios(objetoAUsuario(objetos));
        }
        else if (objs.firstElement() instanceof Perfil) {
            this.setTitle("Busqueda de Perfiles");
            String[] columnas = {"Perfil"};
            dtm = new DefaultTableModel(columnas, 0);
            
            cargarPerfiles(objetoAPerfil(objetos));
            
        }
        
        jtBuscar.setModel(dtm);
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtBuscar = new javax.swing.JTable();
        jbCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtBuscar);

        jbCerrar.setText("Cerrar");
        jbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(jbCerrar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbCerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBuscarMouseClicked
     
    if (objetos.firstElement() instanceof Usuario) {
            try{
            //MainFrame.mf.ultimoUsuario = usuarios.get(jtBuscar.getSelectedRow());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(),"Alta Perfil", JOptionPane.INFORMATION_MESSAGE);
            }
     }
     else if (objetos.firstElement() instanceof Perfil) {
            //MainFrame.mf.ultimoPerfil = perfiles.get(jtBuscar.getSelectedRow());
     }
       
        this.dispose();
}//GEN-LAST:event_jtBuscarMouseClicked

public void cargarUsuarios(Vector<Usuario> usuarios) {
        
        //this.usuarios = usuarios;
        
        for (Usuario usuario : usuarios) {
            
            String[] fila = {usuario.getNombre()};
            
            dtm.addRow(fila);
        }
    }

public void cargarPerfiles(Vector<Perfil> perfiles) {
        
        //this.perfiles = perfiles;
        
        for (Perfil perfil : perfiles) {
              
                String[] fila = {perfil.getNombre()};
                
                dtm.addRow(fila);
           
        }
      
    }

private void jbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarMouseClicked
    this.dispose();
}//GEN-LAST:event_jbCerrarMouseClicked
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JTable jtBuscar;
    // End of variables declaration//GEN-END:variables
    
}
