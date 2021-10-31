/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.userInterface;

import aed_assignment4.model.Patient;
import aed_assignment4.model.PatientDirectory;
import aed_assignment4.model.Person;
import aed_assignment4.model.PersonDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 18577
 */
public class AdminScreen extends javax.swing.JFrame {
    
        DefaultTableModel personDirectoryTableModel;
        DefaultTableModel patientDirTableModel;
        PersonDirectory personDirectory;
        PatientDirectory patientDirectory;


    /**
     * Creates new form AdminScreen
     */
    public AdminScreen() {
        this.personDirectory = new PersonDirectory();
        this.patientDirectory = new PatientDirectory();
        initPatientDirModel();
        initPersonDirModel();
        initComponents();
        populatePersonDirectoryTable();
    }
    
    private void initPatientDirModel() {
    
        patientDirTableModel = new DefaultTableModel();
        patientDirTableModel.addColumn("Name");
        patientDirTableModel.addColumn("Age");
        patientDirTableModel.addColumn("Community");
        patientDirTableModel.addColumn("Doctor Name");
        patientDirTableModel.addColumn("Allergies");
    
    
    }
    
    private void initPersonDirModel() {
        personDirectoryTableModel = new DefaultTableModel();
        personDirectoryTableModel.addColumn("Name");
        personDirectoryTableModel.addColumn("Age");
        personDirectoryTableModel.addColumn("Community");
        personDirectoryTableModel.addColumn("City");
        personDirectoryTableModel.addColumn("Address");
        personDirectoryTableModel.addColumn("Zip Code");

    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminScreenTabbedPane = new javax.swing.JTabbedPane();
        personJPanel = new javax.swing.JPanel();
        personDirectoryScollPanel = new javax.swing.JScrollPane();
        personDirTable = new javax.swing.JTable();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        personDirLabel = new javax.swing.JLabel();
        personDirAdminHeaderLabel = new javax.swing.JLabel();
        personNameLabel = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageSlider = new javax.swing.JSlider();
        saveChangesButton = new javax.swing.JButton();
        cityLabel = new javax.swing.JLabel();
        personNameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        zipCodeLabel = new javax.swing.JLabel();
        zipCodeTextField = new javax.swing.JTextField();
        communityLabel = new javax.swing.JLabel();
        communityTextField = new javax.swing.JTextField();
        patientJPanel = new javax.swing.JPanel();
        personDirectoryPatTabScollPanel = new javax.swing.JScrollPane();
        personDirPatTabTable = new javax.swing.JTable();
        markPersonAsPatientButton = new javax.swing.JButton();
        personDirectoryPatientTabLabel = new javax.swing.JLabel();
        doctorNameLabel = new javax.swing.JLabel();
        doctorNameTextField = new javax.swing.JTextField();
        allergyJListPane = new javax.swing.JScrollPane();
        allergyList = new javax.swing.JList<>();
        allergyLabel = new javax.swing.JLabel();
        selectedPatientNameLabel = new javax.swing.JLabel();
        selectedPatientValue = new javax.swing.JLabel();
        saveAsPatientButton = new javax.swing.JButton();
        patientDirectoryTab = new javax.swing.JPanel();
        patientDirectoryPatientTabLabel = new javax.swing.JLabel();
        patientDirectoryScrollPane1 = new javax.swing.JScrollPane();
        patientDirectoryTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        personDirTable.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        personDirTable.setForeground(new java.awt.Color(0, 0, 102));
        personDirTable.setModel(personDirectoryTableModel);
        personDirTable.setRowHeight(40);
        personDirTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        personDirectoryScollPanel.setViewportView(personDirTable);

        createButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        createButton.setForeground(new java.awt.Color(0, 0, 102));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 0, 102));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        viewButton.setForeground(new java.awt.Color(0, 0, 102));
        viewButton.setText("View ");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 0, 102));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        personDirLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        personDirLabel.setForeground(new java.awt.Color(0, 0, 102));
        personDirLabel.setText("Person Directory");

        personDirAdminHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        personDirAdminHeaderLabel.setForeground(new java.awt.Color(0, 0, 102));
        personDirAdminHeaderLabel.setText(" ");

        personNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        personNameLabel.setForeground(new java.awt.Color(0, 0, 102));
        personNameLabel.setText("Name :");

        cityTextField.setForeground(new java.awt.Color(0, 0, 102));
        cityTextField.setText(" ");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(0, 0, 102));
        ageLabel.setText("Age:");

        ageSlider.setForeground(new java.awt.Color(0, 0, 102));
        ageSlider.setMinimum(1);
        ageSlider.setMinorTickSpacing(1);
        ageSlider.setPaintLabels(true);
        ageSlider.setSnapToTicks(true);
        ageSlider.setToolTipText("");

        saveChangesButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        saveChangesButton.setText("Save");
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

        cityLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(0, 0, 102));
        cityLabel.setText("City: ");

        personNameTextField.setForeground(new java.awt.Color(0, 0, 102));
        personNameTextField.setText(" ");

        addressLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(0, 0, 102));
        addressLabel.setText("Address: ");

        addressTextField.setForeground(new java.awt.Color(0, 0, 102));
        addressTextField.setText(" ");

        zipCodeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        zipCodeLabel.setForeground(new java.awt.Color(0, 0, 102));
        zipCodeLabel.setText("Zip Code: ");

        zipCodeTextField.setForeground(new java.awt.Color(0, 0, 102));
        zipCodeTextField.setText(" ");

        communityLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        communityLabel.setForeground(new java.awt.Color(0, 0, 102));
        communityLabel.setText("Community: ");

        communityTextField.setForeground(new java.awt.Color(0, 0, 102));
        communityTextField.setText(" ");

        javax.swing.GroupLayout personJPanelLayout = new javax.swing.GroupLayout(personJPanel);
        personJPanel.setLayout(personJPanelLayout);
        personJPanelLayout.setHorizontalGroup(
            personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personJPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personDirectoryScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personDirAdminHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(personJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(viewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addGap(47, 47, 47))
            .addGroup(personJPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(personJPanelLayout.createSequentialGroup()
                        .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(personJPanelLayout.createSequentialGroup()
                                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(zipCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(personJPanelLayout.createSequentialGroup()
                                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(communityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(communityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        personJPanelLayout.setVerticalGroup(
            personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(personDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personDirectoryScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(viewButton)
                    .addComponent(createButton)
                    .addComponent(personDirAdminHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personNameLabel)
                    .addComponent(personNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ageLabel)
                    .addComponent(ageSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(communityLabel)
                    .addComponent(communityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel)
                    .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCodeLabel))
                .addGap(39, 39, 39)
                .addComponent(saveChangesButton)
                .addContainerGap(402, Short.MAX_VALUE))
        );

        adminScreenTabbedPane.addTab("Person", personJPanel);

        patientJPanel.setAutoscrolls(true);

        personDirPatTabTable.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        personDirPatTabTable.setForeground(new java.awt.Color(0, 0, 102));
        personDirPatTabTable.setModel(personDirectoryTableModel);
        personDirPatTabTable.setRowHeight(40);
        personDirPatTabTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        personDirectoryPatTabScollPanel.setViewportView(personDirPatTabTable);

        markPersonAsPatientButton.setText("Mark Person as Patient");
        markPersonAsPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markPersonAsPatientButtonActionPerformed(evt);
            }
        });

        personDirectoryPatientTabLabel.setText("Person Directory");

        doctorNameLabel.setText(" Doctor Name: ");

        doctorNameTextField.setText(" ");

        allergyList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Egg", "Pollen", "Dust Mites", "Peanut", "    " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        allergyJListPane.setViewportView(allergyList);

        allergyLabel.setText("Allergies: ");

        selectedPatientNameLabel.setText("Patient Name: ");

        selectedPatientValue.setText(" ");

        saveAsPatientButton.setText("Save as Patient");
        saveAsPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsPatientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patientJPanelLayout = new javax.swing.GroupLayout(patientJPanel);
        patientJPanel.setLayout(patientJPanelLayout);
        patientJPanelLayout.setHorizontalGroup(
            patientJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientJPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(patientJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientJPanelLayout.createSequentialGroup()
                        .addComponent(personDirectoryPatTabScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(451, Short.MAX_VALUE))
                    .addGroup(patientJPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(patientJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patientJPanelLayout.createSequentialGroup()
                                .addComponent(allergyLabel)
                                .addGap(74, 74, 74)
                                .addComponent(allergyJListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(patientJPanelLayout.createSequentialGroup()
                                .addComponent(selectedPatientNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectedPatientValue, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(markPersonAsPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(patientJPanelLayout.createSequentialGroup()
                                .addComponent(doctorNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doctorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(saveAsPatientButton))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(patientJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(patientJPanelLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(personDirectoryPatientTabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1365, Short.MAX_VALUE)))
        );
        patientJPanelLayout.setVerticalGroup(
            patientJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientJPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(personDirectoryPatTabScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(markPersonAsPatientButton)
                .addGap(18, 18, 18)
                .addGroup(patientJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedPatientNameLabel)
                    .addComponent(selectedPatientValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(patientJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allergyJListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(patientJPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(allergyLabel)))
                .addGap(30, 30, 30)
                .addComponent(saveAsPatientButton)
                .addGap(405, 405, 405))
            .addGroup(patientJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(patientJPanelLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(personDirectoryPatientTabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1066, Short.MAX_VALUE)))
        );

        adminScreenTabbedPane.addTab("Patient", patientJPanel);

        patientDirectoryPatientTabLabel.setText("Patient Directory");

        patientDirectoryTable.setModel(patientDirTableModel);
        patientDirectoryScrollPane1.setViewportView(patientDirectoryTable);

        javax.swing.GroupLayout patientDirectoryTabLayout = new javax.swing.GroupLayout(patientDirectoryTab);
        patientDirectoryTab.setLayout(patientDirectoryTabLayout);
        patientDirectoryTabLayout.setHorizontalGroup(
            patientDirectoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientDirectoryTabLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(patientDirectoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientDirectoryScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientDirectoryPatientTabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        patientDirectoryTabLayout.setVerticalGroup(
            patientDirectoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientDirectoryTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(patientDirectoryPatientTabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(patientDirectoryScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        adminScreenTabbedPane.addTab("Patient Directory", patientDirectoryTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(adminScreenTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminScreenTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void markPersonAsPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markPersonAsPatientButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = personDirPatTabTable.getSelectedRow();

        if(selectedRowIndex == -1) {
            JOptionPane.showConfirmDialog(null,
                "No record selected to mark as patient",
                "Error!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
            return;
        } else {

            Person selectedPer = personDirectory.getPersonAtIndex(selectedRowIndex);
            selectedPatientValue.setText(selectedPer.getName());
        }

    }//GEN-LAST:event_markPersonAsPatientButtonActionPerformed

    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        // TODO add your handling code here:

        if (personDirAdminHeaderLabel.getText().contains("Create")) {

            ArrayList<Person> personDir = personDirectory.getPeople();
            Person person = new Person();
            int resp = saveChangesInPersonAndReturnPerson(person);
            if (resp == 1) {

                personDir.add(person);

                personDirectory.setPersons(personDir);

                populatePersonDirectoryTable();
                JOptionPane.showConfirmDialog(null, "Created record successfully!", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);

                //populateSearchTableHistory(carCatalog.getCars());

            }

        }

        if (personDirAdminHeaderLabel.getText().contains("Update")) {
            int selectedIndex = personDirTable.getSelectedRow();
            Person personRecord = personDirectory.getPersonAtIndex(selectedIndex);
            int resp = saveChangesInPersonAndReturnPerson(personRecord);
            if (resp == 1) {
                personDirectory.setPersonAtIndex(selectedIndex, personRecord);
                populatePersonDirectoryTable();

                JOptionPane.showConfirmDialog(null, "Record updated successfully!", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);

                //populateSearchTableHistory(carCatalog.getCars());

            }

        }
    }//GEN-LAST:event_saveChangesButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Deleting selected record.");

        int selectedRowIndex = personDirTable.getSelectedRow();

        if(selectedRowIndex == -1) {
            JOptionPane.showConfirmDialog(null,
                "No record selected to delete the row",
                "Error!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
            return;
        }

        int response = JOptionPane.showConfirmDialog(null, "Do you want to delete selected record?");
        if(response == 0) personDirectory.removePersonAtIndex(selectedRowIndex);

        populatePersonDirectoryTable();
        //populateSearchTableHistory(personDirectory.getCars());
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Viewing record below");

        int selectedRowIndex = personDirTable.getSelectedRow();

        if(selectedRowIndex == -1) {
            JOptionPane.showConfirmDialog(null, "No record selected to view the row", "Error!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
            return;
        }

        setValuesInForm(selectedRowIndex);
    }//GEN-LAST:event_viewButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Update Person record");

        int selectedRowIndex = personDirTable.getSelectedRow();

        if(selectedRowIndex == -1) {
            JOptionPane.showConfirmDialog(null, "No record selected to update the row", "Error!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
            return;
        }

        setValuesInForm(selectedRowIndex);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Create Person record");
    }//GEN-LAST:event_createButtonActionPerformed

    private void saveAsPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsPatientButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<Patient> newPatientList = patientDirectory.getPatients();
         
        int selectedRowIndex = personDirPatTabTable.getSelectedRow();
        Person selectedPerson = personDirectory.getPersonAtIndex(selectedRowIndex);
        Patient patient = new Patient(selectedPerson);
        patient.setDoctorName(doctorNameTextField.getText());
        patient.setAllergies(allergyList.getSelectedValuesList());
        newPatientList.add(patient);
        
        patientDirectory.setPersons(newPatientList);
        System.out.println(newPatientList.size());
        
        

        
    }//GEN-LAST:event_saveAsPatientButtonActionPerformed

    
    private void updateAdminHeader(String text) {
        personDirAdminHeaderLabel.setText(text);
    }
    
    
    private void setValuesInForm(int selectedRowIndex) {
        Person perRecord = personDirectory.getPersonAtIndex(selectedRowIndex);
        personNameTextField.setText(perRecord.getName());
        ageSlider.setValue(perRecord.getAge());
        addressTextField.setText(perRecord.getHouse().getAddress());
        zipCodeTextField.setText(perRecord.getHouse().getCommunity());
        cityTextField.setText(perRecord.getHouse().getCity());
        zipCodeTextField.setText(String.valueOf(perRecord.getHouse().getZipcode()));
             
    }    
    
    private void populatePersonDirectoryTable() {
        
        personDirectoryTableModel.setRowCount(0);

        for(Person perRecord: personDirectory.getPeople()) {
            String[] rowData = {
                perRecord.getName(), 
                Integer.toString(perRecord.getAge()),
                perRecord.getHouse().getCommunity(),
                perRecord.getHouse().getCity(),
                perRecord.getHouse().getAddress(),
                Integer.toString(perRecord.getHouse().getZipcode())
                };
            personDirectoryTableModel.addRow(rowData);
                                                   
        
      }
        
    }    
    
    
    private int saveChangesInPersonAndReturnPerson(Person personRecord) {

        String name = personNameTextField.getText().trim();
        int age = ageSlider.getValue();
        String address = addressTextField.getText().trim();
        String community = communityTextField.getText().trim();
        String zipCode = zipCodeTextField.getText().trim();
        String city = cityTextField.getText().trim();

        if (name.isEmpty()) {

            JOptionPane.showConfirmDialog(null, "Please verify values for Person name. It should non-empty.", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            return 0;

        }

        if (community.isEmpty()) {
            JOptionPane.showConfirmDialog(null, "Please verify values for Person community. It should non-empty.", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            return 0;


        }



        personRecord.setName(name);
        personRecord.setHouse(community, city, Integer.parseInt(zipCode), address);
        personRecord.setAge(age);
        
        return 1;

    }
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
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTabbedPane adminScreenTabbedPane;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JSlider ageSlider;
    private javax.swing.JScrollPane allergyJListPane;
    private javax.swing.JLabel allergyLabel;
    private javax.swing.JList<String> allergyList;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel communityLabel;
    private javax.swing.JTextField communityTextField;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel doctorNameLabel;
    private javax.swing.JTextField doctorNameTextField;
    private javax.swing.JButton markPersonAsPatientButton;
    private javax.swing.JLabel patientDirectoryPatientTabLabel;
    private javax.swing.JScrollPane patientDirectoryScrollPane1;
    private javax.swing.JPanel patientDirectoryTab;
    private javax.swing.JTable patientDirectoryTable;
    private javax.swing.JPanel patientJPanel;
    private javax.swing.JLabel personDirAdminHeaderLabel;
    private javax.swing.JLabel personDirLabel;
    private javax.swing.JTable personDirPatTabTable;
    private javax.swing.JTable personDirTable;
    private javax.swing.JScrollPane personDirectoryPatTabScollPanel;
    private javax.swing.JLabel personDirectoryPatientTabLabel;
    private javax.swing.JScrollPane personDirectoryScollPanel;
    private javax.swing.JPanel personJPanel;
    private javax.swing.JLabel personNameLabel;
    private javax.swing.JTextField personNameTextField;
    private javax.swing.JButton saveAsPatientButton;
    private javax.swing.JButton saveChangesButton;
    private javax.swing.JLabel selectedPatientNameLabel;
    private javax.swing.JLabel selectedPatientValue;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    private javax.swing.JLabel zipCodeLabel;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}
