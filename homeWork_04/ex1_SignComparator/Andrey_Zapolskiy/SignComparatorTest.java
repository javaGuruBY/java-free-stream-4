public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparatorTest test1 = new SignComparatorTest();
        test1.numberIsPositive();
        test1.numberIsNegative();
        test1.numberIsEqualToZero();

    }
    public  void numberIsPositive() {
        SignComparator victim = new SignComparator();
        int number = 4;
        String expectedResult = "Number is positive";
        String actualResult = victim.compare(number);
        check(actualResult, expectedResult, "test1");
    }
    public  void numberIsNegative() {
        SignComparator victim = new SignComparator();
        int number = -2;
        String expectedResult = "Number is negative";
        String actualResult = victim.compare(number);
        check(actualResult, expectedResult, "test1");
    }
    public  void numberIsEqualToZero() {
        SignComparator victim = new SignComparator();
        int number = 0;
        String expectedResult = "Number is equal to 0";
        String actualResult = victim.compare(number);
        check(actualResult, expectedResult, "test1");
    }
    public void check(String actualResult, String expectedResult, String NameTest) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(NameTest + " has passed!");
        } else {
            System.out.println(NameTest + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
