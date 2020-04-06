public class PhraseAnalyser {
    public static void main(String[] args) {
        PhraseAnalyserTest phraseAnalyserTest = new PhraseAnalyserTest();
        phraseAnalyserTest.analyserTestInTheFirstCase();
        phraseAnalyserTest.analyserTestInTheSecondCase();
        phraseAnalyserTest.analyserTestInTheThirdCase();
        System.out.println();

        PhraseAnalyserService pa = new PhraseAnalyserService();
        System.out.println(pa.analyse("Make me happy great again"));
        System.out.println(pa.analyse("Make me happy again"));
        System.out.println(pa.analyse("I am happy"));
    }
}
