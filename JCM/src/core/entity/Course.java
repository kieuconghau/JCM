package core.entity;

import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author JByNine
 */
public class Course {
    public Course(int ID, String Name, String Description, String ImagePath, int AuthorID) {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
        this.ImagePath = ImagePath;
        this.AuthorID = AuthorID;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public int getAuthorID() {
        return AuthorID;
    }
    
    private int ID;
    private String Name;
    private String Description;
    private String ImagePath;
    private int AuthorID;
}
