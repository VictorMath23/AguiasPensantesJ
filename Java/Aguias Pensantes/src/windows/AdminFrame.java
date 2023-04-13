/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import implementacao.Dao;
import java.awt.Color;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Table;

/**
 *
 * @author vsilva18
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
     Table tabela_ideias2 = new Table();
    
    public AdminFrame() {
        initComponents();
        
        tb_admin.setModel(tabela_ideias2); 
        
        preencheTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_admin = new javax.swing.JTable();
        txtAid = new javax.swing.JTextField();
        txtAdono = new javax.swing.JTextField();
        txtAarea = new javax.swing.JTextField();
        txtAgestor = new javax.swing.JTextField();
        txtAbeneficio = new javax.swing.JTextField();
        txtAdata = new javax.swing.JTextField();
        txtAstatus = new javax.swing.JTextField();
        btnConcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAproposta = new javax.swing.JTextArea();
        btnRejeitar = new javax.swing.JButton();
        btnAprovar = new javax.swing.JButton();
        txtAdias = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(68, 68, 68));

        jLabel3.setBackground(new java.awt.Color(0, 153, 0));
        jLabel3.setFont(new java.awt.Font("Gotham", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Águias Pensantes");

        jLabel2.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(198, 0, 0));
        jLabel2.setText("Onde sua ideia vale muito.");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/AP.png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/AP.png"))); // NOI18N

        jPanel17.setBackground(new java.awt.Color(28, 28, 28));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btnSair.setBackground(new java.awt.Color(239, 0, 0));
        btnSair.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("SAIR");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tb_admin.setBackground(new java.awt.Color(51, 51, 51));
        tb_admin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tb_admin.setForeground(new java.awt.Color(255, 255, 255));
        tb_admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "dono", "proposta", "area", "beneficio", "gestor", "data da ideia", "status", "dias"
            }
        ));
        tb_admin.setSelectionBackground(new java.awt.Color(237, 80, 73));
        tb_admin.setSelectionForeground(new java.awt.Color(0, 0, 51));
        tb_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_adminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_admin);

        txtAid.setEditable(false);
        txtAid.setBackground(new java.awt.Color(255, 255, 255));
        txtAid.setFont(new java.awt.Font("Gotham", 1, 14)); // NOI18N
        txtAid.setForeground(new java.awt.Color(237, 80, 73));
        txtAid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAid.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "id", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 51))); // NOI18N

        txtAdono.setEditable(false);
        txtAdono.setBackground(new java.awt.Color(255, 255, 255));
        txtAdono.setFont(new java.awt.Font("Gotham", 1, 14)); // NOI18N
        txtAdono.setForeground(new java.awt.Color(237, 80, 73));
        txtAdono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAdono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "dono", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 51))); // NOI18N

        txtAarea.setEditable(false);
        txtAarea.setBackground(new java.awt.Color(255, 255, 255));
        txtAarea.setFont(new java.awt.Font("Gotham", 1, 14)); // NOI18N
        txtAarea.setForeground(new java.awt.Color(237, 80, 73));
        txtAarea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAarea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "area_id", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 51))); // NOI18N

        txtAgestor.setEditable(false);
        txtAgestor.setBackground(new java.awt.Color(255, 255, 255));
        txtAgestor.setFont(new java.awt.Font("Gotham", 1, 14)); // NOI18N
        txtAgestor.setForeground(new java.awt.Color(237, 80, 73));
        txtAgestor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAgestor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "gestor_id", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 51))); // NOI18N

        txtAbeneficio.setEditable(false);
        txtAbeneficio.setBackground(new java.awt.Color(255, 255, 255));
        txtAbeneficio.setFont(new java.awt.Font("Gotham", 1, 14)); // NOI18N
        txtAbeneficio.setForeground(new java.awt.Color(237, 80, 73));
        txtAbeneficio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAbeneficio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "beneficio_id", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 51))); // NOI18N

        txtAdata.setEditable(false);
        txtAdata.setBackground(new java.awt.Color(255, 255, 255));
        txtAdata.setFont(new java.awt.Font("Gotham", 1, 14)); // NOI18N
        txtAdata.setForeground(new java.awt.Color(237, 80, 73));
        txtAdata.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAdata.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "data_ideia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 51))); // NOI18N

        txtAstatus.setBackground(new java.awt.Color(255, 255, 255));
        txtAstatus.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        txtAstatus.setForeground(new java.awt.Color(0, 0, 51));
        if(txtAstatus.getText().equals("Analise")){
            txtAstatus.setForeground(new java.awt.Color(0, 255, 0));
        }
        txtAstatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAstatus.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "STATUS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 51))); // NOI18N
        txtAstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAstatusActionPerformed(evt);
            }
        });

        btnConcluir.setBackground(new java.awt.Color(0, 0, 51));
        btnConcluir.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        btnConcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnConcluir.setText("CONCLUIR");
        btnConcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConcluir.setEnabled(false);
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        txtAproposta.setBackground(new java.awt.Color(255, 255, 255));
        txtAproposta.setColumns(30);
        txtAproposta.setFont(new java.awt.Font("Gotham", 1, 14)); // NOI18N
        txtAproposta.setForeground(new java.awt.Color(237, 80, 73));
        txtAproposta.setLineWrap(true);
        txtAproposta.setRows(10);
        txtAproposta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Proposta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 51))); // NOI18N
        jScrollPane2.setViewportView(txtAproposta);

        btnRejeitar.setBackground(new java.awt.Color(200, 28, 28));
        btnRejeitar.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        btnRejeitar.setForeground(new java.awt.Color(0, 0, 0));
        btnRejeitar.setText("REJEITAR");
        btnRejeitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRejeitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejeitarActionPerformed(evt);
            }
        });

        btnAprovar.setBackground(new java.awt.Color(21, 179, 91));
        btnAprovar.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        btnAprovar.setForeground(new java.awt.Color(0, 0, 0));
        btnAprovar.setText("APROVAR");
        btnAprovar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAprovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprovarActionPerformed(evt);
            }
        });

        txtAdias.setEditable(false);
        txtAdias.setBackground(new java.awt.Color(255, 255, 255));
        txtAdias.setFont(new java.awt.Font("Gotham", 1, 14)); // NOI18N
        txtAdias.setForeground(new java.awt.Color(237, 80, 73));
        txtAdias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAdias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Dias sem resposta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 51))); // NOI18N
        txtAdias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdiasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnRejeitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAprovar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(9, 9, 9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAdias)
                                        .addGap(14, 14, 14))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAid, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAdono, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAarea, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAbeneficio, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgestor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAdata, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAprovar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRejeitar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAstatus)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tb_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_adminMouseClicked
        int selecao = tb_admin.getSelectedRow();
        
        
        String valor_id = tb_admin.getValueAt(selecao, 0).toString();
        String valor_dono = tb_admin.getValueAt(selecao, 1).toString();
        String valor_proposta = tb_admin.getValueAt(selecao, 2).toString();
        String valor_area = tb_admin.getValueAt(selecao, 3).toString();
        String valor_beneficio = tb_admin.getValueAt(selecao, 4).toString();
        String valor_gestor = tb_admin.getValueAt(selecao, 5).toString();
        String valor_data = tb_admin.getValueAt(selecao, 6).toString(); 
        String valor_status = tb_admin.getValueAt(selecao, 7).toString(); 
        String valor_dias = tb_admin.getValueAt(selecao, 8).toString();
        
        
        txtAid.setText(valor_id);
        txtAdono.setText(valor_dono);
        txtAproposta.setText(valor_proposta);
        txtAarea.setText(valor_area);
        txtAbeneficio.setText(valor_beneficio);
        txtAgestor.setText(valor_gestor);
        txtAdata.setText(valor_data);
        txtAstatus.setText(valor_status);
        txtAdias.setText(valor_dias);
        
        
        alterarCorTexto(valor_status);
    }//GEN-LAST:event_tb_adminMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
      
        int dialog = JOptionPane.showConfirmDialog(null, "Deseja realmente SAIR?");
        
        if(dialog == JOptionPane.YES_OPTION){
             dispose();
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        }else{
            
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtAstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAstatusActionPerformed
     
        String status = txtAstatus.getText();
    if (status.equals("Aprovado")) {
        txtAstatus.setForeground(Color.GREEN);
    } else if (status.equals("Analise")) {
        txtAstatus.setForeground(Color.ORANGE);
    } else {
        txtAstatus.setForeground(Color.RED);
    }

    
    }//GEN-LAST:event_txtAstatusActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
 
        try {
            
            Dao statusDao = new Dao();

            int selecao = tb_admin.getSelectedRow();
            
            if(selecao == -1){
                JOptionPane.showMessageDialog(null, "Tabela está vazia ou não há ideia Selecionado.\n"
                                                              + " Por favor, verificar e tentar novamente");
                }else{
                    int dialog = JOptionPane.showConfirmDialog(null, "Deseja Realmente Alterar o status da ideia?");

                    if(dialog == JOptionPane.YES_OPTION){

                        int id = (int) tb_admin.getValueAt(selecao, 0);
                        String status = txtAstatus.getText();

                        statusDao.atualizaStatus(status, id);

                        JOptionPane.showMessageDialog(null, "STATUS Atualizado");

                        limpaCamposAt();  

                        limpaTabela();

                        preencheTabela();

                    }else{

                       JOptionPane.showMessageDialog(null, "Alteração Cancelada");

                    }
                }
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Selecione uma das ideias antes de tentar alterar o status da ideia.");
                System.out.println(e);
            }
                                                     
        
        
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnAprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprovarActionPerformed
        txtAstatus.setText("Aprovada");
        updateColor();
    }//GEN-LAST:event_btnAprovarActionPerformed

    private void btnRejeitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejeitarActionPerformed
        txtAstatus.setText("Rejeitada");
        updateColor();
    }//GEN-LAST:event_btnRejeitarActionPerformed

    private void txtAdiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdiasActionPerformed
        
    }//GEN-LAST:event_txtAdiasActionPerformed

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
                if ("Flatlaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }
    
    public void limpaTabela(){
    
        tabela_ideias2.removeDados();
    
    }
    
    
    public void limpaCamposAt(){
        // campos referente a atualização de dados
        txtAid.setText("");
        txtAdono.setText("");
        txtAproposta.setText("");
        txtAarea.setText("");
        txtAbeneficio.setText("");
        txtAgestor.setText("");
        txtAdata.setText("");
        txtAstatus.setText("");
    
    }
    
    
     private void updateColor() {
        String text = txtAstatus.getText();
        if (text.contains("Analise")) {
            txtAstatus.setForeground(Color.ORANGE);
            btnConcluir.setEnabled(false);
        } else if(text.contains("Rejeitada")) {
            txtAstatus.setForeground(Color.RED);
            btnConcluir.setEnabled(true);
        }else{
            txtAstatus.setForeground(Color.GREEN);
            btnConcluir.setEnabled(true);
        }
    }
    
    public void preencheTabela(){
          
    Dao ideiasDao = new Dao();

    try {
        
        
        List proposta = ideiasDao.lista_PropostaAdmin();

        tabela_ideias2.preencheTabela(proposta);
        
    }catch (Exception e) {
        System.out.println(e);
    }
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAprovar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnRejeitar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_admin;
    private javax.swing.JTextField txtAarea;
    private javax.swing.JTextField txtAbeneficio;
    private javax.swing.JTextField txtAdata;
    private javax.swing.JTextField txtAdias;
    private javax.swing.JTextField txtAdono;
    private javax.swing.JTextField txtAgestor;
    private javax.swing.JTextField txtAid;
    private javax.swing.JTextArea txtAproposta;
    private javax.swing.JTextField txtAstatus;
    // End of variables declaration//GEN-END:variables

    private void alterarCorTexto(String valor_status) {
        if (valor_status.equals("Aprovada")) {
        txtAstatus.setForeground(Color.GREEN);
        btnConcluir.setEnabled(true);
    } else if (valor_status.equals("Analise")) {
        txtAstatus.setForeground(Color.ORANGE);
        btnConcluir.setEnabled(false);
    } else {
        txtAstatus.setForeground(Color.RED);
        btnConcluir.setEnabled(true);
    }
}
}