package test;

import service.SignComparatorService;

public class SignComparatorTest {
    public void signComparatorNegativeTest() throws Exception {
        SignComparatorService signComparator = new SignComparatorService();

        int number = -1;
        String expectedResult = "Number is negative";
        String actualResult = signComparator.compare(number);

        check(expectedResult, actualResult, "Negative test");
    }

    public void signComparatorPositiveTest() throws Exception {
        SignComparatorService signComparator = new SignComparatorService();

        int number = 5;
        String expectedResult = "Number is positive";
        String actualResult = signComparator.compare(number);

        check(expectedResult, actualResult, "Positive test");
    }

    public void signComparatorZeroTest() throws Exception {
        SignComparatorService signComparator = new SignComparatorService();

        int number = 0;
        String expectedResult = "Number is equal to zero";
        String actualResult = signComparator.compare(number);

        check(expectedResult, actualResult, "Zero test");
    }

    public void check(String expectedResult, String actualResult, String testName) throws Exception {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception(testName + " has failed! \n Expected result = " +
                    expectedResult + ", but Actual result = " + actualResult);
        }
    }

    public static void main(String[] args) throws Exception {
        SignComparatorTest signComparatorTest = new SignComparatorTest();

        signComparatorTest.signComparatorNegativeTest();
        signComparatorTest.signComparatorPositiveTest();
        signComparatorTest.signComparatorZeroTest();
    }
}
