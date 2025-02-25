package learn.programming_methods.glava3.data.main;

import learn.programming_methods.glava3.data.subject.Abonent;

import java.sql.*;
import java.util.ArrayList;

public class SimpleJDBCRunner {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/testphones";
//        Properties prop = new Properties();
//        prop.put("login", "postgres");
//        prop.put("password", "postgres");
//        prop.put("autoReconnect", "true");
//        prop.put("characterEncoding", "UTF-8");
//        prop.put("useUnicode", "true");
        Connection cn = null;
//        Class.forName("org.postgresql.Driver");
        try { // 1 блок
            cn = DriverManager.getConnection(url, "postgres", "postgres");
            Statement st = null;
            try { // 2 блок
                st = cn.createStatement();
                ResultSet rs = null;
                try { // 3 блок
                    rs = st.executeQuery("select * from \"PHONEBOOK\"");
                    ArrayList<Abonent> lst = new ArrayList<>();
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        String name = rs.getString(2);
                        int phone = rs.getInt(3);
                        lst.add(new Abonent(id, name, phone));
                    }
                    if (lst.size() > 0) {
                        System.out.println(lst);
                    } else {
                        System.out.println("Not found");
                    }
                } finally { // Для 3-го try
                    /*
                    * закрыть ResultSet, если он был открыт или ошибка произошла во время
                    * чтения из него данных
                    * */
                    if (rs != null) { // был ли создан ResultSet
                        rs.close();
                    } else {
                        System.err.println("Ошибка во время чтения из БД");
                    }
                }
            } finally { // Для 2-го try
                // Закрыть Statement, если он открыт или ошибка произошла во время создания Statement
                if (st != null) {
                    st.close();
                } else {
                    System.err.println("Statement не создан");
                }
            }
        } catch (SQLException e) { // Для 1-го try
            System.err.println("DB connection error: " + e);
        } finally {
            // Закрыть Connection, если он был открыт
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.err.println("Connection close error: " + e);
                }
            }
        }
    }
}
