package PhraseAnalyser;

public class PhraseAnalyser {

  public String makeAndGreatPattern = "It stands no chance";
  public String makeOrGreatPattern = "It could be worse";
  public String otherPatterns = "It is fine, really";

  private String startString = "Make";
  private String endString = "great again";

  public String analyse(String text) {
    if(text.startsWith(startString)&&text.endsWith(endString)) {
      return makeAndGreatPattern;
    } else if (text.startsWith(startString)||text.endsWith(endString)) {
      return  makeOrGreatPattern;
    }
    return otherPatterns;
  }
}
