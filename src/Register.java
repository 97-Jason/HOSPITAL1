
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Register extends javax.swing.JFrame {

    
    javaDB_001 conn= new javaDB_001();
    public Register() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        phamacyTP = new javax.swing.JTabbedPane();
        registrationJP = new javax.swing.JPanel();
        genderCB = new javax.swing.JComboBox<>();
        patientTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        idnumberTF = new javax.swing.JTextField();
        medicalTF = new javax.swing.JTextField();
        medicalJL = new javax.swing.JLabel();
        firstnameJL = new javax.swing.JLabel();
        lastnameJL = new javax.swing.JLabel();
        idnumberJL = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        birthTF = new javax.swing.JTextField();
        registerJB = new javax.swing.JButton();
        deleteJB = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        retrieveJB = new javax.swing.JButton();
        updateJB = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        recordsJT = new javax.swing.JTable();
        testBTN = new javax.swing.JButton();
        diagnosisJP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        okJB = new javax.swing.JButton();
        clearJB1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        diagnosisTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        commentsTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        statusTF = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        phamacyJP = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        doctorsnameJL = new javax.swing.JLabel();
        doctorsnameTF = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setTitle("Patient Register");

        phamacyTP.setBackground(new java.awt.Color(255, 51, 255));

        registrationJP.setBackground(new java.awt.Color(153, 255, 0));
        registrationJP.setForeground(new java.awt.Color(204, 0, 204));

        genderCB.setForeground(new java.awt.Color(204, 0, 102));
        genderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "and Other" }));

        ageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTFActionPerformed(evt);
            }
        });

        medicalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalTFActionPerformed(evt);
            }
        });

        medicalJL.setText("Medical record no.");

        firstnameJL.setText("patient's name");

        lastnameJL.setText("Age");

        idnumberJL.setText("ID number:");

        jLabel16.setText("gender:");

        jLabel18.setText("Date Of Birth");

        registerJB.setText("Register");
        registerJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJBActionPerformed(evt);
            }
        });

        deleteJB.setText("Delete");
        deleteJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteJBMouseClicked(evt);
            }
        });
        deleteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJBActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 204));
        jLabel20.setText("MJAYSON'S HEALTHCARE");

        retrieveJB.setText("Retrieve");
        retrieveJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveJBActionPerformed(evt);
            }
        });

        updateJB.setText("Update");
        updateJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateJBMouseClicked(evt);
            }
        });
        updateJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJBActionPerformed(evt);
            }
        });

        recordsJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Patient's name", "Age", "Diagnosis", "Comments"
            }
        ));
        recordsJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordsJTMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(recordsJT);

        testBTN.setText("Test connection");
        testBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registrationJPLayout = new javax.swing.GroupLayout(registrationJP);
        registrationJP.setLayout(registrationJPLayout);
        registrationJPLayout.setHorizontalGroup(
            registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationJPLayout.createSequentialGroup()
                        .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registrationJPLayout.createSequentialGroup()
                                .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationJPLayout.createSequentialGroup()
                                        .addComponent(lastnameJL, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(registrationJPLayout.createSequentialGroup()
                                        .addComponent(idnumberJL, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)))
                                .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(idnumberTF, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(ageTF)))
                            .addGroup(registrationJPLayout.createSequentialGroup()
                                .addComponent(firstnameJL, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(patientTF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registrationJPLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthTF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(537, 537, 537))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationJPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(medicalJL, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(medicalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(555, 555, 555))))
            .addGroup(registrationJPLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(registrationJPLayout.createSequentialGroup()
                .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registrationJPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4))
                    .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registrationJPLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(registerJB)
                            .addGap(67, 67, 67)
                            .addComponent(deleteJB)
                            .addGap(51, 51, 51)
                            .addComponent(retrieveJB)
                            .addGap(71, 71, 71)
                            .addComponent(updateJB))
                        .addGroup(registrationJPLayout.createSequentialGroup()
                            .addGap(218, 218, 218)
                            .addComponent(testBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        registrationJPLayout.setVerticalGroup(
            registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationJPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel20)
                .addGap(45, 45, 45)
                .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicalJL))
                .addGap(36, 36, 36)
                .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameJL)
                    .addComponent(patientTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(birthTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameJL)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idnumberJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(registrationJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteJB)
                    .addComponent(registerJB)
                    .addComponent(retrieveJB)
                    .addComponent(updateJB))
                .addGap(18, 18, 18)
                .addComponent(testBTN)
                .addGap(10, 10, 10))
        );

        phamacyTP.addTab("Registration form", registrationJP);

        diagnosisJP.setBackground(new java.awt.Color(0, 153, 255));
        diagnosisJP.setPreferredSize(new java.awt.Dimension(684, 600));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Diagnostic Details");

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Gross prescription");

        okJB.setText("Save");
        okJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okJBActionPerformed(evt);
            }
        });

        clearJB1.setText("Clear");
        clearJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJB1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Diagnosis:");

        jLabel11.setText("Comments:");

        commentsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentsTFActionPerformed(evt);
            }
        });

        jLabel12.setText("Status:");

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("DIAGNOSIS DETAILS");

        javax.swing.GroupLayout diagnosisJPLayout = new javax.swing.GroupLayout(diagnosisJP);
        diagnosisJP.setLayout(diagnosisJPLayout);
        diagnosisJPLayout.setHorizontalGroup(
            diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diagnosisJPLayout.createSequentialGroup()
                .addGroup(diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diagnosisJPLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diagnosisJPLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(diagnosisJPLayout.createSequentialGroup()
                                .addGroup(diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(diagnosisTF)
                                    .addComponent(commentsTF)
                                    .addComponent(statusTF, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))))))
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(diagnosisJPLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(okJB)
                .addGap(107, 107, 107)
                .addComponent(clearJB1)
                .addGap(101, 227, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diagnosisJPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(diagnosisJPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        diagnosisJPLayout.setVerticalGroup(
            diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diagnosisJPLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(diagnosisTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(commentsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(statusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(diagnosisJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okJB)
                    .addComponent(clearJB1))
                .addGap(197, 197, 197))
        );

        phamacyTP.addTab("Doctor's diagnosis", diagnosisJP);

        phamacyJP.setBackground(new java.awt.Color(255, 204, 51));

        jButton1.setText("Save");

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        doctorsnameJL.setText("Doctors name:");

        doctorsnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsnameTFActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 51, 0));
        jLabel25.setText("PRESCRIPTION DETAILS");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        jLabel1.setText("medication and frequency");

        javax.swing.GroupLayout phamacyJPLayout = new javax.swing.GroupLayout(phamacyJP);
        phamacyJP.setLayout(phamacyJPLayout);
        phamacyJPLayout.setHorizontalGroup(
            phamacyJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phamacyJPLayout.createSequentialGroup()
                .addGroup(phamacyJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(phamacyJPLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton1)
                        .addGap(118, 118, 118)
                        .addComponent(jButton2))
                    .addGroup(phamacyJPLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(doctorsnameJL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(phamacyJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorsnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(phamacyJPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(phamacyJPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        phamacyJPLayout.setVerticalGroup(
            phamacyJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phamacyJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(37, 37, 37)
                .addGroup(phamacyJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorsnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorsnameJL))
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addGroup(phamacyJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        phamacyTP.addTab("Phamacy prescription", phamacyJP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(phamacyTP, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phamacyTP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medicalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalTFActionPerformed
       
    }//GEN-LAST:event_medicalTFActionPerformed

    private void ageTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTFActionPerformed

    private void deleteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJBActionPerformed
       String idnumber=idnumberTF.getText();
      
      
conn.deleteregistration(idnumber);
    }//GEN-LAST:event_deleteJBActionPerformed

    private void okJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okJBActionPerformed

    private void clearJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJB1ActionPerformed
    
      
      
    }//GEN-LAST:event_clearJB1ActionPerformed

    private void doctorsnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorsnameTFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void updateJBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateJBMouseClicked
     
    }//GEN-LAST:event_updateJBMouseClicked

    private void registerJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerJBActionPerformed
      String patientname=patientTF.getText();
      String idnumber=idnumberTF.getText();
      String gender=genderCB.getSelectedItem().toString();
      String dateofbirth=birthTF.getText();
      String medicalrecordno=medicalTF.getText();
      String age=ageTF.getText();
      String diagnosis=diagnosisTF.getText();
      String comments=commentsTF.getText();
      String status=statusTF.getText();
      String doctorsname=doctorsnameTF.getText();
     
      
      
      
    conn.insertpatientsrecord( patientname, idnumber, gender, dateofbirth, medicalrecordno, age, diagnosis,
            comments, status, doctorsname);
    
    
    }//GEN-LAST:event_registerJBActionPerformed

    private void updateJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJBActionPerformed
     
       try{
           String value1 = null;
           String value2=patientTF.getText();
           String value3=idnumberTF.getText();
           String value4=genderCB.getSelectedItem().toString();
           String value5=birthTF.getText();
           String value6=ageTF.getText();
           
               
           String sql= "UPDATE patientsrecord SET id='"+value1+"',patientname='"+value2+"',idnumber=`"+value3+"'"
           + ",gender=`"+value4+"'',dateofbirth='"+value5+"',age='"+value6+"'";
           
           conn.updateregistration(value1, value2, value3, value4, value5,value6);
           
          
       
       
       } catch(Exception e){
       
       JOptionPane.showMessageDialog(null, e);
       
       }
      
      
    }//GEN-LAST:event_updateJBActionPerformed

    private void testBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testBTNActionPerformed
     conn.getConnection();
    }//GEN-LAST:event_testBTNActionPerformed

    private void deleteJBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteJBMouseClicked
      
    }//GEN-LAST:event_deleteJBMouseClicked

    private void commentsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentsTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentsTFActionPerformed

    private void recordsJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordsJTMouseClicked
      
       
    }//GEN-LAST:event_recordsJTMouseClicked

    private void retrieveJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveJBActionPerformed
        // TODO add your handling code here:
         ResultSet newrs=conn.getpatient();
        try{
            DefaultTableModel newmodel=(DefaultTableModel)recordsJT.getModel();
            while(newrs.next()){
             Vector<String>patientitems=new Vector<String>();
             patientitems.add(newrs.getString("id"));
             patientitems.add(newrs.getString("patientname"));
             patientitems.add(newrs.getString("age"));
             patientitems.add(newrs.getString("diagnosis"));
             patientitems.add(newrs.getString("comments"));
             newmodel.addRow(patientitems);
             
             new SimpleReport(newmodel);
            }
        }
        catch(SQLException x){
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        
    }//GEN-LAST:event_retrieveJBActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTF;
    private javax.swing.JTextField birthTF;
    private javax.swing.JButton clearJB1;
    private javax.swing.JTextField commentsTF;
    private javax.swing.JButton deleteJB;
    private javax.swing.JPanel diagnosisJP;
    private javax.swing.JTextField diagnosisTF;
    private javax.swing.JLabel doctorsnameJL;
    private javax.swing.JTextField doctorsnameTF;
    private javax.swing.JLabel firstnameJL;
    private javax.swing.JComboBox<String> genderCB;
    private javax.swing.JLabel idnumberJL;
    private javax.swing.JTextField idnumberTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lastnameJL;
    private javax.swing.JLabel medicalJL;
    private javax.swing.JTextField medicalTF;
    private javax.swing.JButton okJB;
    private javax.swing.JTextField patientTF;
    private javax.swing.JPanel phamacyJP;
    private javax.swing.JTabbedPane phamacyTP;
    private javax.swing.JTable recordsJT;
    private javax.swing.JButton registerJB;
    private javax.swing.JPanel registrationJP;
    private javax.swing.JButton retrieveJB;
    private javax.swing.JTextField statusTF;
    private javax.swing.JButton testBTN;
    private javax.swing.JButton updateJB;
    // End of variables declaration//GEN-END:variables

    private javaDB_001 insertpatientsrecord(String patientname, String idnumber, String gender, String dateofbirth, 
            String medicalrecordno, String age, String diagnosis, String comments, String status, String doctorsname ) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  
    }

