package test;

import service.PhraseAnalyserService;

public class PhraseAnalyserServiceTest {
    public void phraseAnalyserServiceTestWithMakeAndGreatAgain() throws Exception{
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        String text = "Make my homework great again";

        String expectedResult = "It stands no chance";
        String actualResult = phraseAnalyserService.analyse(text);

        checkResults(expectedResult, actualResult, "Test with make and great again");
    }

    public void phraseAnalyserServiceTestWithMake() throws Exception{
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        String text = "Make my homework pls";

        String expectedResult = "It could be worse";
        String actualResult = phraseAnalyserService.analyse(text);

        checkResults(expectedResult, actualResult, "Test with make");
    }

    public void phraseAnalyserServiceTestWithGreatAgain() throws Exception{
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        String text = "My homework great again";

        String expectedResult = "It could be worse";
        String actualResult = phraseAnalyserService.analyse(text);

        checkResults(expectedResult, actualResult, "Test with great again");
    }

    public void phraseAnalyserServiceTestWithOutMakeAndGreatAgain() throws Exception{
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        String text = "My homework";

        String expectedResult = "It is fine, really";
        String actualResult = phraseAnalyserService.analyse(text);

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
        PhraseAnalyserServiceTest phraseAnalyserServiceTest = new PhraseAnalyserServiceTest();

        phraseAnalyserServiceTest.phraseAnalyserServiceTestWithMakeAndGreatAgain();
        phraseAnalyserServiceTest.phraseAnalyserServiceTestWithMake();
        phraseAnalyserServiceTest.phraseAnalyserServiceTestWithGreatAgain();
        phraseAnalyserServiceTest.phraseAnalyserServiceTestWithOutMakeAndGreatAgain();
    }
}
