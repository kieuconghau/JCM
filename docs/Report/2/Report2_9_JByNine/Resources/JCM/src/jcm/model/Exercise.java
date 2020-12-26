package jcm.model;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Exercise extends Model {
    protected String table ="exercises";
    protected int id;
    protected String title;
    protected String body;
    protected long start_time;
    protected long end_time;
    protected int course_id;

    public int getId() { return id; }

    public int getCourse_id() {
        return course_id;
    }

    public long getEnd_time() {
        return end_time;
    }

    public long getStart_time() {
        return start_time;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public static ArrayList<Exercise> getExercisesByRS(ResultSet rs) {
        return null;
    }

    public static final class ExercisesBuilder {
        protected String table ="exercises";
        protected String title;
        protected String body;
        protected int start_time;
        protected int end_time;
        protected int course_id;

        private ExercisesBuilder() {
        }

        public static ExercisesBuilder anExercises() {
            return new ExercisesBuilder();
        }

        public ExercisesBuilder withTable(String table) {
            this.table = table;
            return this;
        }

        public ExercisesBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public ExercisesBuilder withBody(String body) {
            this.body = body;
            return this;
        }

        public ExercisesBuilder withStart_time(int start_time) {
            this.start_time = start_time;
            return this;
        }

        public ExercisesBuilder withEnd_time(int end_time) {
            this.end_time = end_time;
            return this;
        }

        public ExercisesBuilder withCourse_id(int course_id) {
            this.course_id = course_id;
            return this;
        }

        public Exercise build() {
            Exercise exercises = new Exercise();
            exercises.setTable(table);
            exercises.end_time = this.end_time;
            exercises.course_id = this.course_id;
            exercises.title = this.title;
            exercises.body = this.body;
            exercises.start_time = this.start_time;
            return exercises;
        }
    }
}
