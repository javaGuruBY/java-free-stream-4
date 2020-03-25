package test;

import service.LightColorDetectorService;

public class LightColorDetectorServiceTest {
    public void LightColorDetectorServiceTestWithVioletLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 400;

        String expectedResult = "Violet";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with violet light");
    }

    public void LightColorDetectorServiceTestWithBlueLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 451;

        String expectedResult = "Blue";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with blue light");
    }

    public void LightColorDetectorServiceTestWithGreenLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 560;

        String expectedResult = "Green";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with green light");
    }

    public void LightColorDetectorServiceTestWithYellowLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 580;

        String expectedResult = "Yellow";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with yellow light");
    }

    public void LightColorDetectorServiceTestWithOrangeLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 592;

        String expectedResult = "Orange";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with orange light");
    }

    public void LightColorDetectorServiceTestWithRedLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 750;

        String expectedResult = "Red";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with red light");
    }

    public void LightColorDetectorServiceTestWithInvisibleLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 0;

        String expectedResult = "Invisible Light";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with invisible light");
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
        LightColorDetectorServiceTest lightColorDetectorServiceTest = new LightColorDetectorServiceTest();

        lightColorDetectorServiceTest.LightColorDetectorServiceTestWithVioletLight();
        lightColorDetectorServiceTest.LightColorDetectorServiceTestWithBlueLight();
        lightColorDetectorServiceTest.LightColorDetectorServiceTestWithGreenLight();
        lightColorDetectorServiceTest.LightColorDetectorServiceTestWithYellowLight();
        lightColorDetectorServiceTest.LightColorDetectorServiceTestWithOrangeLight();
        lightColorDetectorServiceTest.LightColorDetectorServiceTestWithRedLight();
        lightColorDetectorServiceTest.LightColorDetectorServiceTestWithInvisibleLight();


    }
}
