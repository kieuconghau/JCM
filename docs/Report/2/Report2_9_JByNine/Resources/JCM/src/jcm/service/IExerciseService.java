package jcm.service;

import jcm.model.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IExerciseService {
    Connection conn;
    final String exercisesTable = "exercises";
    final String questionsTable = "questions";
    final String user_do_exercisesTable = "user_do_exercises";
    final String user_question_answersTable = "user_question_answers";

    IExerciseService(Connection connection) {
        conn = connection;
    }

    // exercises
    Exercise getExercise(int id) throws SQLException {
        String sql = String.format("SELECT id, title, body, start_time, end_time, course_id " +
                "FROM %s WHERE id = %d", exercisesTable, id);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        ArrayList<Exercise> exercises = Exercise.getExercisesByRS(rs);
        return (exercises == null ? null : exercises.get(0));
    }

    ArrayList<Exercise> getAllExercises() throws SQLException {
        String sql = String.format("SELECT id, title, body, start_time, end_time, course_id " +
                "FROM %s", exercisesTable);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        return Exercise.getExercisesByRS(rs);
    }

    ArrayList<Exercise> getAllExercisesFromCourse(int course_id) throws SQLException {
        String sql = String.format("SELECT id, title, body, start_time, end_time, course_id " +
                "FROM %s WHERE course_id = %d", exercisesTable, course_id);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        return Exercise.getExercisesByRS(rs);
    }

    void insertExercise(Exercise exercise) throws SQLException {
        String sql = String.format("INSERT INTO %s (title, body, start_time, end_time, course_id) " +
                        "VALUES ('%s', '%s', '%s', '%s', %d)", exercisesTable, exercise.getTitle(), exercise.getBody(),
                exercise.getStart_time(), exercise.getEnd_time(), exercise.getCourse_id());
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    void updateExercise(Exercise exercise, int id) throws SQLException {
        String sql = String.format("UPDATE %s " +
                        "SET title = '%s', body = '%s', start_time = '%s', end_time = '%s', course_id = %d " +
                        "WHERE id = %d", exercisesTable, exercise.getTitle(), exercise.getBody(),
                exercise.getStart_time(), exercise.getEnd_time(), exercise.getCourse_id(), id);
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    void removeExercise(Exercise exercise) throws SQLException {
        String sql = String.format("DELETE FROM %s WHERE id = %d", exercisesTable, exercise.getId());
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    // questions
    ArrayList<Question> getAllQuestionsFromExercise(int exercise_id) throws SQLException {
        String sql = String.format("SELECT id, exercise_id, question_type, question_body, question_answer, updated_at "
                + "FROM %s WHERE exercise_id = %d", questionsTable, exercise_id);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        return Question.getQuestionsByRS(rs);
    }

    void insertQuestion(Question question) throws SQLException {
        String sql = String.format("INSERT INTO %s (exercise_id, question_type, question_body, question_answer, " +
                        "updated_at) " +
                        "VALUES (%d, %d, '%s', '%s', '%s')", questionsTable, question.getExercise_id(),
                question.getQuestion_type(), question.getQuestion_body(), question.getQuestion_answer(),
                question.getUpdateTime());
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    void removeQuestion(Question question) throws SQLException {
        String sql = String.format("DELETE FROM %s WHERE id = %d", questionsTable, question.getId());
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    // user_do_exercises
    UserDoExercises getUserDoExercise(int id) throws SQLException {
        String sql = String.format("SELECT id, exercise_id, user_id, start_time, finish_time, attemped_counter, " +
                "attemp_time, submitted" +
                "FROM %s WHERE id = %d", user_do_exercisesTable, id);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        ArrayList<UserDoExercises> userDoExercises = UserDoExercises.getUserDoExercisesByRS(rs);
        return (userDoExercises == null ? null : userDoExercises.get(0));
    }

    void insertUserDoExercise(UserDoExercises userDoExercises) throws SQLException {
        String sql = String.format("INSERT INTO %s (exercise_id, user_id, start_time, finish_time, attemped_counter, " +
                "attemp_time, submitted) " +
                        "VALUES (%d, %d, '%s', '%s', %d, '%s', %d)", user_do_exercisesTable,
                userDoExercises.getExercise_id(), userDoExercises.getUser_id(), userDoExercises.getStart_time(),
                userDoExercises.getFinish_time(), userDoExercises.getAttemped_counter(),
                userDoExercises.getAttemp_time(), userDoExercises.isSubmitted() ? 1 : 0);
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }

    // user_question_answers
    UserQuestionAnswers getUserQuestionAnswers(int session_id, int exercise_id, int question_id) throws SQLException {
        String sql = String.format("SELECT * FROM %s WHERE user_exercise_session = %d and exercise_id = %d and " +
                "question_id = %d", user_question_answersTable, session_id, exercise_id, question_id);
        ResultSet rs = conn.createStatement().executeQuery(sql);
        ArrayList<UserQuestionAnswers> userQuestionAnswers = UserQuestionAnswers.getUserQuestionAnswersByRS(rs);
        return (userQuestionAnswers == null ? null : userQuestionAnswers.get(0));
    }

    void insertUserQuestionAnswer(UserQuestionAnswers uqa) throws SQLException {
        String sql = String.format("INSERT INTO %s (exercise_id, question_id, user_answer, updated_at, correct, " +
                "user_exercise_session " +
                "VALUES (%d, %d, '%s', '%s', %d, %d)", user_question_answersTable,
                uqa.getExercise_id(), uqa.getQuestion_id(), uqa.getUser_answer(), uqa.getUpdateTime(),
                uqa.isCorrect() ? 1 : 0, uqa.getUser_exercise_session());
        conn.createStatement().executeUpdate(sql);
        conn.commit();
    }
}
