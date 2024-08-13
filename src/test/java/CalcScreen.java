import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CalcScreen {


    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnAdd;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSub;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMul;
    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id = "com.google.android.calculator:id/del")
    WebElement btnClr;
    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;

    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Test
    public int calcuateSeries(String series) {
        for (int i = 0; i < series.length(); i++) {
            if (series.charAt(i) == '+') {
                btnAdd.click();
            } else if (series.charAt(i) == '-') {
                btnSub.click();
            } else if (series.charAt(i) == '*') {
                btnMul.click();
            } else if (series.charAt(i) == '/') {
                btnDiv.click();
            } else {
                int num;
                char ch = series.charAt(i);
                num = Character.getNumericValue(ch);
                driver.findElement(By.id("com.google.android.calculator:id/digit_" + num)).click();
            }
        }
        btnEqual.click();
        int res = Integer.parseInt(txtResult.getText());
        return res;

    }

    @AfterTest
    public void clearScreen() {
        CalcScreen calcScreen = new CalcScreen(driver);
        calcScreen.btnClr.click();
    }
}
