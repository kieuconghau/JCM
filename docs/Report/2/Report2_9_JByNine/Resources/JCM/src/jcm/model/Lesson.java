package jcm.model;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Lesson extends Model {
    protected String table = "lessons";
    protected int id;
    protected int course_id;
    protected String title;
    protected String description;
    protected String body;

    public int getId() {
        return id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBody() {
        return body;
    }

    public static ArrayList<Lesson> getLessonsByRS(ResultSet rs) {
        return null;
    }

    public static final class LessonsBuilder {
        protected String table = "lessons";
        protected int course_id;
        protected String title;
        protected String description;
        protected String body;

        private LessonsBuilder() {
        }

        public static LessonsBuilder aLessons() {
            return new LessonsBuilder();
        }


        public LessonsBuilder withCourse_id(int course_id) {
            this.course_id = course_id;
            return this;
        }

        public LessonsBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public LessonsBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public LessonsBuilder withBody(String body) {
            this.body = body;
            return this;
        }

        public LessonsBuilder withTable(String table) {
            this.table = table;
            return this;
        }

        public Lesson build() {
            Lesson lessons = new Lesson();
            lessons.setTable(table);
            lessons.setTable(table);
            lessons.description = this.description;
            lessons.title = this.title;
            lessons.body = this.body;
            lessons.course_id = this.course_id;
            return lessons;
        }
    }
}
