import java.sql.*;

public class ConnectionFactory {

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

      Connection connection = getConnection();
        try (
                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery("SELECT * FROM felhasznalo");
        ) {
            while ((resultSet.next())) {

                System.out.println(resultSet.getString("name"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();

        }



    }
}