package lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static lesson23.ConnectionData.DRIVER;
import static lesson23.ConnectionData.USER;
import static lesson23.ConnectionData.URL;
import static lesson23.ConnectionData.PASSWORD;

public class CreatingTable {
    private static final String CREATE_TABLE_QUERY =
            "CREATE TABLE phones "
                    + "(id INT(5) NOT NULL AUTO_INCREMENT,"
                    + " user_id INT(5), "
                    + "phone_number VARCHAR(10),"
                    + "PRIMARY KEY(id));";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE_QUERY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
