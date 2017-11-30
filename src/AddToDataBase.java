import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class AddToDataBase {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "Tymawr1326";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jacks\\Desktop\\2nd year\\advanced java\\softwarehut Miniproject\\softwarehut Miniproject.iml"));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] postcodes = line.split(",");


                sql = "INSERT INTO miniproject.postcodes(Postcode, longitude, latitude)" +
                        " VALUES (?, ?, ?)";

                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, postcodes[1]);
                pstmt.setDouble(2, Double.parseDouble(postcodes[2]));
                pstmt.setDouble(3, Double.parseDouble(postcodes[3]));

                pstmt.executeUpdate();

            }


            //STEP 6: Clean-up environment
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//*/end try
        System.out.println("Goodbye!");
    }//end main
}//end FirstExample