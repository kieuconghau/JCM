package jcm.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    Connection conn;
    public ICourseService iCourseService;
    public IExerciseService iExerciseService;
    public ILessonService iLessonService;
    public IUserService iUserService;

    public Database(String username, String password) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/jcm", username, password);
        conn.setAutoCommit(false);
        iCourseService = new ICourseService(conn);
        iExerciseService = new IExerciseService(conn);
        iLessonService = new ILessonService(conn);
        iUserService = new IUserService(conn);
    }

    public void rollback() throws SQLException {
        conn.rollback();
    }

    public void close() throws SQLException {
        conn.close();
    }
}
