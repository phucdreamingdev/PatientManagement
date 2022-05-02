/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PatientDAO;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;

/**
 *
 * @author Phuc
 */
public class PatientManagement extends javax.swing.JFrame {

    String[] columnNames = {"ID", "Full Name", "Birthday", "Gender", "Phone",
        "Address", "Occupation", "Workplace"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 8);
    boolean addNew = false;
    boolean tableClick = false;
    Patient tmpPatient;
    PatientDAO dao = new PatientDAO();

    public PatientManagement() {
        initComponents();
        //Set định dạng ngày tháng năm cho JDatChoooser
        birthdayChooser.setDateFormatString("dd/MM/yyyy");
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
        tblPatient.setModel(model);
        model.setRowCount(0);
    }

    public void clearContent() {
        txtPatientID.setText("");
        txtPatientName.setText("");
        birthdayChooser.setDate(null);
        btnGroupGender.clearSelection();
        txtOccupation.setText("");
        txtWorkplace.setText("");
        txtPhone.setText("");
        txtaAddress.setText("");
        txtHINumber.setText("");
        txtaSympton.setText("");
    }

    public void getContent() {
        tmpPatient.setPatientID(txtPatientID.getText().trim());
        tmpPatient.setPatientName(txtPatientName.getText().trim());
        tmpPatient.setBirthday(birthdayChooser.getDate());
        tmpPatient.setGender(rbMale.isSelected());
        tmpPatient.setOccupation(txtOccupation.getText().trim());
        tmpPatient.setWorkplace(txtWorkplace.getText().trim());
        tmpPatient.setPhone(txtPhone.getText().trim());
        tmpPatient.setAddress(txtaAddress.getText().trim());
        tmpPatient.setHealthInsuranceNumber(txtHINumber.getText().trim());
        tmpPatient.setSymptom(txtaSympton.getText().trim());
    }

