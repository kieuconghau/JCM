package jcm.model;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UserQuestionAnswers extends Model{
    protected String table = "user_question_answers";
    protected int exercise_id;
    protected int question_id;
    protected String user_answer;
    protected boolean correct ;
    protected int user_exercise_session;

    public int getQuestion_id() {
        return question_id;
    }

    public int getUser_exercise_session() {
        return user_exercise_session;
    }

    public String getUser_answer() {
        return user_answer;
    }

    public int getExercise_id() {
        return exercise_id;
    }

    public boolean isCorrect() {
        return correct;
    }

    public String getUpdateTime() {
        return new java.sql.Timestamp((new java.util.Date()).getTime()).toString();
    }

    public static ArrayList<UserQuestionAnswers> getUserQuestionAnswersByRS(ResultSet rs) {
        return null;
    }
}
