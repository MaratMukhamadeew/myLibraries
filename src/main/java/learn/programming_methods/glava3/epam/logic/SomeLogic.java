package learn.programming_methods.glava3.epam.logic;

import learn.programming_methods.glava3.action.WrapperConnector;
import learn.programming_methods.glava3.data.connect.ConnectorDB;
import learn.programming_methods.glava3.simpledao.AbonentDAO;
import learn.programming_methods.glava3.simpledao.PaymentDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class SomeLogic {
    public void doLogic(int id) throws SQLException {
        // 1. Создание-получение соединения
        WrapperConnector wrapperConnector = new WrapperConnector();
        Connection connection = wrapperConnector.getConnection();
        // 2. Открытие транзакции
        connection.setAutoCommit(false);
        // 3. Инициализация необходимых экземпляров DAO
        AbonentDAO abonentDAO = new AbonentDAO();
        PaymentDAO paymentDAO = new PaymentDAO();
        // 4. Выполнение запросов
        abonentDAO.findAll();
        paymentDAO.findEntityById(id);
        paymentDAO.delete(id);
        // 5. Закрытие транзакции
        connection.commit();
        // 6. Закрытие-возвращение соединения
        wrapperConnector.closeConnection();
    }
}