    public void getAllData() {
        model.setRowCount(0);
        for (Patient patient : dao.patientList) {
            model.addRow(new Object[]{patient.getPatientID(),
                patient.getPatientName(),
                patient.getBirthdayString(),
                patient.getGender(),
                patient.getPhone(),
                patient.getAddress(),
                patient.getOccupation(),
                patient.getWorkplace()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbSortByName = new javax.swing.JComboBox<>();
        btnSearchByName = new javax.swing.JButton();
        txtSearchByName = new javax.swing.JTextField();
        btnGetAllData = new javax.swing.JButton();
        detailedPanel = new javax.swing.JPanel();
        txtPatientID = new javax.swing.JTextField();
        btnSearchByID = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        birthdayChooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtWorkplace = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaAddress = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtHINumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaSympton = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Patient Information Management Software ");

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Main Part", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 0, 204))); // NOI18N
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPanelMouseClicked(evt);
            }
        });

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPatient.setColumnSelectionAllowed(false);
        tblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        jLabel2.setText("Sort by name:");

        cbSortByName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Sort Ascending", "Sort Desending", " " }));
        cbSortByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortByNameActionPerformed(evt);
            }
        });

        btnSearchByName.setText("Search by Name");
        btnSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByNameActionPerformed(evt);
            }
        });

        txtSearchByName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchByNameKeyPressed(evt);
            }
        });

        btnGetAllData.setText("Get all data");
        btnGetAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAllDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(btnSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbSortByName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(btnGetAllData, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbSortByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchByName)
                    .addComponent(txtSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetAllData)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        detailedPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Detailed Part", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 0, 204))); // NOI18N

        btnSearchByID.setText("Search");
        btnSearchByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByIDActionPerformed(evt);
            }
        });

        jLabel4.setText("Patient ID:");

        jLabel3.setText("Patient Name:");

        jLabel5.setText("Birthday:");

        birthdayChooser.setDateFormatString("dd-MM-yyyy");

        jLabel6.setText("Gender:");

        btnGroupGender.add(rbMale);
        rbMale.setText("Male");

        btnGroupGender.add(rbFemale);
        rbFemale.setText("Female");

        jLabel7.setText("Occupation:");

        jLabel8.setText("Workplace:");

        jLabel9.setText("Phone:");

        jLabel10.setText("Address:");

        txtaAddress.setColumns(20);
        txtaAddress.setRows(5);
        jScrollPane2.setViewportView(txtaAddress);

        jLabel11.setText("Health Insurance Number:");

        jLabel12.setText("Sympton:");

        txtaSympton.setColumns(20);
        txtaSympton.setRows(5);
        jScrollPane3.setViewportView(txtaSympton);

        btnAdd.setText("Add New");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailedPanelLayout = new javax.swing.GroupLayout(detailedPanel);
        detailedPanel.setLayout(detailedPanelLayout);
        detailedPanelLayout.setHorizontalGroup(
            detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detailedPanelLayout.createSequentialGroup()
                        .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchByID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPatientName)
                    .addGroup(detailedPanelLayout.createSequentialGroup()
                        .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(birthdayChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailedPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(txtWorkplace, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailedPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(rbMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbFemale))))
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2)
                    .addComponent(txtHINumber, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3)
                    .addGroup(detailedPanelLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailedPanelLayout.setVerticalGroup(
            detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailedPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchByID)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(rbMale)
                        .addComponent(rbFemale))
                    .addComponent(birthdayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtWorkplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtHINumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(detailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSave)
                    .addComponent(btnDelete))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (tableClick == false) {
            addNew = true;
            btnSave.setEnabled(true);
            txtPatientID.setEditable(true);
            clearContent();
            txtPatientID.requestFocus();
        } else {
            tblPatient.clearSelection();
            clearContent();
            btnSave.setEnabled(false);
            btnDelete.setEnabled(false);
            btnAdd.setText("Add New");
            tableClick = false;
            getAllData();
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private boolean[] checkComponentEmpty() {
        boolean[] emptyIndex = new boolean[dao.validIndexArraySize];
        Arrays.fill(emptyIndex, false);
        if (txtPatientID.getText().isEmpty()) {
            emptyIndex[0] = true;
        }
        if (txtPatientName.getText().isEmpty()) {
            emptyIndex[1] = true;
        }
        if (birthdayChooser.getDate() == null) {
            emptyIndex[2] = true;
        }
        if (rbMale.isSelected() == rbFemale.isSelected()) {
            emptyIndex[3] = true;
        }
        if (txtOccupation.getText().isEmpty()) {
            emptyIndex[4] = true;
        }
        if (txtPhone.getText().isEmpty()) {
            emptyIndex[5] = true;
        }
        if (txtWorkplace.getText().isEmpty()) {
            emptyIndex[6] = true;
        }
        if (txtHINumber.getText().isEmpty()) {
            emptyIndex[7] = true;
        }
        return emptyIndex;
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (addNew == true) {
            tmpPatient = new Patient();
            getContent();
            String invalidMessage = dao.getInvalidError(tmpPatient, addNew, checkComponentEmpty());
            if (invalidMessage == "") {
                dao.addNewPatient(tmpPatient);
                getAllData();
                addNew = false;
                btnSave.setEnabled(false);
                clearContent();
            } else {
                JOptionPane.showMessageDialog(this, invalidMessage);
            }
        } else if (tableClick == true) {
            tmpPatient = new Patient();
            getContent();
            String invalidMessage = dao.getInvalidError(tmpPatient, addNew, checkComponentEmpty());
            if (invalidMessage == "") {
                dao.updatePatient(tmpPatient, tblPatient.getSelectedRow());
                getAllData();
                clearContent();
                btnSave.setEnabled(false);
                btnDelete.setEnabled(false);
                btnAdd.setText("Add New");
            } else {
                JOptionPane.showMessageDialog(this, invalidMessage);
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientMouseClicked
        addNew = false;
        tableClick = true;
        btnSave.setEnabled(true);
        btnDelete.setEnabled(true);
        txtPatientID.setEditable(false);
        int i = tblPatient.getSelectedRow();
        txtPatientID.setText(dao.patientList.get(i).getPatientID());
        txtPatientName.setText(dao.patientList.get(i).getPatientName());
        birthdayChooser.setDate(dao.patientList.get(i).getBirthday());
        if (dao.patientList.get(i).isGender() == true) {
            rbMale.setSelected(true);
        } else {
            rbFemale.setSelected(true);
        }
        txtOccupation.setText(dao.patientList.get(i).getOccupation());
        txtWorkplace.setText(dao.patientList.get(i).getWorkplace());
        txtPhone.setText(dao.patientList.get(i).getPhone());
        txtaAddress.setText(dao.patientList.get(i).getAddress());
        txtHINumber.setText(dao.patientList.get(i).getHealthInsuranceNumber());
        txtaSympton.setText(dao.patientList.get(i).getSymptom());
        btnAdd.setText("Cancel");
    }//GEN-LAST:event_tblPatientMouseClicked

    private void mainPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseClicked
        if (addNew == false) {
            tblPatient.clearSelection();
            clearContent();
            btnSave.setEnabled(false);
            btnDelete.setEnabled(false);
            btnAdd.setText("Add New");
            tableClick = false;
        }
    }//GEN-LAST:event_mainPanelMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int i = tblPatient.getSelectedRow();
        if (JOptionPane.showConfirmDialog(this, "Do you want to remove Patient "
                + dao.patientList.get(i).getPatientID() + " "
                + dao.patientList.get(i).getPatientName() + "?")
                == JOptionPane.OK_OPTION) {
            dao.removePatient(i);
            getAllData();
            JOptionPane.showMessageDialog(this, "Remove successfully.");
            btnAdd.setText("Add New");
            btnSave.setEnabled(false);
            btnDelete.setEnabled(false);
            clearContent();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByIDActionPerformed
        String patientID = JOptionPane.showInputDialog("Input Patient ID to Search");
        int i = dao.searchByID(patientID);
        if (i != -1) {
            model.setRowCount(0);
            model.addRow(new Object[]{dao.patientList.get(i).getPatientID(),
                dao.patientList.get(i).getPatientName(),
                dao.patientList.get(i).getBirthdayString(),
                dao.patientList.get(i).getGender(),
                dao.patientList.get(i).getPhone(),
                dao.patientList.get(i).getAddress(),
                dao.patientList.get(i).getOccupation(),
                dao.patientList.get(i).getWorkplace()});
            addNew = false;
            tableClick = true;
            btnSave.setEnabled(true);
            btnDelete.setEnabled(true);
            txtPatientID.setEditable(false);
            txtPatientID.setText(dao.patientList.get(i).getPatientID());
            txtPatientName.setText(dao.patientList.get(i).getPatientName());
            birthdayChooser.setDate(dao.patientList.get(i).getBirthday());
            if (dao.patientList.get(i).isGender() == true) {
                rbMale.setSelected(true);
            } else {
                rbFemale.setSelected(true);
            }
            txtOccupation.setText(dao.patientList.get(i).getOccupation());
            txtWorkplace.setText(dao.patientList.get(i).getWorkplace());
            txtPhone.setText(dao.patientList.get(i).getPhone());
            txtaAddress.setText(dao.patientList.get(i).getAddress());
            txtHINumber.setText(dao.patientList.get(i).getHealthInsuranceNumber());
            txtaSympton.setText(dao.patientList.get(i).getSymptom());
            btnAdd.setText("Cancel");
        } else {
            JOptionPane.showMessageDialog(this, "Not found.");
            getAllData();
        }
    }//GEN-LAST:event_btnSearchByIDActionPerformed

    private void cbSortByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortByNameActionPerformed
        if (cbSortByName.getSelectedIndex() == 1) {
            dao.sortAscendingByPatientName();
            getAllData();
        }
        if (cbSortByName.getSelectedIndex() == 2) {
            dao.sortDescendingByPatientName();
            getAllData();
        }
    }//GEN-LAST:event_cbSortByNameActionPerformed

    private void btnSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByNameActionPerformed
        if (txtSearchByName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nothing to search");
        } else {
            String patientName = txtSearchByName.getText();
            List<Patient> resultList = dao.searchByPatientName(patientName);
            if (resultList.size() > 0) {
                model.setRowCount(0);
                for (Patient patient : resultList) {
                    model.addRow(new Object[]{patient.getPatientID(),
                        patient.getPatientName(),
                        patient.getBirthdayString(),
                        patient.getGender(),
                        patient.getPhone(),
                        patient.getAddress(),
                        patient.getOccupation(),
                        patient.getWorkplace()});
                }
            } else {
                JOptionPane.showMessageDialog(this, "Patient '" + patientName
                        + "'" + " is not found");
                txtSearchByName.setText("");
                getAllData();
            }

        }
    }//GEN-LAST:event_btnSearchByNameActionPerformed

    private void btnGetAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAllDataActionPerformed
        tableClick = false;
        getAllData();
        clearContent();
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
        btnAdd.setText("Add New");
        tblPatient.clearSelection();
        txtSearchByName.setText("");

    }//GEN-LAST:event_btnGetAllDataActionPerformed

    private void txtSearchByNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchByNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSearchByNameActionPerformed(null);
        }
    }//GEN-LAST:event_txtSearchByNameKeyPressed

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
            java.util.logging.Logger.getLogger(PatientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser birthdayChooser;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetAllData;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchByID;
    private javax.swing.JButton btnSearchByName;
    private javax.swing.JComboBox<String> cbSortByName;
    private javax.swing.JPanel detailedPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtHINumber;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearchByName;
    private javax.swing.JTextField txtWorkplace;
    private javax.swing.JTextArea txtaAddress;
    private javax.swing.JTextArea txtaSympton;
    // End of variables declaration//GEN-END:variables
}
