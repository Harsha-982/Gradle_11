package gradle.helloworld;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;


public class HelloWorld {
    public static void main(String[] args) throws Exception {
        Server server =new Server(8080);

        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);

        servletHandler.addServletWithMapping(HelloServlet.class, "/");

        server.start();

        server.join();
    }
}
