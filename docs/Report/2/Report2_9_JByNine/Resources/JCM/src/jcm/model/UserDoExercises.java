package jcm.model;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDoExercises  extends Model{
    public int exercise_id;
    public int user_id;
    public int start_time;
    public int finish_time;
    public int attemped_counter;
    public int attemp_time;
    public boolean submitted;

    public int getExercise_id() {
        return exercise_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getStart_time() {
        return start_time;
    }

    public int getAttemp_time() {
        return attemp_time;
    }

    public int getAttemped_counter() {
        return attemped_counter;
    }

    public int getFinish_time() {
        return finish_time;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public static ArrayList<UserDoExercises> getUserDoExercisesByRS(ResultSet rs) {
        return null;
    }
}
