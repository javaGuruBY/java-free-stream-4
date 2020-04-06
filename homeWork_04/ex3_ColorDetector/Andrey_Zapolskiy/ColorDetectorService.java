public class ColorDetectorService {
    String violetColor = "Violet";
    String blueColor = "Blue";
    String greenColor = "Green";
    String yellowColor = "Yellow";
    String orangeColor = "Orange";
    String redColor = "Red";

    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) return violetColor;
        else if (wavelength >= 450 && wavelength <= 494) return blueColor;
        else if (wavelength >= 495 && wavelength <= 569) return greenColor;
        else if (wavelength >= 570 && wavelength <= 589) return yellowColor;
        else if (wavelength >= 590 && wavelength <= 619) return orangeColor;
        else if (wavelength >= 620 && wavelength <= 750) return redColor;
        return "";
    }
}