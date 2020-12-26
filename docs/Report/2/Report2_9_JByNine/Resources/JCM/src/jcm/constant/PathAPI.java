package jcm.constant;

    public class PathAPI {
        public static String HOST_API = "http://jcm.com/api";
        public static String USER_PATH = HOST_API + "/users";
        public static String USER_CREATE_ENTRY = USER_PATH  +  "/insert";
        public static String USER_REMOVE_ENTRY = USER_PATH  +  "/remove";


    public static String COURSE_PATH= HOST_API + "/courses";
    public static String COURSE_CREATE_ENTRY  = COURSE_PATH  + "/insert";
    public static String COURSE_REMOVE_ENTRY = COURSE_PATH  +  "/remove";


    public static String LESSONS_PATH = HOST_API + "/lessons";
    public static String LESSONS_CREATE_ENTRY  = LESSONS_PATH  + "/insert";
    public static String LESSONS_REMOVE_ENTRY  = LESSONS_PATH  + "/remove";


    public static String EXERCISE_PATH = HOST_API + "/exercises";
    public static String EXERCISE_CREATE_ENTRY  = EXERCISE_PATH  + "/insert";
    public static String EXERCISE_REMOVE_ENTRY  = EXERCISE_PATH  + "/remove";


}
