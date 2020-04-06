public class PhraseAnalyser {

    //"It stands no chance", если строка начинается со слов "Make" и заканчивается на "great again";
    // "It could be worse", если строка начинается со слов "Make" или заканчивается на "great again";
    // "It is fine, really", если строка не подходит под критерии выше;

    public String makeAndGreatAgainModel = "It stands no chance";
    public String makeOrGreatAgainModel = "It could be worse";
    public String otherModel = "It is fine, really";

    private String startString = "Make";
    private String endString = "great again";



    public String analyse(String text) {
        //TODO
        if(text.startsWith(startString)&&text.endsWith(endString)) {
            return makeAndGreatAgainModel;
        } else if (text.startsWith(startString)||text.endsWith(endString)) {
            return  makeOrGreatAgainModel;}
        else
        return otherModel;
    }

}
