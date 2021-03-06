
package vista.GUI_usuario_Ofertas;

import org.apache.commons.io.IOUtils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class TablaOfertasEmpresa extends javax.swing.JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BotonAplicarOfertaTablaOfertasEmpresa = new javax.swing.JButton();
        BotonVolverTablaOfertasEmpresa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaOfertasEmpresa = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonAplicarOfertaTablaOfertasEmpresa.setBackground(new java.awt.Color(0, 0, 255));
        BotonAplicarOfertaTablaOfertasEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonAplicarOfertaTablaOfertasEmpresa.setText("Aplicar");
        BotonAplicarOfertaTablaOfertasEmpresa.setToolTipText("");
        BotonAplicarOfertaTablaOfertasEmpresa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonAplicarOfertaTablaOfertasEmpresaActionPerformed(evt);
            }
        });

        BotonVolverTablaOfertasEmpresa.setBackground(new java.awt.Color(255, 51, 51));
        BotonVolverTablaOfertasEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonVolverTablaOfertasEmpresa.setText("Volver");
        BotonVolverTablaOfertasEmpresa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonVolverTablaOfertasEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonVolverTablaOfertasEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAplicarOfertaTablaOfertasEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonAplicarOfertaTablaOfertasEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolverTablaOfertasEmpresa)
                .addContainerGap())
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        TablaOfertasEmpresa.setModel(new DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaOfertasEmpresa);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ofertas empresa seleccionada");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAplicarOfertaTablaOfertasEmpresaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonAplicarOfertaTablaOfertasEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAplicarOfertaTablaOfertasEmpresaActionPerformed

    private void BotonVolverTablaOfertasEmpresaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonVolverTablaOfertasEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverTablaOfertasEmpresaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAplicarOfertaTablaOfertasEmpresa;
    private javax.swing.JButton BotonVolverTablaOfertasEmpresa;
    private javax.swing.JTable TablaOfertasEmpresa;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel modelo1;
    private String key;
    private String empresa;

    public TablaOfertasEmpresa(String key, String emp){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.ponerescuchar();
        this.key = key;
        this.empresa = emp;

        String convocatorias[] = new String[0];
        try {
            InputStream response = new URL("http://localhost:8080/controller/getConvocatoriasM/"+emp).openStream();
            convocatorias = IOUtils.toString(response,"UTF-8").replaceAll("\\[","")
                    .replaceAll("\"","")
                    .replaceAll("\\\\n","")
                    .replaceAll("NOMBRE COVOCATORIA:"," ||| NOMBRE COVOCATORIA:")
                    .replaceAll("CARGO:"," ||| CARGO:")
                    .replaceAll("DESCRIPCION:"," ||| DESCRIPCION:")
                    .replaceAll("\\]","")
                    .split(",");
            response.available();
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String col[] = {"Ofertas"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        this.TablaOfertasEmpresa.setModel(tableModel);
        for (String c:convocatorias) {
            tableModel.addRow(new Object[]{c});
        }
        this.TablaOfertasEmpresa.setModel(tableModel);
    }
    
    private void ponerescuchar()
    {
        this.BotonAplicarOfertaTablaOfertasEmpresa.addActionListener(this);
        this.BotonVolverTablaOfertasEmpresa.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.BotonAplicarOfertaTablaOfertasEmpresa){
            try {
                String temp = JOptionPane.showInputDialog("Codigo de la convocatoria que desea aplicar");
                InputStream response = new URL("http://localhost:8080/controller/addConvocatoria/"+ this.key+"/"+temp+"_"+this.empresa).openStream();
                String result = IOUtils.toString(response, "UTF-8");
                response.available();
                response.close();
                if(result.equals("true")){
                    JOptionPane.showMessageDialog(null,"Aplicaion Exitosa");
                }else {
                    JOptionPane.showMessageDialog(null,"Aplicaion Fallida");
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        
        if(e.getSource()==this.BotonVolverTablaOfertasEmpresa){
            new TablaEmpresasUser(this.key);
            this.dispose();
        }
    }   
}