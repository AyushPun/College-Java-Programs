import java.sql.*;

public class MyJDBC {
    public static void main(String... args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user");
            while (rs.next()) {
                System.out.print("ID= " + rs.getInt(1));
                System.out.print(" | Name= " + rs.getString("name"));
                System.out.print(" | Phone= " + rs.getInt(3));
                System.out.print(" | Password= " + rs.getString(4));
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}