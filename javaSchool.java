public static void insertSchool(School sch) {

        Connection conn = connectToDataBase();

        PreparedStatement statement = null;

        String sql = "INSERT INTO miniproject.school(SCHOOLID, name, address, postcode, phone)" +
                "VALUES(?, ?, ?, ?, ?)";

        try {
            if (conn != null) {
                statement = conn.prepareStatement(sql);
                
                statement.setInt(1, sch.getID());
                statement.setString(2, sch.getEstablishment());
                statement.setString(3, sch.getAddress());
                statement.setString(4, sch.getPostcode());
                statement.setString(5, sch.getTelephoneNo());

                statement.execute();

                statement.clearParameters();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
public static void updateSchool(School sch) {

        Connection conn = connectToDataBase();

        PreparedStatement statement = null;

        String sql = "INSERT INTO miniproject.school(SCHOOLID, name, address, postcode, phone)" +
                "VALUES(?, ?, ?, ?, ?)";

        try {
            if (conn != null) {
                statement = conn.prepareStatement(sql);
                
                statement.setInt(1, sch.getID());
                statement.setString(2, sch.getEstablishment());
                statement.setString(3, sch.getAddress());
                statement.setString(4, sch.getPostcode());
                statement.setString(5, sch.getTelephoneNo());

                statement.execute();

                statement.clearParameters();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }