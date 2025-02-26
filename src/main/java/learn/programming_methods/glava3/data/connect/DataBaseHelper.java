package learn.programming_methods.glava3.data.connect;

import learn.programming_methods.glava3.data.subject.Abonent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHelper {
    public static final String SQL_INSERT = "INSERT INTO \"PHONEBOOK\"(\"IDPHONEBOOK\", \"LASTNAME\", \"PHONE\") VALUES(?,?,?)";

    private Connection connection;

    public DataBaseHelper() throws SQLException {
        connection = ConnectorDB.getConnection();
    }

    public PreparedStatement getPreparedStatement() {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_INSERT);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return statement;
    }

    public boolean insertAbonent(PreparedStatement statement, Abonent abonent) {
        boolean flag = false;
        try {
            statement.setInt(1, abonent.getId());
            statement.setString(2,abonent.getName());
            statement.setInt(3, abonent.getPhone());
            statement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return flag;
    }

    public void closeStatement(PreparedStatement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
