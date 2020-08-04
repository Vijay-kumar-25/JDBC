package pack1;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/office";
        String name ="user";
        String pass ="password";
        String query="select id,name from employee";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,name,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {

            String result = rs.getString("name")+":" +rs.getInt("id");
            System.out.println(result);
        }
        st.close();
        con.close();


    }
}
