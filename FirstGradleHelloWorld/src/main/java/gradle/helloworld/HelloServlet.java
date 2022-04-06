package gradle.helloworld;



import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest request,HttpServletResponse response)throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "HelloWorld" + "</h1>");
        out.println("</body></html>");

    }
}
