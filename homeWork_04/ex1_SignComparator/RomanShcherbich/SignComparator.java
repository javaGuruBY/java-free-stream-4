package SignComparator;

public class SignComparator {

  public String positiveNumberMessage = "Number is positive";
  public String zeroNumberMessage = "Number is equal to zero";
  public String negativeNumberMessage = "Number is negative";

  public String compare(int number) {
    String result = positiveNumberMessage;
    if (number == 0) {
      result = zeroNumberMessage;
    } else if (number <= 0) {
      result = negativeNumberMessage;
    }
    return result;
  }
}
