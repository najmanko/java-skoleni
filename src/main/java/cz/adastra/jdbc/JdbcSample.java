package cz.adastra.jdbc;

import java.sql.*;

public class JdbcSample {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:mem:mydb";
    static final String USER = "sa";
    static final String PASS = "sa";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            //cretae SQL TABLE AND DATA
            stmt.executeUpdate("CREATE TABLE STUDENT (" +
                    "         ID           NUMBER(5) PRIMARY KEY," +
                    "         NAME         VARCHAR2(15) NOT NULL," +
                    "         SURNAME      VARCHAR2(20) NOT NULL,\n" +
                    "         AGE          NUMBER(3)\n" +
                    "         );");
            stmt.executeUpdate("INSERT INTO STUDENT VALUES (1, 'Jan', 'Nepomuk', 387);");
            stmt.executeUpdate("INSERT INTO STUDENT VALUES (2, 'Jara', 'Cimrman', 100);");
            stmt.executeUpdate("INSERT INTO STUDENT VALUES (3, 'Milos', 'Zeman', 70);");
            stmt.executeUpdate("INSERT INTO STUDENT VALUES (4, 'Petr', 'Maly', 5);");

            //read from TABLE
            String sql = "SELECT id, name, surname, age FROM STUDENT";
            System.out.println(sql + ":");

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(",\t Age: " + rs.getInt("age"));
                System.out.print(",\t First: " + rs.getString("name"));
                System.out.println(",\t Last: " + rs.getString("surname"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }
}