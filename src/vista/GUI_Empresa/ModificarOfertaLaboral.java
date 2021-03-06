package vista.GUI_Empresa;

import org.apache.commons.io.IOUtils;
import vista.GUI_Administrador.TablaUsuarios;

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

public class ModificarOfertaLaboral extends javax.swing.JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        CampoCodigoModificarOfertaLaboral = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CampoNombreModificarOfertaLaboral = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CampoCargoModificarOfertaLaboral = new javax.swing.JTextField();
        CampoDescripcionModificarOfertaLaboral = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CampotTiempoModificarOfertaLaboral = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BotonModificarModificarOfertaLaboral = new javax.swing.JButton();
        BotonVolverModificarOfertaLaboral = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 51, 102));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nombre");

        CampoCodigoModificarOfertaLaboral.setBackground(new java.awt.Color(102, 102, 102));
        CampoCodigoModificarOfertaLaboral.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Codigo");

        CampoNombreModificarOfertaLaboral.setBackground(new java.awt.Color(102, 102, 102));
        CampoNombreModificarOfertaLaboral.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sueldo");

        CampoCargoModificarOfertaLaboral.setBackground(new java.awt.Color(102, 102, 102));
        CampoCargoModificarOfertaLaboral.setForeground(new java.awt.Color(255, 255, 255));

        CampoDescripcionModificarOfertaLaboral.setBackground(new java.awt.Color(102, 102, 102));
        CampoDescripcionModificarOfertaLaboral.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Descripcion");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tiempo de contrato");

        CampotTiempoModificarOfertaLaboral.setBackground(new java.awt.Color(102, 102, 102));
        CampotTiempoModificarOfertaLaboral.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampotTiempoModificarOfertaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoCargoModificarOfertaLaboral)
                            .addComponent(CampoDescripcionModificarOfertaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoCodigoModificarOfertaLaboral, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(CampoNombreModificarOfertaLaboral))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CampoCodigoModificarOfertaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNombreModificarOfertaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CampoCargoModificarOfertaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDescripcionModificarOfertaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampotTiempoModificarOfertaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonModificarModificarOfertaLaboral.setBackground(new java.awt.Color(0, 0, 255));
        BotonModificarModificarOfertaLaboral.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonModificarModificarOfertaLaboral.setText("Modificar");
        BotonModificarModificarOfertaLaboral.setToolTipText("");
        BotonModificarModificarOfertaLaboral.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonModificarModificarOfertaLaboralActionPerformed(evt);
            }
        });

        BotonVolverModificarOfertaLaboral.setBackground(new java.awt.Color(255, 51, 51));
        BotonVolverModificarOfertaLaboral.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonVolverModificarOfertaLaboral.setText("Volver");
        BotonVolverModificarOfertaLaboral.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonVolverModificarOfertaLaboralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonVolverModificarOfertaLaboral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificarModificarOfertaLaboral, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BotonModificarModificarOfertaLaboral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolverModificarOfertaLaboral)
                .addGap(26, 26, 26))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Modificar oferta laboral");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarModificarOfertaLaboralActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonModificarModificarOfertaLaboralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonModificarModificarOfertaLaboralActionPerformed

    private void BotonVolverModificarOfertaLaboralActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonVolverModificarOfertaLaboralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverModificarOfertaLaboralActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonModificarModificarOfertaLaboral;
    private javax.swing.JButton BotonVolverModificarOfertaLaboral;
    private javax.swing.JTextField CampoCodigoModificarOfertaLaboral;
    private javax.swing.JTextField CampoDescripcionModificarOfertaLaboral;
    private javax.swing.JTextField CampoNombreModificarOfertaLaboral;
    private javax.swing.JTextField CampoCargoModificarOfertaLaboral;
    private javax.swing.JTextField CampotTiempoModificarOfertaLaboral;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables


    private int actividad;
    private int alojamiento;
    private String key;
    private String codigo;
    public ModificarOfertaLaboral(String key, String codigo){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.ponerescuchar();
        this.actividad=actividad;
        this.alojamiento=alojamiento;
        this.key = key;
        this.codigo = codigo;

        String result[] = new String[0];
        try {
            InputStream response = new URL("http://localhost:8080/controller/getConvocatoria/"+ this.key+"/"+codigo).openStream();
            result = IOUtils.toString(response, "UTF-8").split("\n");
            response.available();
            response.close();
            this.CampoCodigoModificarOfertaLaboral.setText(result[0].replaceAll("CODIGO: ",""));
            this.CampoCargoModificarOfertaLaboral.setText(result[2].replaceAll("CARGO: ",""));
            this.CampoNombreModificarOfertaLaboral.setText(result[1].replaceAll("NOMBRE COVOCATORIA: ",""));
            this.CampoCodigoModificarOfertaLaboral.setEnabled(false);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void ponerescuchar(){
        this.BotonModificarModificarOfertaLaboral.addActionListener(this);
        this.BotonVolverModificarOfertaLaboral.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.BotonModificarModificarOfertaLaboral){
            String codigo = this.CampoCodigoModificarOfertaLaboral.getText();
            String nombre = this.CampoNombreModificarOfertaLaboral.getText();
            String cargo = this.CampoCargoModificarOfertaLaboral.getText();

            String estado = "";
            try {
                InputStream response = new URL("http://localhost:8080/controller/updateConvocatoria/"+this.key+"/"+codigo+"/"+nombre+"/"+cargo).openStream();
                estado = IOUtils.toString(response,"UTF-8");
                response.available();
                response.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            if(estado.equals("true")){
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                try {
                    new TablaOfertasLaborales(key);
                } catch (Exception a) {
                    a.printStackTrace();
                }
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Modificacion fallida");
            }
        }
        
        if(e.getSource()==this.BotonVolverModificarOfertaLaboral){
            try {
                new TablaOfertasLaborales(this.key);
                this.dispose();
            } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                noSuchAlgorithmException.printStackTrace();
            } catch (IllegalBlockSizeException illegalBlockSizeException) {
                illegalBlockSizeException.printStackTrace();
            } catch (NoSuchPaddingException noSuchPaddingException) {
                noSuchPaddingException.printStackTrace();
            } catch (BadPaddingException badPaddingException) {
                badPaddingException.printStackTrace();
            } catch (InvalidKeyException invalidKeyException) {
                invalidKeyException.printStackTrace();
            }
        }
    }
}