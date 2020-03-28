public class LightColorDetector {
    public static void main(String[] args) {
        LightColorDetectorServiceTest lightColorDetectorServiceTest = new LightColorDetectorServiceTest();
        lightColorDetectorServiceTest.detectLightColorViolet();
        lightColorDetectorServiceTest.detectLightColorBlue();
        lightColorDetectorServiceTest.detectLightColorGreen();
        lightColorDetectorServiceTest.detectLightColorYellow();
        lightColorDetectorServiceTest.detectLightColorOrange();
        lightColorDetectorServiceTest.detectLightColorRed();
        System.out.println();

        LightColorDetectorService lcs = new LightColorDetectorService();
        System.out.println(lcs.detect(391));
        System.out.println(lcs.detect(477));
        System.out.println(lcs.detect(496));
        System.out.println(lcs.detect(588));
        System.out.println(lcs.detect(600));
        System.out.println(lcs.detect(666));
    }
}
