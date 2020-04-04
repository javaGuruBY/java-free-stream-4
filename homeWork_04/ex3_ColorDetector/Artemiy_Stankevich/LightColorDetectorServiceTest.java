public class LightColorDetectorServiceTest {
    private LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

    public void detectLightColorViolet () {
        System.out.println("Initializing test light color detected for a violet color");
        int waveLength = 381;
        String expectedBehaviour = "Violet";
        String actionResult = lightColorDetectorService.detect(waveLength);
        System.out.print("Test 1 = ");
        System.out.println(expectedBehaviour == actionResult);
    }
    public void detectLightColorBlue () {
        System.out.println("Initializing test light color detected for a blue color");
        int waveLength = 470;
        String expectedBehaviour = "Blue";
        String actionResult = lightColorDetectorService.detect(waveLength);
        System.out.print("Test 2 = ");
        System.out.println(expectedBehaviour == actionResult);
    }
    public void detectLightColorGreen () {
        System.out.println("Initializing test light color detected for a green color");
        int waveLength = 525;
        String expectedBehaviour = "Green";
        String actionResult = lightColorDetectorService.detect(waveLength);
        System.out.print("Test 3 = ");
        System.out.println(expectedBehaviour == actionResult);
    }
    public void detectLightColorYellow () {
        System.out.println("Initializing test light color detected for a yellow color");
        int waveLength = 588;
        String expectedBehaviour = "Yellow";
        String actionResult = lightColorDetectorService.detect(waveLength);
        System.out.print("Test 4 = ");
        System.out.println(expectedBehaviour == actionResult);
    }
    public void detectLightColorOrange () {
        System.out.println("Initializing test light color detected for a orange color");
        int waveLength = 616;
        String expectedBehaviour = "Orange";
        String actionResult = lightColorDetectorService.detect(waveLength);
        System.out.print("Test 5 = ");
        System.out.println(expectedBehaviour == actionResult);
    }
    public void detectLightColorRed () {
        System.out.println("Initializing test light color detected for a red color");
        int waveLength = 666;
        String expectedBehaviour = "Red";
        String actionResult = lightColorDetectorService.detect(waveLength);
        System.out.print("Test 6 = ");
        System.out.println(expectedBehaviour == actionResult);
    }
}
