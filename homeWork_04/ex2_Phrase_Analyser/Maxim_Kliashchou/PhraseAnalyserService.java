package service;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class PhraseAnalyserService {
    public String analyse(String text){
        StringTokenizer stringTokenizer = new StringTokenizer(text);
        ArrayList<String> wordList = new ArrayList<>();

        while (stringTokenizer.hasMoreTokens()){
            wordList.add(stringTokenizer.nextToken());
        }

        int wordCount = wordList.size();

        if (wordList.get(0).equals("Make") && wordList.get(wordCount - 2).equals("great")
                && wordList.get(wordCount - 1).equals("again")){
            return "It stands no chance";
        } else if (wordList.get(0).equals("Make") || (wordList.get(wordCount - 2).equals("great")
                && wordList.get(wordCount - 1).equals("again"))){
            return "It could be worse";
        }
        return "It is fine, really";
    }
}
