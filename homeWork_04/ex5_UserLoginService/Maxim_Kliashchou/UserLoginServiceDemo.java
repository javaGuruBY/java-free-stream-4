import bean.User;
import service.UserLoginService;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();

        User user = new User("user-login", "user-password");

        System.out.println(service.login(user, "user-password"));
        System.out.println(service.login(user, "password"));
    }
}
