package learn.programming_methods.glava3.simpledao;

import learn.programming_methods.glava3.action.WrapperConnector;
import learn.programming_methods.glava3.data.subject.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class AbstractDAO<K, T extends Entity> {
    protected WrapperConnector connector;
    public abstract List<T> findAll();
    public abstract T findEntityById(K id);
    public abstract boolean delete(K id);
    public abstract boolean delete(T entity);
    public abstract boolean create(T entity);
    public abstract T update(T entity);
    public void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            // Лог о невозможности закрытия Statement
            System.err.println(e.getMessage());
        }
    }
    public void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            // Лог о невозможности закрытия Statement
            System.err.println(e.getMessage());
        }
    }
    public void close() {
        connector.closeConnection();
    }
    protected void closeStatement(Statement statement) {
        connector.closeStatement(statement);
    }
}
