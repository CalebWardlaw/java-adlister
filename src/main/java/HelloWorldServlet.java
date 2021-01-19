import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;


//Annotation first, name is name of servlet, urlpattern is endpoint
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //Creating response type, text/html
        res.setContentType("text/html");
        //print writer class, similar to SOUT, "out" is just the name of the printwriter
        //Allows us to print to the browser
        PrintWriter out = res.getWriter();
        //Actually printing to browser
        out.println("<h1>Hello, World</h1>");
    }
}
