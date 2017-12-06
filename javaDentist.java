public static void insertDentist(Dentist dent) {
        Connection conn = connectToDataBase();

        PreparedStatement statement = null;

        String sql = "INSERT INTO miniproject.dentist(DENTISTID, name, address, postcode, phone, nhs)" +
                "VALUES(?, ?, ?, ?, ?, ?)";

        try {
            if (conn != null) {
                statement = conn.prepareStatement(sql);
                
                statement.setInt(1, dent.getID());
                statement.setString(2, dent.getDentistName());
                statement.setString(3, dent.getAddress());
                statement.setString(4, dent.getPostcode());
                statement.setString(5, dent.getTelephoneNo());
                statement.setBoolean(6, dent.getIsNHS());

                statement.execute();

                statement.clearParameters();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
public static void updateDentist(Dentist dent) {
        Connection conn = connectToDataBase();

        PreparedStatement statement = null;

        String sql = "INSERT INTO miniproject.dentist(DENTISTID, name, address, postcode, phone, nhs)" +
                "VALUES(?, ?, ?, ?, ?, ?)";

        try {
            if (conn != null) {
                statement = conn.prepareStatement(sql);
                
                statement.setInt(1, dent.getID());
                statement.setString(2, dent.getDentistName());
                statement.setString(3, dent.getAddress());
                statement.setString(4, dent.getPostcode());
                statement.setString(5, dent.getTelephoneNo());
                statement.setBoolean(6, dent.getIsNHS());

                statement.execute();

                statement.clearParameters();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }