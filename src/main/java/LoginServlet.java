import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
//    Do get is used to avoid having the .jsp extension on the url
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//  req.getRequestDispatcher - sends out request, and forwards it to/login
        req.getRequestDispatcher("/login.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
            res.sendRedirect("/profile");
        } else {
            res.sendRedirect("/login");
        }
    }


}
