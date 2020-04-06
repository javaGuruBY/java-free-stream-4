package User;

import User.service.UserLoginService;
import User.bean.User;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
            UserLoginService service = new UserLoginService();
            User firstUser = new User("Ticon", "159357");
            System.out.println("Try to login with invalid password - result: " + service.login(firstUser, "2020327"));
            System.out.println("Try to login with valid password - result: " + service.login(firstUser, "159357"));
    }
}
