package User;

import User.service.UserLoginService;
import User.bean.User;

public class UserLoginServiceTest {
    public void checkTestInformation (boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("[INFO]Test " + testName + " has been passed");
        } else System.out.println("[ERROR]Test + " + testName + " has failed. Expected = " + expected
                + " but was actual = " + actual);
    }

    public void checkLoginValid() {
        UserLoginService userLoginService = new UserLoginService();
        User user1 = new User("Ticon", "129357");
        String testName = "Check test Login Attempts";
        boolean expected = true;
        boolean actual = userLoginService.login(user1, "129357");
        checkTestInformation(expected, actual, testName);
    }
    public void checkLoginInValid() {
        UserLoginService userLoginService = new UserLoginService();
        User user1 = new User("Ticondrys", "2020327");
        String testName = "Check test Login Attempts";
        boolean expected = true;
        boolean actual = userLoginService.login(user1, "129357");
        checkTestInformation(expected, actual, testName);
    }
    public void isBlockedTest (User user) {
        user.setCountLoginAttempts(0);
        user.setBlocked(true);
        boolean expected = true;
        boolean actual = user.isBlocked();
        String testName = "Check Is Blocked Test";
        checkTestInformation(expected, actual, testName);
    }

}
