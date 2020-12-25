package core.entity;

/**
 *
 * @author JByNine
 */
public class Teacher extends User {
    public Teacher(int ID, String Username, String FullName, String AvatarPath) {
        super(ID, Username, FullName, AvatarPath);
        init();
    }
    
    public void addNewCourse(Course course) {
        Courses.add(course);
        // Insert new course to table courses.
    }
    
    private void init() {
        // Courses = service.Course.getAllCourses(ID);
        // Initialize courses.
        // With each course, initilize students, lessons, exercises & notifications.
    }
}
