package jcm.model;

import java.sql.ResultSet;
import java.util.ArrayList;

public class LessonComment extends Model {
    protected String table = "lesson_comment";
    protected int id;
    protected int lesson_id;
    protected int user_id;
    protected String cmt_body;

    public int getId() {
        return id;
    }

    public int getLesson_id() {
        return lesson_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getCmt_body() {
        return cmt_body;
    }

    public static ArrayList<LessonComment> getLessonCommentsByRS(ResultSet rs) {
        return null;
    }
}
