
package vista.GUI_Administrador;

import org.apache.commons.io.IOUtils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.NoSuchAlgorithmException;

public class TablaUsuarios extends JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel();
        BotonModificarTablaUsuarios = new JButton();
        BotonEliminarTablaUsuario = new JButton();
        BotonVolverTablaUsuarios = new JButton();
        jScrollPane2 = new JScrollPane();
        TablaUsuario = new JTable();
        jPanel4 = new JPanel();
        jLabel3 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonModificarTablaUsuarios.setBackground(new java.awt.Color(0, 0, 255));
        BotonModificarTablaUsuarios.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonModificarTablaUsuarios.setText("Modificar");
        BotonModificarTablaUsuarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonModificarTablaUsuariosActionPerformed(evt);
            }
        });

        BotonEliminarTablaUsuario.setBackground(new java.awt.Color(0, 0, 255));
        BotonEliminarTablaUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonEliminarTablaUsuario.setText("Eliminar");
        BotonEliminarTablaUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonEliminarTablaUsuarioActionPerformed(evt);
            }
        });

        BotonVolverTablaUsuarios.setBackground(new java.awt.Color(255, 51, 51));
        BotonVolverTablaUsuarios.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonVolverTablaUsuarios.setText("Volver");
        BotonVolverTablaUsuarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonVolverTablaUsuariosActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonVolverTablaUsuarios, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarTablaUsuario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificarTablaUsuarios, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonModificarTablaUsuarios)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonEliminarTablaUsuario)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolverTablaUsuarios)
                .addContainerGap())
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        TablaUsuario.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaUsuario);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Usuarios");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarTablaUsuariosActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonModificarTablaUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonModificarTablaUsuariosActionPerformed

    private void BotonEliminarTablaUsuarioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonEliminarTablaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminarTablaUsuarioActionPerformed

    private void BotonVolverTablaUsuariosActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonVolverTablaUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverTablaUsuariosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton BotonEliminarTablaUsuario;
    private JButton BotonModificarTablaUsuarios;
    private JButton BotonVolverTablaUsuarios;
    private JTable TablaUsuario;
    private JLabel jLabel3;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel modelo1;
    private String key;

    public TablaUsuarios(String key){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.ponerescuchar();
        this.key = key;

        String users[] = new String[0];
        try {
            InputStream response = new URL("http://localhost:8080/controller/getAllUsuarios/"+this.key).openStream();
            users = IOUtils.toString(response,"UTF-8").replaceAll("\\[","")
                    .replaceAll("\"","")
                    .replaceAll("\\\\n","")
                    .replaceAll("\\]","")
                    .split(",");
            response.available();
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String col[] = {"Usuarios"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        this.TablaUsuario.setModel(tableModel);
        for (String c:users) {
            tableModel.addRow(new Object[]{c});
        }
        this.TablaUsuario.setModel(tableModel);
    }
    
    private void ponerescuchar()
    {
        this.BotonModificarTablaUsuarios.addActionListener(this);
        this.BotonEliminarTablaUsuario.addActionListener(this);
        this.BotonVolverTablaUsuarios.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.BotonModificarTablaUsuarios){
            String temp = JOptionPane.showInputDialog("Ingrese el User que desea modificar");
            try {
                if(temp != null){
                    InputStream response = new URL("http://localhost:8080/controller/getUser/"+ this.key+"/"+temp).openStream();
                    String result = IOUtils.toString(response, "UTF-8");
                    response.available();
                    response.close();
                    if(result != ""){
                        new ModificarUsuario(key, temp);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,"El usuario no existe");
                    }
                }
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(null,"Ingrese un user");
                ioException.printStackTrace();
            }
        }
        
        if(e.getSource()==this.BotonEliminarTablaUsuario){
            String temp = JOptionPane.showInputDialog(null, "Ingrese el usuario que quiere eliminar");
            try {
                if(!temp.equals("admin")){
                    if(temp != null) {
                        if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar este usuario") == 0) {
                            InputStream response = new URL("http://localhost:8080/controller/deleteUser/" + this.key + "/" + temp).openStream();
                            String result = IOUtils.toString(response, "UTF-8");
                            response.available();
                            response.close();
                            if (result.equals("true")) {
                                JOptionPane.showMessageDialog(null, "Usuario eliminado");
                            }
                            new TablaUsuarios(this.key);
                            this.dispose();
                        }
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"No se Pude Eliminar al Usuario Administrador");
                }

            } catch (Exception ioException) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
                ioException.printStackTrace();
            }
        }
        
        if(e.getSource()==this.BotonVolverTablaUsuarios){
            new MenuAdmin(key);
            this.dispose();
        }
    }   
}