public class UserTest {
    public static void main(String[] args) {
        UserTest victim = new UserTest();
        victim.notTheSameLoginAndPassword();
        victim.correctInputForLogin();
        victim.correctInputForPassword();
        victim.loginAndPasswordWasNotEntered();


    }
    public void notTheSameLoginAndPassword(){
        String testDescription = "Compare login and password to see if they were not the same";

        User victim1 = new User("qwerty", "123456");
        boolean expectedResult = false;
        boolean actualResult = (victim1.getUser()).equals(victim1.getPassword());
        checkThatEqual(expectedResult, actualResult, testDescription);


    }
    public void correctInputForLogin(){
        String testDescription = "if login was not entered";

        User victim1 = new User("", "123456");
        boolean expectedResult = false;
        boolean actualResult = (victim1.getUser()).equals(victim1.getPassword());
        checkThatEqual(expectedResult, actualResult, testDescription);


    }
    public void correctInputForPassword(){
        String testDescription = "if password was not entered";

        User victim1 = new User("qwerty", "");
        boolean expectedResult = false;
        boolean actualResult = (victim1.getUser()).equals(victim1.getPassword());
        checkThatEqual(expectedResult, actualResult, testDescription);


    }
    public void loginAndPasswordWasNotEntered(){
        String testDescription = "if login and password was not entered";

        User victim1 = new User("", "");
        boolean expectedResult = true;
        boolean actualResult = (victim1.getUser()).equals(victim1.getPassword());
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
