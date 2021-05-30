package vista.GUI_Administrador;


import org.apache.commons.io.IOUtils;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CrearEmpresa extends JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel8 = new JLabel();
        CampoUsuarioCrearEmpresa = new JTextField();
        jLabel9 = new JLabel();
        CampoPasswordCrearEmpresa = new JTextField();
        jLabel10 = new JLabel();
        CampoNitCrearEmpresa = new JTextField();
        CampoNombreCrearEmpresa = new JTextField();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        CampoDireccionCrearEmpresa = new JTextField();
        CampoDescripcionCrearEmpresa = new JTextField();
        jLabel13 = new JLabel();
        jPanel2 = new JPanel();
        BotonGuardarCrearEmpresa = new JButton();
        jButton10 = new JButton();
        jPanel4 = new JPanel();
        jLabel3 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 51, 102));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setText("Password");

        CampoUsuarioCrearEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        CampoUsuarioCrearEmpresa.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("Usuario");

        CampoPasswordCrearEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        CampoPasswordCrearEmpresa.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("Nit");

        CampoNitCrearEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        CampoNitCrearEmpresa.setForeground(new java.awt.Color(255, 255, 255));

        CampoNombreCrearEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        CampoNombreCrearEmpresa.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel12.setText("Direccion");

        CampoDireccionCrearEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        CampoDireccionCrearEmpresa.setForeground(new java.awt.Color(255, 255, 255));

        CampoDescripcionCrearEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        CampoDescripcionCrearEmpresa.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setText("Descripcion");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoDescripcionCrearEmpresa, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoDireccionCrearEmpresa, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoNitCrearEmpresa)
                            .addComponent(CampoNombreCrearEmpresa, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoUsuarioCrearEmpresa, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(CampoPasswordCrearEmpresa))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CampoUsuarioCrearEmpresa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPasswordCrearEmpresa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CampoNitCrearEmpresa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNombreCrearEmpresa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDireccionCrearEmpresa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoDescripcionCrearEmpresa, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonGuardarCrearEmpresa.setBackground(new java.awt.Color(0, 0, 255));
        BotonGuardarCrearEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonGuardarCrearEmpresa.setText("Guardar");
        BotonGuardarCrearEmpresa.setToolTipText("");
        BotonGuardarCrearEmpresa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonGuardarCrearEmpresaActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 51, 51));
        jButton10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton10.setText("Salir");
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardarCrearEmpresa, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BotonGuardarCrearEmpresa)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(22, 22, 22))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Nueva empresa");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarCrearEmpresaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonGuardarCrearEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGuardarCrearEmpresaActionPerformed

    private void jButton10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton BotonGuardarCrearEmpresa;
    private JTextField CampoDescripcionCrearEmpresa;
    private JTextField CampoDireccionCrearEmpresa;
    private JTextField CampoNitCrearEmpresa;
    private JTextField CampoNombreCrearEmpresa;
    private JTextField CampoPasswordCrearEmpresa;
    private JTextField CampoUsuarioCrearEmpresa;
    private JButton jButton10;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel3;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel4;
    // End of variables declaration//GEN-END:variables


    private int actividad;
    private int alojamiento;
    private String key;

    public CrearEmpresa(String key) throws NoSuchAlgorithmException {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.ponerescuchar();
        this.actividad=actividad;
        this.alojamiento=alojamiento;
        this.key = key;
    }
    
    private void ponerescuchar(){
        this.BotonGuardarCrearEmpresa.addActionListener(this);
        this.jButton10.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {

        try {
            if(e.getSource()==this.BotonGuardarCrearEmpresa){
                String user = this.CampoUsuarioCrearEmpresa.getText();
                String pass = this.CampoPasswordCrearEmpresa.getText();
                String nombre = this.CampoNombreCrearEmpresa.getText();
                String dir = this.CampoDireccionCrearEmpresa.getText();
                String doc = this.CampoNitCrearEmpresa.getText();
                String desc = this.CampoDescripcionCrearEmpresa.getText();
                desc = desc.replaceAll(" ","_");
                InputStream response = new URL("http://localhost:8080/controller/registerEmpresa/"+this.key+"/"+user+"/"+pass+"/"+nombre+"/"+doc+"/"+dir+"/"+desc).openStream();
                String estado = IOUtils.toString(response,"UTF-8");
                response.available();
                response.close();

                if(estado.equals("true")){
                    JOptionPane.showMessageDialog(null,"Registro exitoso");
                    new TablaEmpresas(this.key);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Registro fallido");
                }
            }
            if(e.getSource()==this.jButton10){
                new TablaEmpresas(this.key);
                this.dispose();
            }
        } catch (Exception ioException) {
            ioException.printStackTrace();
        }

    }
}