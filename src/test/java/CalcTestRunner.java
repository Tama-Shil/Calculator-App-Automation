import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup {

    @Test(priority = 1, description = "", dataProvider = "TestData", dataProviderClass = TestDataset.class)

    public void doSeries(String series, int resultExpected) {
        CalcScreen calcScreen = new CalcScreen(driver);
        int resultActal = calcScreen.calcuateSeries(series);
        Assert.assertEquals(resultActal, resultExpected);
    }

}
