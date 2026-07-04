//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

    /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
     */

        String url = "jdbc:postgresql://localhost:5432/javademo";
        String uName = "macbookpro";
        String pwd = "";
        String query = "select sname from student where sid = 1";

        //Optional
       // Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection(url,uName,pwd);
        System.out.println("Connection Established: " + conn);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("sname");
        System.out.println("Name of a student: " + name);

        conn.close();
        System.out.println("Connection Closed");
    }
}