public class SignComparator {
    public static void main(String[] args) {
    SignComparatorTest scTest = new SignComparatorTest();
    scTest.compareTestPositiveNumber();
    scTest.compareTestNegativeNumber();
    scTest.compareTestEqualZeroNumber();

    SingComparatorService sC = new SingComparatorService();
    System.out.println(sC.compare(20));
    System.out.println(sC.compare(-200));
    System.out.println(sC.compare(0));
    }
}
