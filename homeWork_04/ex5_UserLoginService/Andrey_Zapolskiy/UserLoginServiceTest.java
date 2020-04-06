public class UserLoginServiceTest {
    public static void main(String[] args) {
        UserLoginServiceTest testRunner = new UserLoginServiceTest();
        testRunner.UserBlocked();

    }

    public void UserBlocked(){
        String testDescription = "if User was blocked";

        UserLoginService victim1 = new UserLoginService();
        User user = new User("User", "23456");
        boolean expectedResult = true;
        boolean actualResult = victim1.login(user, "23456");
        checkThatEqual(expectedResult, actualResult, testDescription);


    }
    public void checkThatEqual(boolean expected, boolean actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("expected \"" + expected + "\", but was \"" + actual + "\"");
        }

    }
}
