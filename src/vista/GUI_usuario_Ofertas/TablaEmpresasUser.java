
package vista.GUI_usuario_Ofertas;

import org.apache.commons.io.IOUtils;
import vista.GUI_Administrador.ModificarEmpresa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.NoSuchAlgorithmException;

public class TablaEmpresasUser extends JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel();
        BotonVerOfertasTablaEmpresasUser = new JButton();
        BotonVolverTablaEmpresasUser = new JButton();
        jScrollPane2 = new JScrollPane();
        TablaEmpresaUser = new JTable();
        jPanel4 = new JPanel();
        jLabel3 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonVerOfertasTablaEmpresasUser.setBackground(new java.awt.Color(0, 0, 255));
        BotonVerOfertasTablaEmpresasUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonVerOfertasTablaEmpresasUser.setText("Ver ofertas");
        BotonVerOfertasTablaEmpresasUser.setToolTipText("");
        BotonVerOfertasTablaEmpresasUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonVerOfertasTablaEmpresasUserActionPerformed(evt);
            }
        });

        BotonVolverTablaEmpresasUser.setBackground(new java.awt.Color(255, 51, 51));
        BotonVolverTablaEmpresasUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonVolverTablaEmpresasUser.setText("Volver");
        BotonVolverTablaEmpresasUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonVolverTablaEmpresasUserActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonVolverTablaEmpresasUser, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVerOfertasTablaEmpresasUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonVerOfertasTablaEmpresasUser)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolverTablaEmpresasUser)
                .addContainerGap())
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        TablaEmpresaUser.setModel(new DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaEmpresaUser);

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
                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVerOfertasTablaEmpresasUserActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonVerOfertasTablaEmpresasUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVerOfertasTablaEmpresasUserActionPerformed

    private void BotonVolverTablaEmpresasUserActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BotonVolverTablaEmpresasUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverTablaEmpresasUserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton BotonVerOfertasTablaEmpresasUser;
    private JButton BotonVolverTablaEmpresasUser;
    private JTable TablaEmpresaUser;
    private JLabel jLabel3;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel modelo1;
    private String key;

    public TablaEmpresasUser(String key){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.key = key;
        this.ponerescuchar();
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
        this.TablaEmpresaUser.setModel(tableModel);
        for (String c:empresas) {
            tableModel.addRow(new Object[]{c});
        }
        this.TablaEmpresaUser.setModel(tableModel);
    }
    
    private void ponerescuchar()
    {
        this.BotonVerOfertasTablaEmpresasUser.addActionListener(this);
        this.BotonVolverTablaEmpresasUser.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.BotonVerOfertasTablaEmpresasUser){
            String temp = JOptionPane.showInputDialog(null, "Nombre de la empresa");
            try {
                if(temp != null){
                    InputStream response = new URL("http://localhost:8080/controller/getConvocatoriasM/"+temp).openStream();
                    String result = IOUtils.toString(response, "UTF-8");
                    response.available();
                    response.close();
                    System.out.println(result);
                    if(result.length()>5){
                        new TablaOfertasEmpresa(this.key,temp);
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
        
        if(e.getSource()==this.BotonVolverTablaEmpresasUser){
            new MenuUsuario(this.key);
            this.dispose();
        }
    }   
}