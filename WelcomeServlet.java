
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class WelcomeServlet extends HttpServlet {  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    out.println("welcome "+n);
    out.println("Enter the Details:");
    String p=request.getParameter("userPass"); 
    String q=request.getParameter("cid");
	String m=request.getParameter("phoneno");
    if(p.equals("12345"))
    {
    RequestDispatcher rd=request.getRequestDispatcher("/Details.html");  
    rd.include(request, response);  
    }
    else
	{
		out.print("Please enter the servlet");  
        RequestDispatcher rd=request.getRequestDispatcher("/Details.html");  
        rd.include(request, response);  
	}
    }  
  
}  

