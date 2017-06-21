package cz.adastra.jdbc.partial;

import org.h2.tools.Server;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by jozef.najman on 20.06.2017.
 */
public class H2InMemoryLocalDb {
    public static void main(String... args) throws Exception {

//        java -cp h2-1.4.195.jar org.h2.tools.Console -web -browser



//        // open the in-memory database within a VM
//        Class.forName("org.h2.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
//
//        // start a TCP server
//        // (either before or after opening the database)
//        Server server = Server.createTcpServer().start();
//
//        // .. use in embedded mode ..
//
//        // or use it from another process:
//        System.out.println("Server started and connection is open.");
//        System.out.println("URL: jdbc:h2:" + server.getURL() + "/mem:test");
//
//        // now start the H2 Console here or in another process using
//        // java org.h2.tools.Console -web -browser
//
//        System.out.println("Press [Enter] to stop.");
//        System.in.read();
//
//        System.out.println("Stopping server and closing the connection");
//        server.stop();
//        conn.close();
    }
}
