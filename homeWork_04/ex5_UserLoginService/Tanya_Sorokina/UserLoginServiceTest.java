public class UserLoginServiceTest {
    public void userServiceTestCorrectPassword() throws Exception {
        UserLoginService service = new UserLoginService();

        User user = new User("login", "password");

        Boolean expectedResult = true;
        Boolean actualResult = service.login(user, "password");
        checkResults(expectedResult, actualResult, "Test correct password");
    }

    public void userServiceTestIncorrectPassword() throws Exception {
        UserLoginService service = new UserLoginService();

        User user = new User("login", "password");

        Boolean expectedResult = false;
        Boolean actualResult = service.login(user, "password");
        checkResults(expectedResult, actualResult, "Test incorrect password");
    }

    public void userServiceTestCorrectPasswordAfterBlock() throws Exception {
        UserLoginService service = new UserLoginService();

        User user = new User("User", "password");

        service.login(user, "password1");
        service.login(user, "password2");
        service.login(user, "password3");

        Boolean expectedResult = false;
        Boolean actualResult = service.login(user, "password");
        checkResults(expectedResult, actualResult, "Test correct password after block");
    }

    public void userServiceTestIncorrectPasswordAfterBlock() throws Exception {
        UserLoginService service = new UserLoginService();

        User user = new User("login", "password");

        service.login(user, "password1");
        service.login(user, "password2");
        service.login(user, "password3");

        Boolean expectedResult = false;
        Boolean actualResult = service.login(user, "password");
        checkResults(expectedResult, actualResult, "Test incorrect password after block");
    }

    public void userServiceTestCorrectPasswordAfterIncorrect() throws Exception {
        UserLoginService service = new UserLoginService();

        User user = new User("login", "password");

        service.login(user, "password1");

        Boolean expectedResult = true;
        Boolean actualResult = service.login(user, "password");
        checkResults(expectedResult, actualResult, "Test correct password after incorrect");
    }

    public void checkResults(Boolean expectedResult, Boolean actualResult, String testName) throws Exception {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception(testName + " has failded!\n Expected result = " + expectedResult
                    + ", but Actual result = " + actualResult);
        }
    }

    public static void main(String[] args) throws Exception {
        UserLoginServiceTest test = new UserLoginServiceTest();

        test.userServiceTestCorrectPassword();
        test.userServiceTestIncorrectPassword();
        test.userServiceTestCorrectPasswordAfterBlock();
        test.userServiceTestIncorrectPasswordAfterBlock();
        test.userServiceTestCorrectPasswordAfterIncorrect();
    }

}
