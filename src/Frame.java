import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Thu Nov 09 14:30:30 GMT 2017
 */



/**
 * @author unknown
 */
public class Frame extends JFrame {
    public Frame() {
        initComponents();
    }

    private void swapToServicesActionPerformed(ActionEvent e) {
        // TODO add your code here
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, "services");
    }

    private void swapToAddPatientActionPerformed(ActionEvent e) {
        // TODO add your code here
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, "addPatient");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Jack Sheridan
        cards = new JPanel();
        MainMenu = new JPanel();
        welcomLabel = new JLabel();
        choiceMessage = new JLabel();
        spacing = new JLabel();
        swapToAddPatient = new JButton();
        spacing2 = new JLabel();
        swapToExistingPatients = new JButton();
        swapToAddService = new JButton();
        swapToSearchServices = new JButton();
        Searchservices = new JPanel();
        comboBox6 = new JComboBox<>();
        textField7 = new JTextField();
        button7 = new JButton();
        radioButton4 = new JRadioButton();
        radioButton5 = new JRadioButton();
        radioButton6 = new JRadioButton();
        panel4 = new JPanel();
        scrollPane5 = new JScrollPane();
        table5 = new JTable();
        scrollPane6 = new JScrollPane();
        table6 = new JTable();
        scrollPane7 = new JScrollPane();
        table7 = new JTable();
        scrollPane8 = new JScrollPane();
        table8 = new JTable();
        button3 = new JButton();
        Services = new JPanel();
        comboBox5 = new JComboBox<>();
        textField6 = new JTextField();
        button6 = new JButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        radioButton1 = new JRadioButton();
        panel3 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        scrollPane3 = new JScrollPane();
        table3 = new JTable();
        scrollPane4 = new JScrollPane();
        table4 = new JTable();
        button2 = new JButton();
        addPatient = new JPanel();
        titleLabel = new JLabel();
        title = new JComboBox<>();
        firstNameLabel = new JLabel();
        firstName = new JTextField();
        surnameLabel = new JLabel();
        surname = new JTextField();
        dobLabel = new JLabel();
        day = new JComboBox<>();
        month = new JComboBox<>();
        year = new JComboBox<>();
        addressLabel = new JLabel();
        address = new JTextField();
        postcodeLabel = new JLabel();
        postcode = new JTextField();
        phoneLabel = new JLabel();
        phoneNumber = new JTextField();
        swapToServices = new JButton();
        patients = new JPanel();
        comboBox7 = new JComboBox<>();
        textField8 = new JTextField();
        button8 = new JButton();
        radioButton7 = new JRadioButton();
        radioButton8 = new JRadioButton();
        radioButton9 = new JRadioButton();
        panel5 = new JPanel();
        scrollPane9 = new JScrollPane();
        table9 = new JTable();
        scrollPane10 = new JScrollPane();
        table10 = new JTable();
        scrollPane11 = new JScrollPane();
        table11 = new JTable();
        scrollPane12 = new JScrollPane();
        table12 = new JTable();
        button4 = new JButton();

        //======== this ========
        setTitle("miniproject");
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== cards ========
        {

            // JFormDesigner evaluation mark
            cards.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), cards.getBorder())); cards.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            cards.setLayout(new CardLayout());

            //======== MainMenu ========
            {
                MainMenu.setLayout(new GridBagLayout());

                //---- welcomLabel ----
                welcomLabel.setText("welcome");
                MainMenu.add(welcomLabel, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- choiceMessage ----
                choiceMessage.setText("what would you like to do ");
                MainMenu.add(choiceMessage, new GridBagConstraints(0, 1, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- spacing ----
                spacing.setText("            ");
                MainMenu.add(spacing, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- swapToAddPatient ----
                swapToAddPatient.setText("add Patient");
                swapToAddPatient.addActionListener(e -> {
			swapToAddPatientActionPerformed(e);
			swapToAddPatientActionPerformed(e);
		});
                MainMenu.add(swapToAddPatient, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- spacing2 ----
                spacing2.setText("            ");
                MainMenu.add(spacing2, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- swapToExistingPatients ----
                swapToExistingPatients.setText("existing patients");
                MainMenu.add(swapToExistingPatients, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- swapToAddService ----
                swapToAddService.setText("add service");
                MainMenu.add(swapToAddService, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- swapToSearchServices ----
                swapToSearchServices.setText("search services");
                MainMenu.add(swapToSearchServices, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            }
            cards.add(MainMenu, "main");

            //======== Searchservices ========
            {
                Searchservices.setLayout(new GridBagLayout());

                //---- comboBox6 ----
                comboBox6.setModel(new DefaultComboBoxModel<>(new String[] {
                    "GP",
                    "School",
                    "Dentists"
                }));
                Searchservices.add(comboBox6, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- textField7 ----
                textField7.setText("search");
                textField7.setToolTipText("Search");
                textField7.setPreferredSize(new Dimension(200, 37));
                Searchservices.add(textField7, new GridBagConstraints(1, 3, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button7 ----
                button7.setText("Advance search");
                Searchservices.add(button7, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton4 ----
                radioButton4.setText("nhs");
                Searchservices.add(radioButton4, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton5 ----
                radioButton5.setText("non nhs");
                Searchservices.add(radioButton5, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton6 ----
                radioButton6.setText("both");
                Searchservices.add(radioButton6, new GridBagConstraints(7, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //======== panel4 ========
                {
                    panel4.setLayout(new CardLayout());

                    //======== scrollPane5 ========
                    {

                        //---- table5 ----
                        table5.setRowSelectionAllowed(false);
                        table5.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane5.setViewportView(table5);
                    }
                    panel4.add(scrollPane5, "card1");

                    //======== scrollPane6 ========
                    {

                        //---- table6 ----
                        table6.setRowSelectionAllowed(false);
                        table6.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane6.setViewportView(table6);
                    }
                    panel4.add(scrollPane6, "card2");

                    //======== scrollPane7 ========
                    {

                        //---- table7 ----
                        table7.setRowSelectionAllowed(false);
                        table7.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane7.setViewportView(table7);
                    }
                    panel4.add(scrollPane7, "card3");

                    //======== scrollPane8 ========
                    {

                        //---- table8 ----
                        table8.setRowSelectionAllowed(false);
                        table8.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane8.setViewportView(table8);
                    }
                    panel4.add(scrollPane8, "card4");
                }
                Searchservices.add(panel4, new GridBagConstraints(0, 4, 8, 4, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- button3 ----
                button3.setText("back to main menu");
                Searchservices.add(button3, new GridBagConstraints(5, 8, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));
            }
            cards.add(Searchservices, "searchServices");

            //======== Services ========
            {
                Services.setLayout(new GridBagLayout());

                //---- comboBox5 ----
                comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                    "GP",
                    "School",
                    "Dentists"
                }));
                Services.add(comboBox5, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- textField6 ----
                textField6.setText("search");
                textField6.setToolTipText("Search");
                textField6.setPreferredSize(new Dimension(200, 37));
                Services.add(textField6, new GridBagConstraints(1, 3, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button6 ----
                button6.setText("Advance search");
                Services.add(button6, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton2 ----
                radioButton2.setText("nhs");
                Services.add(radioButton2, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton3 ----
                radioButton3.setText("non nhs");
                Services.add(radioButton3, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton1 ----
                radioButton1.setText("both");
                Services.add(radioButton1, new GridBagConstraints(7, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //======== panel3 ========
                {
                    panel3.setLayout(new CardLayout());

                    //======== scrollPane1 ========
                    {

                        //---- table1 ----
                        table1.setRowSelectionAllowed(false);
                        table1.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane1.setViewportView(table1);
                    }
                    panel3.add(scrollPane1, "card1");

                    //======== scrollPane2 ========
                    {

                        //---- table2 ----
                        table2.setRowSelectionAllowed(false);
                        table2.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane2.setViewportView(table2);
                    }
                    panel3.add(scrollPane2, "card2");

                    //======== scrollPane3 ========
                    {

                        //---- table3 ----
                        table3.setRowSelectionAllowed(false);
                        table3.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane3.setViewportView(table3);
                    }
                    panel3.add(scrollPane3, "card3");

                    //======== scrollPane4 ========
                    {

                        //---- table4 ----
                        table4.setRowSelectionAllowed(false);
                        table4.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane4.setViewportView(table4);
                    }
                    panel3.add(scrollPane4, "card4");
                }
                Services.add(panel3, new GridBagConstraints(0, 4, 8, 4, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- button2 ----
                button2.setText("back to main menu");
                Services.add(button2, new GridBagConstraints(5, 8, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));
            }
            cards.add(Services, "services");

            //======== addPatient ========
            {
                addPatient.setPreferredSize(null);
                addPatient.setMinimumSize(null);
                addPatient.setLayout(new GridBagLayout());

                //---- titleLabel ----
                titleLabel.setText("Title");
                addPatient.add(titleLabel, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 10), 0, 0));

                //---- title ----
                title.setModel(new DefaultComboBoxModel<>(new String[] {
                    "  ",
                    "Mr",
                    "Mrs",
                    "Miss",
                    "Ms"
                }));
                addPatient.add(title, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 10), 0, 0));

                //---- firstNameLabel ----
                firstNameLabel.setText("First name");
                addPatient.add(firstNameLabel, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 10), 0, 0));
                addPatient.add(firstName, new GridBagConstraints(4, 1, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 0), 0, 0));

                //---- surnameLabel ----
                surnameLabel.setText("surname");
                addPatient.add(surnameLabel, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 10), 0, 0));
                addPatient.add(surname, new GridBagConstraints(4, 2, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 0), 0, 0));

                //---- dobLabel ----
                dobLabel.setText("Date of Birth");
                addPatient.add(dobLabel, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 10), 0, 0));

                //---- day ----
                day.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26",
                    "27",
                    "28",
                    "29",
                    "30",
                    "31"
                }));
                addPatient.add(day, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 10), 0, 0));

                //---- month ----
                month.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12"
                }));
                addPatient.add(month, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 10), 0, 0));

                //---- year ----
                year.setModel(new DefaultComboBoxModel<>(new String[] {
                    "2017",
                    "2016",
                    "2015",
                    "2014",
                    "2013",
                    "2012",
                    "2011",
                    "2010",
                    "2009",
                    "2008",
                    "2007",
                    "2006",
                    "2005",
                    "2004",
                    "2003",
                    "2002",
                    "2001",
                    "2000",
                    "1999",
                    "1998",
                    "1997",
                    "1996",
                    "1995",
                    "1994",
                    "1993",
                    "1992",
                    "1991",
                    "1990",
                    "1989",
                    "1988",
                    "1987",
                    "1986",
                    "1985",
                    "1984",
                    "1983",
                    "1982",
                    "1981",
                    "1980",
                    "1979",
                    "1978",
                    "1977",
                    "1976",
                    "1975",
                    "1974",
                    "1973",
                    "1972",
                    "1971",
                    "1970",
                    "1969",
                    "1968",
                    "1967",
                    "1966",
                    "1965",
                    "1964",
                    "1963",
                    "1962",
                    "1961",
                    "1960",
                    "1959",
                    "1958",
                    "1957",
                    "1956",
                    "1955",
                    "1954",
                    "1953",
                    "1952",
                    "1951",
                    "1950",
                    "1949",
                    "1948",
                    "1947",
                    "1946",
                    "1945",
                    "1944",
                    "1943",
                    "1942",
                    "1941",
                    "1940",
                    "1939",
                    "1938",
                    "1937",
                    "1936",
                    "1935",
                    "1934",
                    "1933",
                    "1932",
                    "1931",
                    "1930",
                    "1929",
                    "1928",
                    "1927",
                    "1926",
                    "1925",
                    "1924",
                    "1923",
                    "1922",
                    "1921",
                    "1920",
                    "1919",
                    "1918",
                    "1917",
                    "1916",
                    "1915",
                    "1914",
                    "1913",
                    "1912",
                    "1911",
                    "1910",
                    "1909",
                    "1908",
                    "1907",
                    "1906",
                    "1905",
                    "1904",
                    "1903",
                    "1902",
                    "1901",
                    "1900"
                }));
                addPatient.add(year, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 0), 0, 0));

                //---- addressLabel ----
                addressLabel.setText("Address");
                addPatient.add(addressLabel, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 10), 0, 0));
                addPatient.add(address, new GridBagConstraints(4, 4, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 0), 0, 0));

                //---- postcodeLabel ----
                postcodeLabel.setText("Postcode");
                addPatient.add(postcodeLabel, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 10), 0, 0));
                addPatient.add(postcode, new GridBagConstraints(4, 5, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 0), 0, 0));

                //---- phoneLabel ----
                phoneLabel.setText("Phone number");
                addPatient.add(phoneLabel, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 10), 0, 0));
                addPatient.add(phoneNumber, new GridBagConstraints(4, 6, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 0), 0, 0));

                //---- swapToServices ----
                swapToServices.setText("next");
                swapToServices.addActionListener(e -> swapToServicesActionPerformed(e));
                addPatient.add(swapToServices, new GridBagConstraints(6, 7, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 10, 0), 0, 0));
            }
            cards.add(addPatient, "addPatient");

            //======== patients ========
            {
                patients.setLayout(new GridBagLayout());

                //---- comboBox7 ----
                comboBox7.setModel(new DefaultComboBoxModel<>(new String[] {
                    "GP",
                    "School",
                    "Dentists"
                }));
                patients.add(comboBox7, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- textField8 ----
                textField8.setText("search");
                textField8.setToolTipText("Search");
                textField8.setPreferredSize(new Dimension(200, 37));
                patients.add(textField8, new GridBagConstraints(1, 3, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button8 ----
                button8.setText("Advance search");
                patients.add(button8, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton7 ----
                radioButton7.setText("nhs");
                patients.add(radioButton7, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton8 ----
                radioButton8.setText("non nhs");
                patients.add(radioButton8, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- radioButton9 ----
                radioButton9.setText("both");
                patients.add(radioButton9, new GridBagConstraints(7, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //======== panel5 ========
                {
                    panel5.setLayout(new CardLayout());

                    //======== scrollPane9 ========
                    {

                        //---- table9 ----
                        table9.setRowSelectionAllowed(false);
                        table9.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane9.setViewportView(table9);
                    }
                    panel5.add(scrollPane9, "card1");

                    //======== scrollPane10 ========
                    {

                        //---- table10 ----
                        table10.setRowSelectionAllowed(false);
                        table10.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane10.setViewportView(table10);
                    }
                    panel5.add(scrollPane10, "card2");

                    //======== scrollPane11 ========
                    {

                        //---- table11 ----
                        table11.setRowSelectionAllowed(false);
                        table11.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane11.setViewportView(table11);
                    }
                    panel5.add(scrollPane11, "card3");

                    //======== scrollPane12 ========
                    {

                        //---- table12 ----
                        table12.setRowSelectionAllowed(false);
                        table12.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"test 1", "wdad,adwd, road", "LL16 5ar", "0910328314", "9-5", null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                            },
                            new String[] {
                                "Name", "Address", "postcode", "telephone", "openning hours", "distance (Miles)", "Distance (Km)", null
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false, true
                            };
                            @Override
                            public Class<?> getColumnClass(int columnIndex) {
                                return columnTypes[columnIndex];
                            }
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane12.setViewportView(table12);
                    }
                    panel5.add(scrollPane12, "card4");
                }
                patients.add(panel5, new GridBagConstraints(0, 4, 8, 4, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- button4 ----
                button4.setText("back to main menu");
                patients.add(button4, new GridBagConstraints(5, 8, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));
            }
            cards.add(patients, "patients");
        }
        contentPane.add(cards, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Jack Sheridan
    private JPanel cards;
    private JPanel MainMenu;
    private JLabel welcomLabel;
    private JLabel choiceMessage;
    private JLabel spacing;
    private JButton swapToAddPatient;
    private JLabel spacing2;
    private JButton swapToExistingPatients;
    private JButton swapToAddService;
    private JButton swapToSearchServices;
    private JPanel Searchservices;
    private JComboBox<String> comboBox6;
    private JTextField textField7;
    private JButton button7;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private JPanel panel4;
    private JScrollPane scrollPane5;
    private JTable table5;
    private JScrollPane scrollPane6;
    private JTable table6;
    private JScrollPane scrollPane7;
    private JTable table7;
    private JScrollPane scrollPane8;
    private JTable table8;
    private JButton button3;
    private JPanel Services;
    private JComboBox<String> comboBox5;
    private JTextField textField6;
    private JButton button6;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton1;
    private JPanel panel3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JScrollPane scrollPane3;
    private JTable table3;
    private JScrollPane scrollPane4;
    private JTable table4;
    private JButton button2;
    private JPanel addPatient;
    private JLabel titleLabel;
    private JComboBox<String> title;
    private JLabel firstNameLabel;
    private JTextField firstName;
    private JLabel surnameLabel;
    private JTextField surname;
    private JLabel dobLabel;
    private JComboBox<String> day;
    private JComboBox<String> month;
    private JComboBox<String> year;
    private JLabel addressLabel;
    private JTextField address;
    private JLabel postcodeLabel;
    private JTextField postcode;
    private JLabel phoneLabel;
    private JTextField phoneNumber;
    private JButton swapToServices;
    private JPanel patients;
    private JComboBox<String> comboBox7;
    private JTextField textField8;
    private JButton button8;
    private JRadioButton radioButton7;
    private JRadioButton radioButton8;
    private JRadioButton radioButton9;
    private JPanel panel5;
    private JScrollPane scrollPane9;
    private JTable table9;
    private JScrollPane scrollPane10;
    private JTable table10;
    private JScrollPane scrollPane11;
    private JTable table11;
    private JScrollPane scrollPane12;
    private JTable table12;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
