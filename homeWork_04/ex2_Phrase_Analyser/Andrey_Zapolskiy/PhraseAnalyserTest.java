public class PhraseAnalyserTest {
    private PhraseAnalyserService phraseAnalyserServiceTest = new PhraseAnalyserService();

    public void analyserTestInTheFirstCase () {
        System.out.println("Initializing test on the phrase analysis in the first case");
        String onePhrase = "Make me happy great again";
        String expectedBehaviour = "It stands no chance";
        String actualResult = phraseAnalyserServiceTest.analyse(onePhrase);
        System.out.print("Test 1 = ");
        System.out.println((expectedBehaviour).equals(actualResult));
    }
    public void analyserTestInTheSecondCase () {
        System.out.println("Initializing test on the phrase analysis in the second case");
        String onePhrase = "Make me happy";
        String expectedBehaviour = "It could be worse";
        String actualResult = phraseAnalyserServiceTest.analyse(onePhrase);
        System.out.print("Test 2 = ");
        System.out.println((expectedBehaviour).equals(actualResult));
    }
    public void analyserTestInTheThirdCase () {
        System.out.println("Initializing test on the phrase analysis in the third case");
        String onePhrase = "I am happy";
        String expectedBehaviour = "It is fine, really";
        String actualResult = phraseAnalyserServiceTest.analyse(onePhrase);
        System.out.print("Test 3 = ");
        System.out.println((expectedBehaviour).equals(actualResult));
    }
}
