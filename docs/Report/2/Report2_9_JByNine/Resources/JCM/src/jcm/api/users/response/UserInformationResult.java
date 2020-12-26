package jcm.api.users.response;

import jcm.model.*;

public class UserInformationResult {
    protected UserInformations userInformations;
    protected User user;

    public UserInformations getUserInformations() {
        return userInformations;
    }

    public User getUser() {
        return user;
    }

    public static final class UserInformationResultBuilder {
        protected UserInformations userInformations;
        protected User user;

        private UserInformationResultBuilder() {
        }

        public static UserInformationResultBuilder anUserInformationResult() {
            return new UserInformationResultBuilder();
        }

        public UserInformationResultBuilder withUserInformations(UserInformations userInformations) {
            this.userInformations = userInformations;
            return this;
        }

        public UserInformationResultBuilder withUser(User user) {
            this.user = user;
            return this;
        }

        public UserInformationResult build() {
            UserInformationResult userInformationResult = new UserInformationResult();
            userInformationResult.userInformations = this.userInformations;
            userInformationResult.user = this.user;
            return userInformationResult;
        }
    }
}
