package jcm.model;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Course extends Model {
    protected String table = "courses";

    protected int id;
    protected String course_id;
    protected String course_name;
    protected String course_description;
    protected String picture;
    protected int author_id;

    public int getId() { return id; }

    public int getAuthor_id() {
        return author_id;
    }

    public String getCourse_description() {
        return course_description;
    }

    public String getCourse_id() {
        return course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getPicture() {
        return picture;
    }

    public static ArrayList<Course> getCoursesByRS(ResultSet rs) {
        return null;
    }

    public static final class CoursesBuilder {
        protected String table = "courses";
        protected String course_id;
        protected String course_name;
        protected String course_description;
        protected String picture;
        protected int author_id;

        private CoursesBuilder() {
        }

        public static CoursesBuilder aCourses() {
            return new CoursesBuilder();
        }

        public CoursesBuilder withTable(String table) {
            this.table = table;
            return this;
        }

        public CoursesBuilder withCourse_id(String course_id) {
            this.course_id = course_id;
            return this;
        }

        public CoursesBuilder withCourse_name(String course_name) {
            this.course_name = course_name;
            return this;
        }

        public CoursesBuilder withCourse_description(String course_description) {
            this.course_description = course_description;
            return this;
        }

        public CoursesBuilder withPicture(String picture) {
            this.picture = picture;
            return this;
        }

        public CoursesBuilder withAuthor_id(int author_id) {
            this.author_id = author_id;
            return this;
        }

        public Course build() {
            Course courses = new Course();
            courses.setTable(table);
            courses.course_name = this.course_name;
            courses.picture = this.picture;
            courses.course_id = this.course_id;
            courses.course_description = this.course_description;
            courses.author_id = this.author_id;
            return courses;
        }
    }
}
