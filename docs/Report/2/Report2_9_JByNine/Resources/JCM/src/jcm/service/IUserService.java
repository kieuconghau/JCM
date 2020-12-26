package jcm.service;


import jcm.api.users.request.*;
import jcm.api.users.response.*;

import java.sql.Connection;

public class IUserService {
    Connection Conn;

    IUserService(Connection connection) {
        Conn = connection;
    }

    LoginAccountResult loginAccount(LoginAccount loginAccountRequest) {

        return null;
    }

    UserInformationResult getUserInformation(UserInformation userInformationRequest) {

        return null;
    }
}
