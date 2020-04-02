package UserLoginService.service;

import UserLoginService.bean.User;

public class UserLoginService {

  public boolean login(User user, String password) {
    int tries = user.getTryLoginCount();

    if (user.isBlocked()) {
      System.out.println("User is blocked");
      return false;
    }

    boolean isPasswordCorrect = user.getPassword() == password;
    if (isPasswordCorrect) {
      user.resetTries();
    } else {
      tries = tries - 1;
      user.setTryLoginCount(tries);
    }

    if (tries == 0) {
      user.setBlocked(true);
    }

    return isPasswordCorrect;
  }
}
