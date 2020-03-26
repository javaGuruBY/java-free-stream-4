package test;

import service.LightColorDetectorService;

public class LightColorDetectorServiceTest {
    public void lightColorDetectorServiceTestWithVioletLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 400;

        String expectedResult = "Violet";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with violet light");
    }

    public void lightColorDetectorServiceTestWithBlueLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 451;

        String expectedResult = "Blue";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with blue light");
    }

    public void lightColorDetectorServiceTestWithGreenLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 560;

        String expectedResult = "Green";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with green light");
    }

    public void lightColorDetectorServiceTestWithYellowLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 580;

        String expectedResult = "Yellow";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with yellow light");
    }

    public void lightColorDetectorServiceTestWithOrangeLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 592;

        String expectedResult = "Orange";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with orange light");
    }

    public void lightColorDetectorServiceTestWithRedLight() throws Exception{
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        int waveLength = 750;

        String expectedResult = "Red";
        String actualResulat = lightColorDetectorService.detect(waveLength);
        checkResults(expectedResult, actualResulat, "Test with red light");
    }

    public void lightColorDetectorServiceTestWithInvisibleLight() throws Exception{
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

        lightColorDetectorServiceTest.lightColorDetectorServiceTestWithVioletLight();
        lightColorDetectorServiceTest.lightColorDetectorServiceTestWithBlueLight();
        lightColorDetectorServiceTest.lightColorDetectorServiceTestWithGreenLight();
        lightColorDetectorServiceTest.lightColorDetectorServiceTestWithYellowLight();
        lightColorDetectorServiceTest.lightColorDetectorServiceTestWithOrangeLight();
        lightColorDetectorServiceTest.lightColorDetectorServiceTestWithRedLight();
        lightColorDetectorServiceTest.lightColorDetectorServiceTestWithInvisibleLight();


    }
}
