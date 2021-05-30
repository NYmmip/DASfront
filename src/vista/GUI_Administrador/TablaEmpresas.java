
package vista.GUI_Administrador;


import org.apache.commons.io.IOUtils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.NoSuchAlgorithmException;

public class TablaEmpresas extends JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel();
        BotonNuevaEmpresaTablaEmpresas = new JButton();
        BotonModificarTablaEmpresas = new JButton();
        BotonEliminarTablaEmpresas = new JButton();
        BotonVolverTablaEmpresa = new JButton();
        jScrollPane2 = new JScrollPane();
        TablaEmpresas = new JTable();
        jPanel4 = new JPanel();
        jLabel3 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonNuevaEmpresaTablaEmpresas.setBackground(new java.awt.Color(0, 0, 255));
        BotonNuevaEmpresaTablaEmpresas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonNuevaEmpresaTablaEmpresas.setText("Nueva");
        BotonNuevaEmpresaTablaEmpresas.setToolTipText("");
        BotonNuevaEmpresaTablaEmpresas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonNuevaEmpresaTablaEmpresasActionPerformed(evt);
            }
        });

        BotonModificarTablaEmpresas.setBackground(new java.awt.Color(0, 0, 255));
        BotonModificarTablaEmpresas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonModificarTablaEmpresas.setText("Modificar");
        BotonModificarTablaEmpresas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonModificarTablaEmpresasActionPerformed(evt);
            }
        });

        BotonEliminarTablaEmpresas.setBackground(new java.awt.Color(0, 0, 255));
        BotonEliminarTablaEmpresas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonEliminarTablaEmpresas.setText("Eliminar");
        BotonEliminarTablaEmpresas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonEliminarTablaEmpresasActionPerformed(evt);
            }
        });

        BotonVolverTablaEmpresa.setBackground(new java.awt.Color(255, 51, 51));
        BotonVolverTablaEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonVolverTablaEmpresa.setText("Volver");
        BotonVolverTablaEmpresa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonVolverTablaEmpresaActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonVolverTablaEmpresa, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarTablaEmpresas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificarTablaEmpresas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonNuevaEmpresaTablaEmpresas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonNuevaEmpresaTablaEmpresas)
                .addGap(18, 18, 18)
                .addComponent(BotonModificarTablaEmpresas)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminarTablaEmpresas)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolverTablaEmpresa)
                .addContainerGap())
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        TablaEmpresas.setModel(new DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaEmpresas);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Empresas");

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
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 800, GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarTablaEmpresasActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonModificarTablaEmpresasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonModificarTablaEmpresasActionPerformed

    private void BotonEliminarTablaEmpresasActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonEliminarTablaEmpresasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminarTablaEmpresasActionPerformed

    private void BotonNuevaEmpresaTablaEmpresasActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonNuevaEmpresaTablaEmpresasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonNuevaEmpresaTablaEmpresasActionPerformed

    private void BotonVolverTablaEmpresaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonVolverTablaEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverTablaEmpresaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton BotonEliminarTablaEmpresas;
    private JButton BotonModificarTablaEmpresas;
    private JButton BotonNuevaEmpresaTablaEmpresas;
    private JButton BotonVolverTablaEmpresa;
    private JTable TablaEmpresas;
    private JLabel jLabel3;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel modelo1;
    private String key;

    public TablaEmpresas(String key) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.ponerescuchar();
        this.key = key;
        String empresas[] = new String[1];
        try {
            InputStream response = new URL("http://localhost:8080/controller/getInfoEmpresas").openStream();
            empresas = IOUtils.toString(response,"UTF-8").replaceAll("\\[","")
                    .replaceAll("\"","")
                    .replaceAll("\\\\n","")
                    .replaceAll("Empresa:"," ||| Empresa:")
                    .replaceAll("NIT"," ||| NIT")
                    .replaceAll("Direccion"," ||| Direccion")
                    .replaceAll("Acerca de la empresa"," ||| Acerca de la empresa: ")
                    .replaceAll("\\]","")
                    .split(",");
            response.available();
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String col[] = {"Empresas"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        this.TablaEmpresas.setModel(tableModel);
        for (String c:empresas) {
            tableModel.addRow(new Object[]{c});
        }
        this.TablaEmpresas.setModel(tableModel);

    }
    
    private void ponerescuchar()
    {
        this.BotonNuevaEmpresaTablaEmpresas.addActionListener(this);
        this.BotonModificarTablaEmpresas.addActionListener(this);
        this.BotonEliminarTablaEmpresas.addActionListener(this);
        this.BotonVolverTablaEmpresa.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.BotonNuevaEmpresaTablaEmpresas){
            try {
                new CrearEmpresa(this.key);
            } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                noSuchAlgorithmException.printStackTrace();
            }
            this.dispose();
        }
        
        if(e.getSource()==this.BotonModificarTablaEmpresas){
            String temp = JOptionPane.showInputDialog("User de la empresa a modificar");
            try {
                if(temp != null){
                    InputStream response = new URL("http://localhost:8080/controller/getUser/"+ this.key+"/"+temp).openStream();
                    String result = IOUtils.toString(response, "UTF-8");
                    response.available();
                    response.close();
                    if(result != ""){
                        new ModificarEmpresa(this.key, temp);
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
        
        if(e.getSource()==this.BotonEliminarTablaEmpresas){
            String temp = JOptionPane.showInputDialog(null, "Ingrese el user de empresa que quiere eliminar");
            try {
                if(temp != null) {
                    if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar esta empresa") == 0) {
                        InputStream response = new URL("http://localhost:8080/controller/deleteUser/" + this.key + "/" + temp).openStream();
                        String result = IOUtils.toString(response, "UTF-8");
                        response.available();
                        response.close();
                        if (result.equals("true")) {
                            JOptionPane.showMessageDialog(null, "Usuario eliminado");
                        }
                        new TablaEmpresas(this.key);
                        this.dispose();
                    }
                }
            } catch (Exception ioException) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
                ioException.printStackTrace();
            }
        }

        if(e.getSource()==this.BotonVolverTablaEmpresa){
            new MenuAdmin(this.key);
            this.dispose();
        }
    }   
}