package learn.programming_methods.glava3.data.main;

import learn.programming_methods.glava3.data.connect.DataBaseHelper;
import learn.programming_methods.glava3.data.subject.Abonent;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreparedJDBCRunner {
    public static void main(String[] args) {
        ArrayList<Abonent> list = new ArrayList<>(List.of(
                new Abonent(87, "Кожух Дмитрий", 1658468),
                new Abonent(51, "Буйкевич Александр", 8866711)
        ));
        DataBaseHelper helper = null;
        PreparedStatement statement = null;
        try {
            helper = new DataBaseHelper();
            statement = helper.getPreparedStatement();
            for (Abonent abonent : list) {
                helper.insertAbonent(statement, abonent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            assert helper != null;
            helper.closeStatement(statement);
        }
    }
}
