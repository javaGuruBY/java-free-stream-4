public class PhraseAnalyserTest {
    public void makeAndGreatAgainModelTest() throws Exception{
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String text = "Make America great again";

        String expectedResult = "It stands no chance";
        String actualResult = phraseAnalyser.analyse(text);

        checkResults(expectedResult, actualResult, "Test with make and great again");
    }

    public void makeOrGreatAgainModelTest1() throws Exception{
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String text = "Make America great cool";

        String expectedResult = "It could be worse";
        String actualResult = phraseAnalyser.analyse(text);

        checkResults(expectedResult, actualResult, "Test with make");
    }

    public void makeOrGreatAgainModelTest2() throws Exception{
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String text = "Let's make America great again";

        String expectedResult = "It could be worse";
        String actualResult = phraseAnalyser.analyse(text);

        checkResults(expectedResult, actualResult, "Test with great again");
    }

    public void otherModelTest() throws Exception{
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String text = "American people";

        String expectedResult = "It is fine, really";
        String actualResult = phraseAnalyser.analyse(text);

        checkResults(expectedResult, actualResult, "Test without make and great again");
    }

    public void checkResults(String expectedResult, String actualResult, String testName) throws Exception{
        if (expectedResult.equals(actualResult)){
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception(testName + " has failded!\n Expected result = " + expectedResult
                    + ", but Actual result = " + actualResult);
        }
    }

    public static void main(String[] args) throws Exception{
        PhraseAnalyserTest phraseAnalyserServiceTest = new PhraseAnalyserTest();

        phraseAnalyserServiceTest.makeAndGreatAgainModelTest();
        phraseAnalyserServiceTest.makeOrGreatAgainModelTest1();
        phraseAnalyserServiceTest.makeOrGreatAgainModelTest1();
        phraseAnalyserServiceTest.otherModelTest();
    }
}
