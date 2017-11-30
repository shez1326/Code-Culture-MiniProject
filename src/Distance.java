import java.sql.*;

public class Distance {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "Password123";


    public static void main(String[] args) {
        double[] latlng1 = queryDatabaseForLongLat("LL16 5AR");
        double lat1 = latlng1[0];
        double lng1 = latlng1[1];

        double[] latlng2 = queryDatabaseForLongLat("LL57 1UT");
        double lat2 = latlng2[0];
        double lng2 = latlng2[1];

       // Patient pat = new Patient();

       // insertPatient(pat);


        System.out.println(haversine(lat1, lng1, lat2, lng2));
    }

    private static double[] queryDatabaseForLongLat(String postcode) {
        double lng = 0;
        double lat = 0;

        Connection conn = connectToDataBase();

        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement("SELECT postcode, latitude, longitude FROM" +
                    " miniproject.postcodelatlng WHERE postcode = ?");

            statement.setString(1, postcode);
            ResultSet rs = statement.executeQuery();
            rs.next();

            //*STEP 5: Extract data from result set
            lat = rs.getDouble("latitude");
            lng = rs.getDouble("longitude");

            rs.close();
            statement.clearParameters();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new double[]{lat, lng};
    }

    private static void insertPatient(Patient pat) {

        Connection conn = connectToDataBase();

        PreparedStatement statement = null;

        String sql = "INSERT INTO miniproject.patient(firstName, surname, title, dob, address, Postcode, phone, GPID,"+
                                                     "DentistID, SchoolID, OpticianID)" +
                     "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


        try {
            if (conn != null) {
                statement = conn.prepareStatement(sql);

                statement.setString(1, pat.getfName());
                statement.setString(2, pat.getSurname());
                statement.setString(3, pat.getTitle());
                statement.setDate(4, new java.sql.Date(pat.getDob().getTime()));
                statement.setString(5, pat.getAddress());
                statement.setString(6, pat.getPostcode());
                statement.setString(7, pat.getPhone());
                statement.setInt(8, pat.getGpID());
                statement.setInt(9, pat.getDentistID());
                statement.setInt(10, pat.getSchoolID());
                statement.setInt(11, pat.getOpticianID());

                statement.execute();

                statement.clearParameters();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void updatePatient(Patient pat) {

        Connection conn = connectToDataBase();

        PreparedStatement statement = null;

        String sql = "INSERT INTO miniproject.patient(firstName, surname, title, dob, address, Postcode, phone, GPID,"+
                "DentistID, SchoolID, OpticianID)" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


        try {
            if (conn != null) {
                statement = conn.prepareStatement(sql);

                statement.setString(1, pat.getfName());
                statement.setString(2, pat.getSurname());
                statement.setString(3, pat.getTitle());
                statement.setDate(4, new java.sql.Date(pat.getDob().getTime()));
                statement.setString(5, pat.getAddress());
                statement.setString(6, pat.getPostcode());
                statement.setString(7, pat.getPhone());
                statement.setInt(8, pat.getGpID());
                statement.setInt(9, pat.getDentistID());
                statement.setInt(10, pat.getSchoolID());
                statement.setInt(11, pat.getOpticianID());

                statement.execute();

                statement.clearParameters();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    } //TODO

    private static void insertDentist(Patient pat) {

        Connection conn = connectToDataBase();

        PreparedStatement statement = null;

        String sql = "INSERT INTO miniproject.patient(firstName, surname, title, dob, address, Postcode, phone, GPID,"+
                "DentistID, SchoolID, OpticianID)" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


        try {
            if (conn != null) {
                statement = conn.prepareStatement(sql);

                statement.setString(1, pat.getfName());
                statement.setString(2, pat.getSurname());
                statement.setString(3, pat.getTitle());
                statement.setDate(4, new java.sql.Date(pat.getDob().getTime()));
                statement.setString(5, pat.getAddress());
                statement.setString(6, pat.getPostcode());
                statement.setString(7, pat.getPhone());
                statement.setInt(8, pat.getGpID());
                statement.setInt(9, pat.getDentistID());
                statement.setInt(10, pat.getSchoolID());
                statement.setInt(11, pat.getOpticianID());

                statement.execute();

                statement.clearParameters();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    } //TODO

    private static void insertSchool(Patient pat) {

        Connection conn = connectToDataBase();

        PreparedStatement statement = null;

        String sql = "INSERT INTO miniproject.patient(firstName, surname, title, dob, address, Postcode, phone, GPID,"+
                "DentistID, SchoolID, OpticianID)" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


        try {
            if (conn != null) {
                statement = conn.prepareStatement(sql);

                statement.setString(1, pat.getfName());
                statement.setString(2, pat.getSurname());
                statement.setString(3, pat.getTitle());
                statement.setDate(4, new java.sql.Date(pat.getDob().getTime()));
                statement.setString(5, pat.getAddress());
                statement.setString(6, pat.getPostcode());
                statement.setString(7, pat.getPhone());
                statement.setInt(8, pat.getGpID());
                statement.setInt(9, pat.getDentistID());
                statement.setInt(10, pat.getSchoolID());
                statement.setInt(11, pat.getOpticianID());

                statement.execute();

                statement.clearParameters();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }  //TODO

    private static void insertGP(Patient pat) {

        Connection conn = connectToDataBase();

        PreparedStatement statement = null;

        String sql = "INSERT INTO miniproject.patient(firstName, surname, title, dob, address, Postcode, phone, GPID,"+
                "DentistID, SchoolID, OpticianID)" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


        try {
            if (conn != null) {
                statement = conn.prepareStatement(sql);

                statement.setString(1, pat.getfName());
                statement.setString(2, pat.getSurname());
                statement.setString(3, pat.getTitle());
                statement.setDate(4, new java.sql.Date(pat.getDob().getTime()));
                statement.setString(5, pat.getAddress());
                statement.setString(6, pat.getPostcode());
                statement.setString(7, pat.getPhone());
                statement.setInt(8, pat.getGpID());
                statement.setInt(9, pat.getDentistID());
                statement.setInt(10, pat.getSchoolID());
                statement.setInt(11, pat.getOpticianID());

                statement.execute();

                statement.clearParameters();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    } //TODO

    private static void insertOptician(Patient pat) {

        Connection conn = connectToDataBase();

        PreparedStatement statement = null;

        String sql = "INSERT INTO miniproject.patient(firstName, surname, title, dob, address, Postcode, phone, GPID,"+
                "DentistID, SchoolID, OpticianID)" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


        try {
            if (conn != null) {
                statement = conn.prepareStatement(sql);

                statement.setString(1, pat.getfName());
                statement.setString(2, pat.getSurname());
                statement.setString(3, pat.getTitle());
                statement.setDate(4, new java.sql.Date(pat.getDob().getTime()));
                statement.setString(5, pat.getAddress());
                statement.setString(6, pat.getPostcode());
                statement.setString(7, pat.getPhone());
                statement.setInt(8, pat.getGpID());
                statement.setInt(9, pat.getDentistID());
                statement.setInt(10, pat.getSchoolID());
                statement.setInt(11, pat.getOpticianID());

                statement.execute();

                statement.clearParameters();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    } //TODO

    private static double haversine(double lat1, double lng1, double lat2, double lng2) {
        int r = 6371; // average radius of the earth in km

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lng2 - lng1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                        * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return r * c;
    }

    private static Connection connectToDataBase(){
        Connection conn = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;

        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return null;
    }
    /*

     */

}
