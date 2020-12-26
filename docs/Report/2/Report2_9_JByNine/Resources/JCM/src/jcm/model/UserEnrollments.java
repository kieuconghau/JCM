package jcm.model;

public class UserEnrollments extends Model{
    protected String table ="user_enrolments";
    protected int course_id;
    protected int user_id;

    public int getCourse_id() {
        return course_id;
    }

    public int getUser_id() {
        return user_id;
    }
}
