
package first;
import java.sql.*;
public class DemoDelete {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432//test1", "postgres", "love");

        System.out.println("Coonection done");

        Statement stmt;
        stmt = conn.createStatement();
        String sql;
        sql = "delete from student where name='csk' and id=501";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();
    
}
    
}
