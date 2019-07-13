import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Loginservice {
public boolean Logincheck(String uname,String pass)
{
	String query;
    String dbUsername, dbPassword;
    boolean login = false;

    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306", "", "");
        Statement stmt = (Statement) con.createStatement();
        query = "SELECT userName, password FROM user;";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();

        while(rs.next()){
            dbUsername = rs.getString("username");
            dbPassword = rs.getString("password");

            if(dbUsername == uname && dbPassword == pass){
                System.out.println("OK");
                login = true;
            }
            System.out.println(uname + pass + " " + dbUsername + dbPassword);
        }
    } catch (InstantiationException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return login;
}
}
