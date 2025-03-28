import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterNewUserTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://auto.pragmatic.bg/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    @AfterMethod
    public void tearDown(){
    driver.quit();
    }

    @Test
    public void testRegisterUser() {
        WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span"));
        myAccount.click();
        WebElement register = driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[1]/a"));
        register.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-firstname")));
        WebElement firstNameInputField = driver.findElement(By.id("input-firstname"));
        firstNameInputField.sendKeys("Nadia");
        WebElement lastNameInputField = driver.findElement(By.id("input-lastname"));
        lastNameInputField.sendKeys("Andonova");
        WebElement emailInputField = driver.findElement(By.id("input-email"));
        emailInputField.sendKeys("Nadia.Andonova@pragmatic.bg");
        WebElement passwordInputField = driver.findElement(By.id("input-password"));
        passwordInputField.sendKeys("password1234");
        WebElement agreeConditions = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/input"));
        agreeConditions.click();
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/button"));
        continueButton.click();
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"common-success\"]/ul/li[3]/a")));
        String successMessageLabel = successMessage.getText();
        Assert.assertEquals(successMessageLabel, "Your Account Has Been Created!");

    }

}




