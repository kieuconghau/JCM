package jcm.model;

public class User extends Model{
    protected String table = "users";
    protected int name;
    protected String email;

    public static final class UsersBuilder {
        protected int name;
        protected String email;

        private UsersBuilder() {
        }

        public static UsersBuilder anUsers() {
            return new UsersBuilder();
        }

        public UsersBuilder withName(int name) {
            this.name = name;
            return this;
        }

        public UsersBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            User users = new User();
            users.email = this.email;
            users.name = this.name;
            return users;
        }
    }
}
