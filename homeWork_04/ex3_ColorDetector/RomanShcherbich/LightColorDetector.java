package ColorDetector;

import java.util.HashMap;

public class LightColorDetector {

  public String detect(int wavelength) {

    if (wavelength <= 0) {
      return "ERROR please put natural numerical value";
    }

    int[] matchedRange = colors.keySet().stream()
        .filter(range -> (range[0] <= wavelength && range[1] >= wavelength))
        .findAny()
        .orElse(invisible);

    String color = colors.get(matchedRange);
    return color;
  }

  public HashMap<int[], String> colors = new HashMap<>();
  public int[] invisible = new int[]{-1, -1};

  public LightColorDetector() {
    colors.put(new int[]{380, 449}, "Violet");
    colors.put(new int[]{450, 494}, "Blue");
    colors.put(new int[]{495, 569}, "Green");
    colors.put(new int[]{570, 589}, "Yellow");
    colors.put(new int[]{590, 619}, "Orange");
    colors.put(new int[]{620, 750}, "Red");
    colors.put(invisible, "Invisible Light");
  }
}
