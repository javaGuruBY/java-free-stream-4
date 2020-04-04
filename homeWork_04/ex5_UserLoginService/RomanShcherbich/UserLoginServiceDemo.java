package UserLoginService;

import UserLoginService.bean.User;
import UserLoginService.service.UserLoginService;

public class UserLoginServiceDemo {

  public static void main(String[] args) {
    UserLoginService service = new UserLoginService();
    User userOne = new User("user-login", "user-password");
    System.out.println("Try to login with invalid password - result: " + service.login(userOne, "user-password-12345"));
    System.out.println("Try to login with valid password - result: " + service.login(userOne, "user-password"));
  }
}
