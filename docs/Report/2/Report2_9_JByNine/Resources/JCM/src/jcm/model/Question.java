package jcm.model;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Question extends Model{
    protected String table = "questions";
    protected int id;
    protected int exercise_id;
    protected int question_type;
    protected String question_body;
    protected String question_answer;

    public int getId() {
        return id;
    }

    public int getExercise_id() {
        return exercise_id;
    }

    public int getQuestion_type() {
        return question_type;
    }

    public String getQuestion_answer() {
        return question_answer;
    }

    public String getQuestion_body() {
        return question_body;
    }

    public String getUpdateTime() {
        return new java.sql.Timestamp((new java.util.Date()).getTime()).toString();
    }

    public static ArrayList<Question> getQuestionsByRS(ResultSet rs) {
        return null;
    }

    public static final class QuestionsBuilder {
        protected int exercise_id;
        protected int question_type;
        protected String question_body;
        protected String question_answer;

        private QuestionsBuilder() {
        }

        public static QuestionsBuilder aQuestions() {
            return new QuestionsBuilder();
        }

        public QuestionsBuilder withExercise_id(int exercise_id) {
            this.exercise_id = exercise_id;
            return this;
        }

        public QuestionsBuilder withQuestion_type(int question_type) {
            this.question_type = question_type;
            return this;
        }

        public QuestionsBuilder withQuestion_body(String question_body) {
            this.question_body = question_body;
            return this;
        }

        public QuestionsBuilder withQuestion_answer(String question_answer) {
            this.question_answer = question_answer;
            return this;
        }

        public Question build() {
            Question questions = new Question();
            questions.question_type = this.question_type;
            questions.question_body = this.question_body;
            questions.exercise_id = this.exercise_id;
            questions.question_answer = this.question_answer;
            return questions;
        }
    }
}
