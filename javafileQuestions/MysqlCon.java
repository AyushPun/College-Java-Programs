import java.sql.*; //import JDBC Packages
class MysqlCon {
    public static void main(String[] args) {
        try {
            //Loading the driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to a selected database...");

            //Creating the connection, con is reference to Connection interface
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root", "");
            System.out.println("Connected database successfully");

            //Creating a statement
            Statement stmt = con.createStatement();
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO employee VALUES(123, 'Ayush Pun', 19)";

            //Execute the query
            stmt.executeUpdate(sql);
            ResultSet rs = stmt.executeQuery("select * from employee");
            while(rs.next()) {
                System.out.println(rs.getInt("empid") + " " + rs.getString("empname")+ " " + rs.getInt("age"));
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } 
        catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}