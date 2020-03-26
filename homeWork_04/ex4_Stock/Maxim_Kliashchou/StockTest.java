public class StockTest {
    public void stockTestOnlyCreate() throws Exception{
        Stock stock = new Stock("Google", 10);

        String expectedResult = "Company = \"Google\", Current Price = 10.0, Min Price = 10.0, Max Price = 10.0";
        String actualResult = stock.printInformationTest();

        checkResults(expectedResult, actualResult, "Test only create object");
    }

    public void stockTestChangeMaximalPrice() throws Exception{
        Stock stock = new Stock("Google", 10);

        stock.updatePrice(20);

        String expectedResult = "Company = \"Google\", Current Price = 20.0, Min Price = 10.0, Max Price = 20.0";
        String actualResult = stock.printInformationTest();

        checkResults(expectedResult, actualResult, "Test change maximal price");
    }

    public void stockTestChangeMinimalPrice() throws Exception{
        Stock stock = new Stock("Google", 10);

        stock.updatePrice(5);

        String expectedResult = "Company = \"Google\", Current Price = 5.0, Min Price = 5.0, Max Price = 10.0";
        String actualResult = stock.printInformationTest();

        checkResults(expectedResult, actualResult, "Test change minimal price");
    }

    public void stockTestChangeMinimalAndMaximalPrice() throws Exception{
        Stock stock = new Stock("Google", 10);

        stock.updatePrice(5);
        stock.updatePrice(20);

        String expectedResult = "Company = \"Google\", Current Price = 20.0, Min Price = 5.0, Max Price = 20.0";
        String actualResult = stock.printInformationTest();

        checkResults(expectedResult, actualResult, "Test change minimal and maximal price");
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
        StockTest stockTest = new StockTest();

        stockTest.stockTestOnlyCreate();
        stockTest.stockTestChangeMaximalPrice();
        stockTest.stockTestChangeMinimalPrice();
        stockTest.stockTestChangeMinimalAndMaximalPrice();
    }
}
