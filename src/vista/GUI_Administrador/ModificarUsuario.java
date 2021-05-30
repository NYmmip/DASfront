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

public class ModificarUsuario extends JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel8 = new JLabel();
        CampoUsuarioModificarUsuario = new JTextField();
        jLabel9 = new JLabel();
        CampoPasswordModificarUsuario = new JTextField();
        jLabel10 = new JLabel();
        CampoNombreModificarUsuario = new JTextField();
        CampoApellidoModificarUsuario = new JTextField();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        CampoDocumentoModificarUsuario = new JTextField();
        jPanel2 = new JPanel();
        BotonModificarModificarUsuario = new JButton();
        BotonVolverModificarUsuario = new JButton();
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

        CampoUsuarioModificarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        CampoUsuarioModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("Usuario");

        CampoPasswordModificarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        CampoPasswordModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("Nombre");

        CampoNombreModificarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        CampoNombreModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));

        CampoApellidoModificarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        CampoApellidoModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setText("Apellido");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel12.setText("Documento");

        CampoDocumentoModificarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        CampoDocumentoModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoDocumentoModificarUsuario, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoNombreModificarUsuario)
                            .addComponent(CampoApellidoModificarUsuario, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoUsuarioModificarUsuario, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(CampoPasswordModificarUsuario))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CampoUsuarioModificarUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPasswordModificarUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CampoNombreModificarUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoApellidoModificarUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDocumentoModificarUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonModificarModificarUsuario.setBackground(new java.awt.Color(0, 0, 255));
        BotonModificarModificarUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonModificarModificarUsuario.setText("Modificar");
        BotonModificarModificarUsuario.setToolTipText("");
        BotonModificarModificarUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonModificarModificarUsuarioActionPerformed(evt);
            }
        });

        BotonVolverModificarUsuario.setBackground(new java.awt.Color(255, 51, 51));
        BotonVolverModificarUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonVolverModificarUsuario.setText("Volver");
        BotonVolverModificarUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonVolverModificarUsuarioActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonVolverModificarUsuario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificarModificarUsuario, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BotonModificarModificarUsuario)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolverModificarUsuario)
                .addGap(26, 26, 26))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Modificar usuario");

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
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarModificarUsuarioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonModificarModificarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonModificarModificarUsuarioActionPerformed

    private void BotonVolverModificarUsuarioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonVolverModificarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverModificarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton BotonModificarModificarUsuario;
    private JButton BotonVolverModificarUsuario;
    private JTextField CampoApellidoModificarUsuario;
    private JTextField CampoDocumentoModificarUsuario;
    private JTextField CampoNombreModificarUsuario;
    private JTextField CampoPasswordModificarUsuario;
    private JTextField CampoUsuarioModificarUsuario;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
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
    
    public ModificarUsuario(String key, String user){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.ponerescuchar();
        this.actividad=actividad;
        this.alojamiento=alojamiento;
        this.key = key;

        String result[] = new String[6];
        try {
            InputStream response = new URL("http://localhost:8080/controller/getUser/"+ this.key+"/"+user).openStream();
            result = IOUtils.toString(response, "UTF-8").replaceAll("\\[","")
                    .replaceAll("\"","")
                    .replaceAll("\\\\n","")
                    .replaceAll("\\]","")
                    .split(",");
            System.out.println(result);
            response.available();
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(result.length == 4){
            this.CampoDocumentoModificarUsuario.setText(result[3]);
            this.CampoNombreModificarUsuario.setText(result[2]);
            this.CampoPasswordModificarUsuario.setText(result[1]);
            this.CampoUsuarioModificarUsuario.setText(result[0]);
            this.CampoUsuarioModificarUsuario.setEnabled(false);
        }else  {
            this.CampoPasswordModificarUsuario.setText(result[1]);
            this.CampoUsuarioModificarUsuario.setText(result[0]);
            this.CampoUsuarioModificarUsuario.setEnabled(false);
        }
    }
    
    private void ponerescuchar(){
        this.BotonModificarModificarUsuario.addActionListener(this);
        this.BotonVolverModificarUsuario.addActionListener(this);
        //this.BotonVolverModificarUsuario.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.BotonModificarModificarUsuario){

            String doc = this.CampoDocumentoModificarUsuario.getText();
            String nombre = this.CampoNombreModificarUsuario.getText();
            String pass = this.CampoPasswordModificarUsuario.getText();
            String user = this.CampoUsuarioModificarUsuario.getText();

            String estado = "";
            try {
                InputStream response = new URL("http://localhost:8080/controller/updateUser/"+this.key+"/"+user+"/"+pass+"/"+nombre+"/"+doc).openStream();
                estado = IOUtils.toString(response,"UTF-8");
                response.available();
                response.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }


            if(estado.equals("true")){
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                new TablaUsuarios(key);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Modificacion fallida");
            }
        }
        if(e.getSource()==this.BotonVolverModificarUsuario){
            new TablaUsuarios(key);
            this.dispose();
        }
    }
}