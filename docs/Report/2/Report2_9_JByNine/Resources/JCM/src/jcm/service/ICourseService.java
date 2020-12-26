package jcm.service;

import jcm.model.Course;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ICourseService {
    Connection conn;
    final String coursesTable = "courses";
    final String userEnrollmentsTable = "user_enrolments";

    ICourseService(Connection connection) {
        conn = connection;
    }

    public Course getCourse(int id) throws SQLException {
        String sql = String.format("SELECT id, course_id, course_name, course_description, picture, author_id " +
                "FROM %s WHERE id = %d", coursesTable, id);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        ArrayList<Course> courses = Course.getCoursesByRS(rs);
        return (courses == null ? null : courses.get(0));
    }

    public ArrayList<Course> getAllCourses() throws SQLException {
        String sql = String.format("SELECT id, course_id, course_name, course_description, picture, author_id " +
                "FROM %s", coursesTable);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        return Course.getCoursesByRS(rs);
    }

    public ArrayList<Course> getCourseByAuthor(int author_user_id) throws SQLException {
        String sql = String.format("SELECT id, course_id, course_name, course_description, picture, author_id " +
                "FROM %s WHERE author_id = %d", coursesTable, author_user_id);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        return Course.getCoursesByRS(rs);
    }

    public void insertCourse(Course course) throws SQLException {
        String sql = String.format("INSERT INTO %s (course_id, course_name, course_description, picture, author_id) " +
                "VALUES ('%s', '%s', '%s', '%s', %d)", coursesTable, course.getCourse_id(), course.getCourse_name(),
                course.getCourse_description(), course.getPicture(), course.getAuthor_id());
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    public void updateCourse(Course course, int id) throws SQLException {
        String sql = String.format("UPDATE %s " +
                "SET course_id = '%s', course_name = '%s', course_description = '%s', picture = '%s', author_id = %d " +
                "WHERE id = %d", coursesTable, course.getCourse_id(), course.getCourse_name(),
                course.getCourse_description(), course.getPicture(), course.getAuthor_id(), id);
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    public void joinCourse(Course course, int user_id) throws SQLException {
        String sql = String.format("INSERT INTO %s (course_id, user_id) " +
                "VALUES (%d, %d)", userEnrollmentsTable, course.getId(), user_id);
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }
}
