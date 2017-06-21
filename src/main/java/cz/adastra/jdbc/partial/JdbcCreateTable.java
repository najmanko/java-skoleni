package cz.adastra.jdbc.partial;

import java.sql.*;

public class JdbcCreateTable {

    static final String DB_URL = "jdbc:h2:~/test";
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            //cretae SQL TABLE AND DATA
            stmt.executeUpdate("CREATE TABLE STUDENT (" +
                    "         ID           NUMBER(5) PRIMARY KEY," +
                    "         NAME         VARCHAR2(15) NOT NULL," +
                    "         SURNAME      VARCHAR2(20) NOT NULL," +
                    "         AGE          NUMBER(3)\n" +
                    "         );");
            stmt.executeUpdate("INSERT INTO STUDENT VALUES (1, 'Jan', 'Nepomuk', 387);");
            stmt.executeUpdate("INSERT INTO STUDENT VALUES (2, 'Jara', 'Cimrman', 100);");
            stmt.executeUpdate("INSERT INTO STUDENT VALUES (3, 'Milos', 'Zeman', 70);");
            stmt.executeUpdate("INSERT INTO STUDENT VALUES (4, 'Petr', 'Maly', 5);");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}