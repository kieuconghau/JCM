package core.entity;

import java.util.ArrayList;

/**
 *
 * @author JByNine
 */
public class User {
    public User(int ID, String Username, String FullName, String AvatarPath) {
        this.ID = ID;
        this.Username = Username;
        this.FullName = FullName;
        this.AvatarPath = AvatarPath;
    }

    public int getID() {
        return ID;
    }
    
    public String getUsername() {
        return Username;
    }

    public String getFullName() {
        return FullName;
    }

    public String getAvatarPath() {
        return AvatarPath;
    }
    
    public ArrayList<Course> getCourses() {
        return Courses;
    }
    
    protected int ID;
    protected String Username;
    protected String FullName;
    protected String AvatarPath;
    protected ArrayList<Course> Courses;
}
