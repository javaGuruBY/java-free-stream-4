package test;

import bean.User;

public class UserTest {
    public void userTestOnlyCreate() throws Exception{
        User user = new User("user-login", "user-password");

        String expectedResult = "Login: \"user-login\", Password: \"user-password\", Attempts: 3, Is blocked: false";
        String actualResult = user.getInformation();
        checkResults(expectedResult, actualResult, "Test only create object");
    }

    public void userTestDecreaseAttempts() throws Exception{
        User user = new User("user-login", "user-password");

        user.decreaseAttempts();

        String expectedResult = "Login: \"user-login\", Password: \"user-password\", Attempts: 2, Is blocked: false";
        String actualResult = user.getInformation();
        checkResults(expectedResult, actualResult, "Test decrease attempts");
    }

    public void userTestBlockUser() throws Exception{
        User user = new User("user-login", "user-password");

        user.blockUser();

        String expectedResult = "Login: \"user-login\", Password: \"user-password\", Attempts: 3, Is blocked: true";
        String actualResult = user.getInformation();
        checkResults(expectedResult, actualResult, "Test block user");
    }

    public void checkResults(String expectedResult, String actualResult, String testName) throws Exception{
        if (expectedResult.equals(actualResult)){
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception(testName + " has failded!\n Expected result = " + expectedResult
                    + ", but Actual result = " + actualResult);
        }
    }

    public static void main(String[] args) throws Exception{
        UserTest test = new UserTest();

        test.userTestOnlyCreate();
        test.userTestDecreaseAttempts();
        test.userTestBlockUser();
    }
}
