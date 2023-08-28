import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {

    public static String felhasznalo = System.getenv("name");
    public static String adatbazis = System.getenv("url");
    public static String jelszo = System.getenv("password");


    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(adatbazis, felhasznalo, jelszo);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }
    public static void main(String[] args) {




    }
}