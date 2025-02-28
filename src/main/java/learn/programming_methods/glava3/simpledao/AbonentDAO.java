package learn.programming_methods.glava3.simpledao;

import learn.programming_methods.glava3.action.WrapperConnector;
import learn.programming_methods.glava3.data.connect.ConnectorDB;
import learn.programming_methods.glava3.data.subject.Abonent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AbonentDAO extends AbstractDAO<Integer, Abonent> {
    public static final String SQL_SELECT_ALL_ABONENTS = "SELECT * FROM \"PHONEBOOK\"";
    public static final String SQL_SELECT_ABONENT_BY_LASTNAME = "SELECT \"IDPHONEBOOK\",\"PHONE\" WHERE \"LASTNAME\"=?";

    public AbonentDAO() {
        this.connector = new WrapperConnector();
    }
    @Override
    public List<Abonent> findAll() {
        List<Abonent> abonents = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectorDB.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_ABONENTS);
            while (resultSet.next()) {
                Abonent abonent = new Abonent();
                abonent.setId(resultSet.getInt("IDPHONEBOOK"));
                abonent.setPhone(resultSet.getInt("PHONE"));
                abonent.setName(resultSet.getString("LASTNAME"));
                abonents.add(abonent);
            }
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed): " + e);
        } finally {
            close(statement);
        }
        return abonents;
    }

    @Override
    public Abonent findEntityById(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean create(Abonent entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Abonent update(Abonent entity) {
        throw new UnsupportedOperationException();
    }

    // Собственный метод DAO
    public Abonent findAbonentByLastName(String name) {
        Abonent abonent = new Abonent();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectorDB.getConnection();
            statement = connection.prepareStatement(SQL_SELECT_ABONENT_BY_LASTNAME);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                abonent.setId(resultSet.getInt("IDPHONEBOOK"));
                abonent.setPhone(resultSet.getInt("PHONE"));
                abonent.setName(resultSet.getString(name));
            }
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed): " + e);
        } finally {
            close(statement);
        }
        return abonent;
    }

    @Override
    public boolean delete(Abonent entity) {
        throw new UnsupportedOperationException();
    }

}
