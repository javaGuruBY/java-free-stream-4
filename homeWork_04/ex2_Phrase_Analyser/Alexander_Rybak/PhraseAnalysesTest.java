public class PhraseAnalysesTest {
    public static void main(String[] args) {
        PhraseAnalysesTest testRunner = new PhraseAnalysesTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    public void checkThatEqual(String expected, String actual, String testDescription) {
        if (expected.equals(actual)) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("expected \"" + expected + "\", but was \"" + actual + "\"");
        }
    }

    public void test1() {
        String testDescription = "Should return a complete match";

        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String expectedResult = "It stands no chance";
        String actualResult = phraseAnalyser.analyse("Make wet fddfg dsfg great again");

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test2() {
        String testDescription = "Should return a partial match";

        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String expectedResult = "It could be worse";
        String actualResult = phraseAnalyser.analyse("Make wet fddfg dsfg great again great");

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test3() {
        String testDescription = "Should return a complete mismatch";

        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String expectedResult = "It is fine, really";
        String actualResult = phraseAnalyser.analyse("Alrew Make wet fddfg dsfg great again werfdsf");

        checkThatEqual(expectedResult, actualResult, testDescription);
    }
}
