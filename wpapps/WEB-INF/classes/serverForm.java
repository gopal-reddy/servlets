import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
public class serverForm extends HttpServlet
{
    String username;
    String passsword;
    public void init()
    {
        username="";
        passsword="";

    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        username=req.getParameter("username");
        passsword=req.getParameter("password");
        out.println("<html><head></head><body><h1><center>"+
        " "+username+"<br>"+
        " "+passsword+"<br>"+
        "</center></h1></body></html>");
        out.println("<h1>" + message + "</h1>");

    }
    public void destroy()
    {

    }
}