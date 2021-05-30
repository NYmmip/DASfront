package vista.gui_hadden;

import org.apache.commons.io.IOUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.NoSuchAlgorithmException;

public class RegistroUsuario extends JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel8 = new JLabel();
        CampoUsuarioRegistroUsuario = new JTextField();
        jLabel9 = new JLabel();
        CampoPasswordRegistroUsuario = new JTextField();
        jLabel10 = new JLabel();
        CampoNombreRegistroUsuario = new JTextField();
        CampoApellidoRegistroUsuario = new JTextField();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        CampoDocumentoRegistroUsuario = new JTextField();
        jPanel2 = new JPanel();
        BotonRegistrarRegistroUsuario = new JButton();
        BotonVolverRegistroUsuario = new JButton();
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

        CampoUsuarioRegistroUsuario.setBackground(new java.awt.Color(102, 102, 102));
        CampoUsuarioRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("Usuario");

        CampoPasswordRegistroUsuario.setBackground(new java.awt.Color(102, 102, 102));
        CampoPasswordRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("Nombre");

        CampoNombreRegistroUsuario.setBackground(new java.awt.Color(102, 102, 102));
        CampoNombreRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));

        CampoApellidoRegistroUsuario.setBackground(new java.awt.Color(102, 102, 102));
        CampoApellidoRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setText("Apellido");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel12.setText("Documento");

        CampoDocumentoRegistroUsuario.setBackground(new java.awt.Color(102, 102, 102));
        CampoDocumentoRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));

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
                        .addComponent(CampoDocumentoRegistroUsuario, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoNombreRegistroUsuario)
                            .addComponent(CampoApellidoRegistroUsuario, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoUsuarioRegistroUsuario, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(CampoPasswordRegistroUsuario))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CampoUsuarioRegistroUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPasswordRegistroUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CampoNombreRegistroUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoApellidoRegistroUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDocumentoRegistroUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonRegistrarRegistroUsuario.setBackground(new java.awt.Color(0, 0, 255));
        BotonRegistrarRegistroUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonRegistrarRegistroUsuario.setText("Registrar");
        BotonRegistrarRegistroUsuario.setToolTipText("");
        BotonRegistrarRegistroUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonRegistrarRegistroUsuarioActionPerformed(evt);
            }
        });

        BotonVolverRegistroUsuario.setBackground(new java.awt.Color(255, 51, 51));
        BotonVolverRegistroUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonVolverRegistroUsuario.setText("Volver");
        BotonVolverRegistroUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonVolverRegistroUsuarioActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonVolverRegistroUsuario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarRegistroUsuario, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BotonRegistrarRegistroUsuario)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolverRegistroUsuario)
                .addGap(26, 26, 26))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Registrar usuario");

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

    private void BotonRegistrarRegistroUsuarioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarRegistroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistrarRegistroUsuarioActionPerformed

    private void BotonVolverRegistroUsuarioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonVolverRegistroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverRegistroUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton BotonRegistrarRegistroUsuario;
    private JButton BotonVolverRegistroUsuario;
    private JTextField CampoApellidoRegistroUsuario;
    private JTextField CampoDocumentoRegistroUsuario;
    private JTextField CampoNombreRegistroUsuario;
    private JTextField CampoPasswordRegistroUsuario;
    private JTextField CampoUsuarioRegistroUsuario;
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


    
    public RegistroUsuario() throws NoSuchAlgorithmException {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.ponerescuchar();

    }
    
    private void ponerescuchar(){
        this.BotonRegistrarRegistroUsuario.addActionListener(this);
        this.BotonVolverRegistroUsuario.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String user = this.CampoUsuarioRegistroUsuario.getText();
        String pass = this.CampoPasswordRegistroUsuario.getText();
        String nombre = this.CampoNombreRegistroUsuario.getText()+this.CampoApellidoRegistroUsuario.getText();
        String doc = this.CampoDocumentoRegistroUsuario.getText();
        try {
            if(e.getSource()==this.BotonRegistrarRegistroUsuario){
                InputStream response = new URL("http://localhost:8080/controller/registerUser/"+user+"/"+pass+"/"+nombre+"/"+doc).openStream();
                String estado = IOUtils.toString(response,"UTF-8");
                response.available();
                response.close();
                if(estado.equals("true")){
                    JOptionPane.showMessageDialog(null,"Registro Exitoso");
                    this.dispose();
                    new Login();
                }else if(estado.equals("false")){
                    JOptionPane.showMessageDialog(null,"Registro Fallido");
                }
            }
            if(e.getSource()==this.BotonVolverRegistroUsuario){
                this.dispose();
                new Login();
            }
        } catch (Exception ioException) {
            ioException.printStackTrace();
        }
    }
}