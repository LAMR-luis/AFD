/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afd;

import com.google.common.collect.Lists;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mar_l
 */
public class form extends javax.swing.JFrame {

    int aux;
    int fila_q0;
    String alf;
    String q;
    String qf;
    String q0;
    List<String> lista_alf;
    List<String> lista_q;
    List<String> lista_qf;
    String[] array_alf;
    String[] array_q;
    String[] array_qf;
    transicion[][] trans;
    File objetofile;
    File archivo;
    int n;

    int aux_ns;
    String dotcad;

    /**
     * Creates new form form
     */
    public form() {
        initComponents();

        btnimg.setEnabled(false);

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
        txtalf = new rojeru_san.rsfield.RSTextFullRound();
        txtq = new rojeru_san.rsfield.RSTextFullRound();
        txtq0 = new rojeru_san.rsfield.RSTextFullRound();
        txtqf = new rojeru_san.rsfield.RSTextFullRound();
        btngenerar = new rojerusan.RSButtonRound();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtcad = new rojeru_san.rsfield.RSTextFullRound();
        txtres = new rojeru_san.rsfield.RSTextFullRound();
        txtfinalq = new rojeru_san.rsfield.RSTextFullRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnevaluar = new rojerusan.RSButtonRound();
        btnimg = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtres1 = new rojeru_san.rsfield.RSTextFullRound();
        jLabel4 = new javax.swing.JLabel();
        btnlimpiar = new rojerusan.RSButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Datos"));

        txtalf.setForeground(new java.awt.Color(0, 0, 0));
        txtalf.setBorderColor(new java.awt.Color(0, 0, 0));
        txtalf.setFont(new java.awt.Font("Roboto Bold", 1, 11)); // NOI18N
        txtalf.setPhColor(new java.awt.Color(0, 0, 0));
        txtalf.setPlaceholder("Alfabeto...");

        txtq.setForeground(new java.awt.Color(0, 0, 0));
        txtq.setBorderColor(new java.awt.Color(0, 0, 0));
        txtq.setFont(new java.awt.Font("Roboto Bold", 1, 11)); // NOI18N
        txtq.setPhColor(new java.awt.Color(0, 0, 0));
        txtq.setPlaceholder("Estados...");
        txtq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqActionPerformed(evt);
            }
        });

        txtq0.setForeground(new java.awt.Color(0, 0, 0));
        txtq0.setBorderColor(new java.awt.Color(0, 0, 0));
        txtq0.setFont(new java.awt.Font("Roboto Bold", 1, 11)); // NOI18N
        txtq0.setPhColor(new java.awt.Color(0, 0, 0));
        txtq0.setPlaceholder("Estado Inicial");
        txtq0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtq0ActionPerformed(evt);
            }
        });

        txtqf.setForeground(new java.awt.Color(0, 0, 0));
        txtqf.setBorderColor(new java.awt.Color(0, 0, 0));
        txtqf.setFont(new java.awt.Font("Roboto Bold", 1, 11)); // NOI18N
        txtqf.setPhColor(new java.awt.Color(0, 0, 0));
        txtqf.setPlaceholder("Estados Finales");
        txtqf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqfActionPerformed(evt);
            }
        });

        btngenerar.setBackground(new java.awt.Color(0, 0, 0));
        btngenerar.setText("Generar Tabla de transiciones");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtq, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addComponent(txtalf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtq0, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtqf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtalf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtq, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtq0, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtqf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Tabla de transiciones"));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Visualización"));

        txtcad.setForeground(new java.awt.Color(0, 0, 0));
        txtcad.setBorderColor(new java.awt.Color(0, 0, 0));
        txtcad.setPhColor(new java.awt.Color(0, 0, 0));
        txtcad.setPlaceholder("Cadena a evaluar...");

        txtres.setEditable(false);
        txtres.setForeground(new java.awt.Color(0, 0, 0));
        txtres.setBorderColor(new java.awt.Color(0, 0, 0));
        txtres.setEnabled(false);
        txtres.setPhColor(new java.awt.Color(0, 0, 0));
        txtres.setPlaceholder("Resultado");

        txtfinalq.setEditable(false);
        txtfinalq.setForeground(new java.awt.Color(0, 0, 0));
        txtfinalq.setBorderColor(new java.awt.Color(0, 0, 0));
        txtfinalq.setEnabled(false);
        txtfinalq.setPhColor(new java.awt.Color(0, 0, 0));
        txtfinalq.setPlaceholder("Estado final");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadena:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Resultado:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Estado final de la cadena ingresada:");

        btnevaluar.setBackground(new java.awt.Color(0, 0, 0));
        btnevaluar.setText("Evaluar");
        btnevaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnevaluarActionPerformed(evt);
            }
        });

        btnimg.setText("Abrir imagen");
        btnimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimgActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Exp. Regular:");

        txtres1.setEditable(false);
        txtres1.setForeground(new java.awt.Color(0, 0, 0));
        txtres1.setBorderColor(new java.awt.Color(0, 0, 0));
        txtres1.setEnabled(false);
        txtres1.setPhColor(new java.awt.Color(0, 0, 0));
        txtres1.setPlaceholder("Resultado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnevaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnimg)
                        .addGap(167, 167, 167))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtres1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtfinalq, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(txtcad, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtres, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfinalq, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtres1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnevaluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnimg)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N

        btnlimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqActionPerformed

    private void txtq0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtq0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtq0ActionPerformed

    private void txtqfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqfActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed

        alf = txtalf.getText();

        q = txtq.getText();

        qf = txtqf.getText();

        q0 = txtq0.getText();
        if (q.contains(q0) == true) {
            array_alf = alf.split(",");
            array_q = q.split(",");
            array_qf = qf.split(",");

            List<String> titulos = new ArrayList<String>();
            titulos.add(0, "Q");
            int com = 0;
            for (int i = 0; i < array_qf.length; i++) {
                for (int j = 0; j < array_q.length; j++) {
                    if (array_q[j].equals(array_qf[i])) {
                        com++;
                    }
                }
            }
            if (com == array_qf.length) {

                for (int i = 0; i < array_alf.length; i++) {
                    titulos.add(array_alf[i]);
                }
                String[] atitulos = new String[titulos.size()];
                atitulos = titulos.toArray(atitulos);

                DefaultTableModel mod = new DefaultTableModel(null, atitulos);
//                String[] filas = new String[atitulos.length];
                for (int i = 0; i < array_q.length; i++) {
                    mod.addRow(new Object[]{array_q[i]});
                }

                tabla.setModel(mod);

            } else {
                JOptionPane.showMessageDialog(null, "qf no se encuentra(n) en los estados declarados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "q0 no se encuentra en los estados declarados");
        }


    }//GEN-LAST:event_btngenerarActionPerformed

    private void btnevaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnevaluarActionPerformed
        btnimg.setEnabled(true);

        lista_alf = Lists.newArrayList(array_alf);
        lista_q = Lists.newArrayList(array_q);
        lista_qf = Lists.newArrayList(array_qf);
        dotcad = "";

        trans = new transicion[tabla.getRowCount()][tabla.getColumnCount() - 1];
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[i].length; j++) {

                if (tabla.getValueAt(i, j + 1).toString().equals("null") || tabla.getValueAt(i, j + 1).toString().equals("-") || tabla.getValueAt(i, j + 1).toString().equals(" ")) {
                    trans[i][j] = new transicion(lista_q.get(i), lista_alf.get(j), null);
                } else {
                    trans[i][j] = new transicion(lista_q.get(i), lista_alf.get(j), tabla.getValueAt(i, j + 1).toString());
                    dotcad = dotcad + lista_q.get(i) + " -> " + tabla.getValueAt(i, j + 1).toString() + " [label=" + lista_alf.get(j) + "];" + "\n";
                }

                if (lista_q.get(i).equals(q0)) {
                    fila_q0 = i;

                }
            }

        }
        dotcad = dotcad + q0 + "[color=green];" + "\n";

        String cad = txtcad.getText();
        char[] cad_rev = cad.toCharArray();
        List<String> lista_cad = new ArrayList<String>();
        for (char obj : cad_rev) {

            lista_cad.add(Character.toString(obj));
        }

        n = cad.length();
        aux_ns = 0;
        String next_state = null;
        boolean aceptado = true;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < lista_alf.size(); j++) {

                if (trans[fila_q0][j].getLetra().equals(String.valueOf(cad.charAt(0)))) {
                    next_state = trans[fila_q0][j].getEstado_obj();
                    if (next_state == null) {

                        JOptionPane.showMessageDialog(null, "Imposible continuar, transicion inexistente");
                        aceptado = false;

                    } else {
                        for (int k = 0; k < lista_q.size(); k++) {
                            if (lista_q.get(k).equals(next_state)) {
                                fila_q0 = k;

                            }
                        }
                    }

                }

            }

            cad = cad.substring(1, cad.length());
            if (aceptado == false) {
                next_state = "error";
                break;

            }
        }
        for (int i = 0; i < lista_qf.size(); i++) {
            dotcad = dotcad + lista_qf.get(i) + "[shape=doublecircle];";
            if (next_state.equals(lista_qf.get(i))) {

                txtres.setText("Aceptado");
                txtfinalq.setText(next_state);

            } else {
                txtres.setText("Rechazado");
                txtfinalq.setText(next_state);
            }
        }

        dotcad = "digraph g {" + "\n" + "rankdir=LR;" + "\n" + dotcad + "\n }";

        try{
       File archivo=new File(System.getProperty("user.dir")+"\\grafo.dot");
            System.out.println(archivo.getAbsolutePath());
         
                archivo.createNewFile();
            
       
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("");
    
        
        
        bw.write(dotcad);
        
        bw.flush();
         bw.close();
        
       } catch (IOException ex) {
                Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            generarimagen(dotcad, archivo);

        } catch (IOException ex) {
            Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnevaluarActionPerformed

    private void btnimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimgActionPerformed
        try {
            Desktop.getDesktop().open(objetofile);
        } catch (IOException ex) {
            Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnimgActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtalf.setText("");
        txtq.setText("");
        txtq0.setText("");
        txtqf.setText("");
        txtcad.setText("");
        txtres.setText("");
        txtfinalq.setText("");
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        int a = tabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }

    }//GEN-LAST:event_btnlimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonRound btnevaluar;
    private rojerusan.RSButtonRound btngenerar;
    private javax.swing.JButton btnimg;
    private rojerusan.RSButtonRound btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private rojeru_san.rsfield.RSTextFullRound txtalf;
    private rojeru_san.rsfield.RSTextFullRound txtcad;
    private rojeru_san.rsfield.RSTextFullRound txtfinalq;
    private rojeru_san.rsfield.RSTextFullRound txtq;
    private rojeru_san.rsfield.RSTextFullRound txtq0;
    private rojeru_san.rsfield.RSTextFullRound txtqf;
    private rojeru_san.rsfield.RSTextFullRound txtres;
    private rojeru_san.rsfield.RSTextFullRound txtres1;
    // End of variables declaration//GEN-END:variables

    public void generarimagen(String dotcad, File archivo) throws IOException {
        archivo = new File("C:\\Users\\mar_l\\Desktop"+ "\\grafo.dot");

        BufferedWriter bw;
        if (!archivo.exists()) {
            archivo.createNewFile();
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("");
        }
        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write(dotcad);
        bw.flush();
        bw.close();

        String cmd = "dot -Tpng " + archivo.getAbsolutePath() + " -o " +"C:\\Users\\mar_l\\Desktop"+ "\\grafo.png";
        Runtime.getRuntime().exec(cmd);

        objetofile = new File("C:\\Users\\mar_l\\Desktop"+ "\\grafo.png");
        if (!objetofile.exists()) {
            objetofile.createNewFile();
        }
    }
}
