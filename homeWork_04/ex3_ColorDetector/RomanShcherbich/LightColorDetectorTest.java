package ColorDetector;

import org.junit.Assert;
import org.junit.Test;

public class LightColorDetectorTest {

  public LightColorDetector lightColorDetector = new LightColorDetector();

  @Test
  public void VioletTest() {
    Assert.assertEquals("Error invalid color value",
        "Violet",
        lightColorDetector.detect(380));
  }

  @Test
  public void BlueTest() {
    Assert.assertEquals("Error invalid color value",
        "Blue",
        lightColorDetector.detect(455));
  }

  @Test
  public void GreenTest() {
    Assert.assertEquals("Error invalid color value",
        "Green",
        lightColorDetector.detect(569));
  }

  @Test
  public void YellowTest() {
    Assert.assertEquals("Error invalid color value",
        "Yellow",
        lightColorDetector.detect(580));
  }

  @Test
  public void OrangeTest() {
    Assert.assertEquals("Error invalid color value",
        "Orange",
        lightColorDetector.detect(610));
  }

  @Test
  public void RedTest() {
    Assert.assertEquals("Error invalid color value",
        "Red",
        lightColorDetector.detect(740));
  }

  @Test
  public void InvisibleLightTest() {
    Assert.assertEquals("Error invalid color value",
        "Invisible Light",
        lightColorDetector.detect(1));
  }
}
