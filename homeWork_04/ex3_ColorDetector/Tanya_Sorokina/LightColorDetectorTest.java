public class LightColorDetectorTest {

    public static void lightColorDetectorVioletTest() throws Exception {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 447;

        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(waveLength);
        check(expectedResult, actualResult, "Test with violet light");
    }

    public static void lightColorDetectorBlueTest() throws Exception {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 487;

        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(waveLength);
        check (expectedResult, actualResult, "Test with blue light");
    }

    public static void lightColorDetectorGreenTest() throws Exception {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 500;

        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(waveLength);
        check (expectedResult, actualResult, "Test with green light");
    }

    public static void lightColorDetectorYellowTest() throws Exception {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 570;

        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(waveLength);
        check (expectedResult, actualResult, "Test with yellow light");
    }

    public static void lightColorDetectorOrangeTest() throws Exception {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 600;

        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(waveLength);
        check (expectedResult, actualResult, "Test with Orange light");
    }

    public static void lightColorDetectorRedTest() throws Exception {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 700;

        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(waveLength);
        check (expectedResult, actualResult, "Test with Red light");
    }

    public static void lightColorDetectorInvisibleLightTest() throws Exception {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 0;

        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(waveLength);
        check (expectedResult, actualResult,"Test with Invisible Light light");
    }

    public static void check(String expectedResult, String actualResult, String testName) throws Exception {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception(testName + " has failed! \n Expected result = " +
                    expectedResult + ", but Actual result = " + actualResult);
        }
    }

    public static void main(String[] args) throws Exception {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        LightColorDetectorTest.lightColorDetectorVioletTest();
        LightColorDetectorTest.lightColorDetectorBlueTest();
        LightColorDetectorTest.lightColorDetectorGreenTest();
        LightColorDetectorTest.lightColorDetectorYellowTest();
        LightColorDetectorTest.lightColorDetectorOrangeTest();
        LightColorDetectorTest.lightColorDetectorRedTest();
        LightColorDetectorTest.lightColorDetectorInvisibleLightTest();
    }


}
