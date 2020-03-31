package by.jrr.stream4demo.test;

import by.jrr.stream4demo.bean.User;
import by.jrr.stream4demo.service.UserService;

public class UserServiceTest {
    UserService userService = new UserService();
    boolean expected = false;
    boolean actual = false;


    public void isUserUnder18Test() {

        User user = new User("Petr", 16);
        expected = true;
        actual = userService.isUserUnder18(user);
        assertEqual(expected, actual, "isUserUnder18Test should return true");

        User user2 = new User("Petr", 20);
        expected = false;
        actual = userService.isUserUnder18(user2);
        assertEqual(expected, actual, "isUserUnder18Test should return false");
    }

    private void assertEqual(boolean expected, boolean actual, String testname){
        boolean result =  expected == actual;
        if (result) {

            System.out.println(testname + " expected == actual = " + result) ;
        } else {
            System.out.println(testname + " failed! expected " + expected + ", but  actual = " + actual) ;
        }
    }
}
