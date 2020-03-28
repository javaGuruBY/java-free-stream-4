public class SignComparatorTest {
    private SingComparatorService scs = new SingComparatorService();
    public void compareTestPositiveNumber () {
        System.out.println("Initializing test 1 - checking a number for a positive value");
        int numPositive = 5;
        String expectedBehaviourForPositiveNumber5 = "number is positive";
        String actualResult = scs.compare(numPositive);
        System.out.print("Test 1 = ");
        System.out.println(expectedBehaviourForPositiveNumber5 == actualResult);
    }
    public void compareTestNegativeNumber () {
        System.out.println("Initializing test 2 - checking a number for a negative value");
        int numNegative = -200;
        String expectedBehaviourForNegativeNumber200 = "number is negative";
        String actualResult = scs.compare(numNegative);
        System.out.print("Test 2 = ");
        System.out.println(expectedBehaviourForNegativeNumber200 == actualResult);
    }
    public void compareTestEqualZeroNumber () {
        System.out.println("Initializing test 3 - checking a number for a zero value");
        int numZero = 0;
        String expectedBehaviourForZeroNumber0 = "Number is equal to zero";
        String actualResult = scs.compare(numZero);
        System.out.print("Test 3 = ");
        System.out.println(expectedBehaviourForZeroNumber0 == actualResult);
    }
}
