package learn.programming_methods.glava3.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

public class WrapperConnector {
    private Connection connection;
    public WrapperConnector() {
        try {
            ResourceBundle resource = ResourceBundle.getBundle("property/database");
            String url = resource.getString("db.url");
            String user = resource.getString("db.login");
            String pass = resource.getString("db.password");
            Properties prop = new Properties();
            prop.put("db.login", user);
            prop.put("db.password", pass);
            connection = DriverManager.getConnection(url, prop);
        } catch (MissingResourceException e) {
            System.err.println("Properties file is missing " + e);
        } catch (SQLException e) {
            System.err.println("Not obtained connection " + e);
        }
    }
    public Statement getStatement() throws SQLException {
        if (connection != null) {
            Statement statement = connection.createStatement();
            if (statement != null) {
                return statement;
            }
        }
        throw new SQLException("Connection or statement is null");
    }
    public void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                System.err.println("Statement is null " + e);
            }
        }
    }
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Wrong connection " + e);
            }
        }
    }
    public Connection getConnection() {
        return this.connection;
    }

    // Другие необходимые делегированные методы интерфейса Connection
}
