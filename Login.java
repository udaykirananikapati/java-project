

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter(); 
		String n=request.getParameter("userName");  
		String p=request.getParameter("userPass");  
		String q=request.getParameter("cid");
		String m=request.getParameter("phoneno");
		/*String dbUsername,dbPassword;
		boolean login;
		
		try {
	        Class.forName("com.mysql.jdbc.Driver").newInstance();
	        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306", "", "");
	        Statement stmt = (Statement) con.createStatement();
	        String query = "SELECT userName, password FROM user;";
	        stmt.executeQuery(query);
	        ResultSet rs = stmt.getResultSet();

	        while(rs.next()){
	            dbUsername = rs.getString("username");
	            dbPassword = rs.getString("password");

	            if(dbUsername == n && dbPassword == p){
	                System.out.println("OK");
	                login = true;
	            }
	            System.out.println(n + p + " " + dbUsername + dbPassword);
	        }
		}
		catch (SQLException e) {
	        e.printStackTrace();
	    } catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		if(p.equals("12345"))
		   {  
		       RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
		       rd.forward(request, response);  
		   }  
	}

}
