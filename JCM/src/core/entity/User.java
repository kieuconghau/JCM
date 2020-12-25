package core.entity;

/**
 *
 * @author JByNine
 */
public class User {
    public User(int ID, int Role, String Username, String FullName, String AvatarPath) {
        this.ID = ID;
        this.Role = Role;
        this.Username = Username;
        this.FullName = FullName;
        this.AvatarPath = AvatarPath;
    }

    public int getID() {
        return ID;
    }

    public int getRole() {
        return Role;
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
    
    private int ID;
    private int Role;
    private String Username;
    private String FullName;
    private String AvatarPath;
}
