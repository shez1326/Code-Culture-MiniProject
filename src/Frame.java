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
        CardLayout cl = (CardLayout)(getLayout());
        System.out.println("clicked");
        cl.show(this, "services");
    }

    private void swapToAddPatientActionPerformed(ActionEvent e) {
        // TODO add your code here
        CardLayout cl = (CardLayout)(getLayout());

        cl.show(this, "addPatient");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Jack Sheridan
        MainMenu = new JPanel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        swapToAddPatient = new JButton();
        label11 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();
        button7 = new JButton();
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
        services = new JPanel();
        comboBox5 = new JComboBox<>();
        textField6 = new JTextField();
        button6 = new JButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        radioButton1 = new JRadioButton();
        panel3 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button2 = new JButton();

        //======== this ========
        setTitle("miniproject");
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new CardLayout());

        //======== MainMenu ========
        {

            // JFormDesigner evaluation mark
            MainMenu.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), MainMenu.getBorder())); MainMenu.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            MainMenu.setLayout(new GridBagLayout());

            //---- label8 ----
            label8.setText("welcome");
            MainMenu.add(label8, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- label9 ----
            label9.setText("what would you like to do ");
            MainMenu.add(label9, new GridBagConstraints(0, 1, 3, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- label10 ----
            label10.setText("    ");
            MainMenu.add(label10, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- swapToAddPatient ----
            swapToAddPatient.setText("add patient");
            swapToAddPatient.addActionListener(e -> swapToAddPatientActionPerformed(e));
            MainMenu.add(swapToAddPatient, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- label11 ----
            label11.setText("    ");
            MainMenu.add(label11, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- button3 ----
            button3.setText("existing patients");
            MainMenu.add(button3, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button4 ----
            button4.setText("add service");
            MainMenu.add(button4, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button7 ----
            button7.setText("search services");
            MainMenu.add(button7, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));
        }
        contentPane.add(MainMenu, "MainMenu");

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
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(addPatient, "addPatient");

        //======== services ========
        {
            services.setLayout(new GridBagLayout());

            //---- comboBox5 ----
            comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                "GP",
                "School",
                "Dentists"
            }));
            services.add(comboBox5, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- textField6 ----
            textField6.setText("search");
            textField6.setToolTipText("Search");
            textField6.setPreferredSize(new Dimension(200, 37));
            services.add(textField6, new GridBagConstraints(1, 3, 3, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button6 ----
            button6.setText("Advance search");
            services.add(button6, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- radioButton2 ----
            radioButton2.setText("nhs");
            services.add(radioButton2, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- radioButton3 ----
            radioButton3.setText("non nhs");
            services.add(radioButton3, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- radioButton1 ----
            radioButton1.setText("both");
            services.add(radioButton1, new GridBagConstraints(7, 3, 1, 1, 0.0, 0.0,
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
            }
            services.add(panel3, new GridBagConstraints(0, 4, 8, 4, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- button2 ----
            button2.setText("back to main menu");
            services.add(button2, new GridBagConstraints(5, 8, 3, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));
        }
        contentPane.add(services, "services");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Jack Sheridan
    private JPanel MainMenu;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JButton swapToAddPatient;
    private JLabel label11;
    private JButton button3;
    private JButton button4;
    private JButton button7;
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
    private JPanel services;
    private JComboBox<String> comboBox5;
    private JTextField textField6;
    private JButton button6;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton1;
    private JPanel panel3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
