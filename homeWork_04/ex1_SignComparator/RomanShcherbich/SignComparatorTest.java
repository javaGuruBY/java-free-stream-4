package SignComparator;

import org.junit.Assert;
import org.junit.Test;

public class SignComparatorTest {

  SignComparator signComparator = new SignComparator();

  @Test
  public void PositiveNumberTest() {
    int naturalPositive = 100;
    Assert.assertEquals("Error. Invalid number type returned.",
        signComparator.positiveNumberMessage, signComparator.compare(naturalPositive));
  }

  @Test
  public void ZeroNumberTest() {
    int naturalPositive = 0;
    Assert.assertEquals("Error. Invalid number type returned.",
        signComparator.zeroNumberMessage, signComparator.compare(naturalPositive));
  }

  @Test
  public void NegativeNumberTest() {
    int naturalPositive = -15;
    Assert.assertEquals("Error. Invalid number type returned.",
        signComparator.negativeNumberMessage, signComparator.compare(naturalPositive));
  }
}
