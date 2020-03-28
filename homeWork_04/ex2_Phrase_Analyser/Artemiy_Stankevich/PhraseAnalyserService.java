import java.util.Arrays;

public class PhraseAnalyserService {
    String phraseOne = "It stands no chance";
    String phraseTwo = "It could be worse";
    String phraseNoOne = "It is fine, really";

    public String analyse(String text) {
        String [] arraysString = text.split(" ");
        Arrays.toString(arraysString);
        if (arraysString[0].equals("Make") && arraysString[arraysString.length-2].equals("great") &&
                arraysString[arraysString.length-1].equals("again")) return phraseOne;
        else if (arraysString[0].equals("Make") || arraysString[arraysString.length-2].equals("great") &&
                arraysString[arraysString.length-1].equals("again")) return phraseTwo;
        else return phraseNoOne;
    }
}
