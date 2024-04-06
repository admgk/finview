package io.github.admgk;

import org.eclipse.jetty.ee10.annotations.AnnotationConfiguration;
import org.eclipse.jetty.ee10.webapp.*;
import org.eclipse.jetty.server.Server;

public class App {
    public static void main(String[] args) throws Exception {
        var webapp = new WebAppContext();
        webapp.setBaseResourceAsString("src/main/webapp");
        webapp.setContextPath("/");
        webapp.setConfigurations(new Configuration[] {
                new AnnotationConfiguration(),
                new WebInfConfiguration(),
                new WebXmlConfiguration(),
                new MetaInfConfiguration(),
                new FragmentConfiguration(),
                new JettyWebXmlConfiguration()
        });
        webapp.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern", ".*/classes/.*");

        var server = new Server(8080);
        server.setHandler(webapp);

        server.start();
        server.join();
    }
}