package jcm.service;

import jcm.model.Exercise;
import jcm.model.Lesson;
import jcm.model.LessonComment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ILessonService {
    Connection conn;
    final String lessonsTable = "lessons";
    final String lessonCommentTable = "lesson_comment";

    ILessonService(Connection connection) {
        conn = connection;
    }

    // lesson
    Lesson getLesson(int id) throws SQLException {
        String sql = String.format("SELECT id, course_id, title, description, body " +
                "FROM %s WHERE id = %d", lessonsTable, id);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        ArrayList<Lesson> lessons = Lesson.getLessonsByRS(rs);
        return (lessons == null ? null : lessons.get(0));
    }

    ArrayList<Lesson> getAllLessons() throws SQLException {
        String sql = String.format("SELECT id, course_id, title, description, body " +
                "FROM %s", lessonsTable);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        return Lesson.getLessonsByRS(rs);
    }

    ArrayList<Lesson> getAllLessonsFromCourse(int course_id) throws SQLException {
        String sql = String.format("SELECT id, course_id, title, description, body " +
                "FROM %s WHERE course_id = %d", lessonsTable, course_id);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        return Lesson.getLessonsByRS(rs);
    }

    void insertLesson(Lesson lesson) throws SQLException {
        String sql = String.format("INSERT INTO %s (course_id, title, description, body) " +
                        "VALUES (%d, '%s', '%s', '%s')", lessonsTable, lesson.getCourse_id(), lesson.getTitle(),
                lesson.getDescription(), lesson.getBody());
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    void updateLesson(Lesson lesson, int id) throws SQLException {
        String sql = String.format("UPDATE %s " +
                        "SET course_id = %d, title = '%s', description = '%s', body = '%s' " +
                        "WHERE id = %d", lessonsTable, lesson.getCourse_id(), lesson.getTitle(),
                lesson.getDescription(), lesson.getBody(), id);
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    void removeLesson(Lesson lesson) throws SQLException {
        String sql = String.format("DELETE FROM %s WHERE id = %d", lessonsTable, lesson.getId());
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    // lesson_comment
    ArrayList<LessonComment> getLessonCommentsOfLesson(int lesson_id) throws SQLException {
        String sql = String.format("SELECT * FROM %s WHERE lesson_id = %d", lessonCommentTable, lesson_id);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        return LessonComment.getLessonCommentsByRS(rs);
    }

    void insertLessonComment(LessonComment lessonComment) throws SQLException {
        String sql = String.format("INSERT INTO %s (lesson_id, user_id, cmt_body) " +
                "VALUES (%d, %d, '%s')", lessonCommentTable, lessonComment.getLesson_id(), lessonComment.getUser_id(),
                lessonComment.getCmt_body());
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }
}
