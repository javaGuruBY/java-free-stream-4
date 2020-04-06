public class UserLoginServiceDemo {
    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();

        User user = new User("login", "password");

        System.out.println(service.login(user, "password"));
        System.out.println(service.login(user, "password"));
    }
}
