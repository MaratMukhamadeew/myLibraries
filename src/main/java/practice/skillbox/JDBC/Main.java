package practice.skillbox.JDBC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static final String URL_NEW = "jdbc:mysql://localhost/skillbox?useUnicode=true&serverTimezone=UTC&useSSL=false";
    public static final String USER = "root";
    public static final String PASS = "mysql";

    public static void main(String[] args) {
//        hibernateMethod();
//        classicGetCourses();

        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();

        String hql = "From " + Course.class.getSimpleName() + " Where price > 120000";
        List<Course> courses = session.createQuery(hql).getResultList();
        for (Course course : courses) {
            System.out.println(course.getName() + " - " + course.getPrice());
        }

//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Course> query = builder.createQuery(Course.class);
//        Root<Course> root = query.from(Course.class);
//        query.select(root).where(builder.greaterThan(root.get("price"),100000)).orderBy(builder.desc(root.get("price")));
//
//        List<Course> courses = session.createQuery(query).setMaxResults(5).getResultList();
//
//        for (Course course : courses) {
//            System.out.println(course.getName() + " - " + course.getPrice());
//        }

        sessionFactory.close();
    }


    private static void hibernateMethod() {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Course> query = builder.createQuery(Course.class);
        Root<Course> root = query.from(Course.class);
        query.select(root);

        List<Course> courses = session.createQuery(query).getResultList();
//        courses.forEach(System.out::println);

        for (Course course : courses) {
            System.out.println(course.getName() + " - " + course.getTeacher().getName());
        }

        sessionFactory.close();
    }

    private static SessionFactory getSessionFactory() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        return metadata.getSessionFactoryBuilder().build();
    }

    private static void classicGetCourses() {
        ArrayList<Course> list = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL_NEW, USER, PASS); Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Courses");
            while (resultSet.next()) {
                Course course = getCourse(resultSet);
                list.add(course);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);
    }

    private static Course getCourse(ResultSet resultSet) throws SQLException {
        Course course = new Course();
        course.setId(resultSet.getInt("id"));
        course.setName(resultSet.getString("name"));
        course.setDuration(resultSet.getInt("duration"));
        course.setType(CourseType.valueOf(resultSet.getString("type")));
        course.setDescription(resultSet.getString("description"));
        Teacher teacher = new Teacher();
        teacher.setId(resultSet.getInt("teacher_id"));
        course.setTeacher(teacher);
        course.setStudentCount(resultSet.getInt("students_count"));
        course.setPrice(resultSet.getInt("price"));
        course.setPricePerHour(resultSet.getFloat("price_per_hour"));
        return course;
    }
}
