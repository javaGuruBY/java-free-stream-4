public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();
        testRunner.test6();
        testRunner.test7();
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
        String testDescription = "Should return color \"Violet\"";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(390);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test2() {
        String testDescription = "Should return color \"Yellow\"";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(580);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test3() {
        String testDescription = "Should return \"Invisible Light\"";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(1000);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test4() {
        String testDescription = "Should return \"Blue light\"";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(455);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test5() {
        String testDescription = "Should return \"Green Light\"";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(500);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test6() {
        String testDescription = "Should return \"Orange Light\"";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(600);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test7() {
        String testDescription = "Should return \"Red Light\"";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(700);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }
}
