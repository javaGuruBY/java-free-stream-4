package PhraseAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class PhraseAnalyserTest {

  PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

  @Test
  public void MakeAndGreatTest() {
    Assert.assertEquals("Error invalid pattern",
        phraseAnalyser.makeAndGreatPattern, phraseAnalyser.analyse("Make one more simple thing to be great again"));
  }

  @Test
  public void MakeOrGreatTest1() {
    Assert.assertEquals("Error invalid pattern",
        phraseAnalyser.makeOrGreatPattern,
        phraseAnalyser.analyse("Make one more simple thing to be cool again"));
  }

  @Test
  public void MakeOrGreatTest2() {
    Assert.assertEquals("Error invalid pattern",
        phraseAnalyser.makeOrGreatPattern,
        phraseAnalyser.analyse("Don't make one more simple thing to be great again"));
  }

  @Test
  public void AnotherPatternTest() {
    Assert.assertEquals("Error invalid pattern",
        phraseAnalyser.otherPatterns,
        phraseAnalyser.analyse("Don't make one more simple thing to be cool again"));
  }

  @Test
  public void EmptyStringTest() {
    Assert.assertEquals("Error invalid pattern",
        phraseAnalyser.otherPatterns,
        phraseAnalyser.analyse(""));
  }
}
