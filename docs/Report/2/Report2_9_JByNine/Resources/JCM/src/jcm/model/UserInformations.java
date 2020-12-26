package jcm.model;

import jcm.constant.EUserRole;

public class UserInformations  extends Model{
    protected String name;
    protected String email;
    protected String fullname;
    protected String phone;
    protected String profile_picture;
    protected String DateOfBirth;
    protected String status;
    protected String bio;
    protected int role;
    public  UserInformations(){
        this.table = "user_informations";
    }
    public String getStatus() {
        return status;
    }

    public String getBio() {
        return bio;
    }

    public EUserRole getRole() {
        return EUserRole.values()[role];
    }

    public int getRoleInt() {
        return role;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }


    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getFullname() {
        return fullname;
    }

    public String getName() {
        return name;
    }

    public static final class UserInformationsBuilder {
        protected String name;
        protected String email;
        protected String fullname;
        protected String phone;
        protected String profile_picture;
        protected String DateOfBirth;
        protected String status;
        protected String bio;
        protected int role;

        private UserInformationsBuilder() {
        }

        public static UserInformationsBuilder anUserInformations() {
            return new UserInformationsBuilder();
        }

        public UserInformationsBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserInformationsBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserInformationsBuilder withFullname(String fullname) {
            this.fullname = fullname;
            return this;
        }

        public UserInformationsBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserInformationsBuilder withProfile_picture(String profile_picture) {
            this.profile_picture = profile_picture;
            return this;
        }

        public UserInformationsBuilder withDateOfBirth(String DateOfBirth) {
            this.DateOfBirth = DateOfBirth;
            return this;
        }

        public UserInformationsBuilder withStatus(String status) {
            this.status = status;
            return this;
        }

        public UserInformationsBuilder withBio(String bio) {
            this.bio = bio;
            return this;
        }

        public UserInformationsBuilder withRole(int role) {
            this.role = role;
            return this;
        }

        public UserInformations build() {
            UserInformations userInformations = new UserInformations();
            userInformations.name = this.name;
            userInformations.role = this.role;
            userInformations.bio = this.bio;
            userInformations.fullname = this.fullname;
            userInformations.profile_picture = this.profile_picture;
            userInformations.email = this.email;
            userInformations.status = this.status;
            userInformations.phone = this.phone;
            userInformations.DateOfBirth = this.DateOfBirth;
            return userInformations;
        }
    }
}
