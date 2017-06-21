package cz.adastra.jdbc.partial;

import java.sql.*;

public class JdbcSelect {

    static final String DB_URL = "jdbc:h2:~/test";
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT id, name, surname, age FROM STUDENT";
            System.out.println(sql + ":");

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("name");
                String last = rs.getString("surname");

                System.out.print("ID: " + id);
                System.out.print(",\t Age: " + age);
                System.out.print(",\t First: " + first);
                System.out.println(",\t Last: " + last);
            }
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}