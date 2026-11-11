import java.sql.*;

public class App{
    public static void main(String[] args) throws Exception {
        
        String query = "SELECT * FROM items WHERE id=2";
        
        String url = "jdbc:postgresql://localhost:5432/java";
        String user = "himangshu";
        String passwd = "root";

        Connection con = DriverManager.getConnection(url, user, passwd);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        if (rs.next()){
            String data = rs.getString("name");
            System.out.println(data);
        } else
            System.out.println("No data found");
    }
}