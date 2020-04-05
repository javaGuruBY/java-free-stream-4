package service;

import bean.User;

public class UserLoginService {
    public Boolean login(User user, String password){
        if (!user.getBlocked() && user.getPassword().equals(password) && user.getAttemptsBeforeBlock() != 0){
            user.clearAttempts();
            return true;
        }
        user.decreaseAttempts();
        return false;
    }
}
