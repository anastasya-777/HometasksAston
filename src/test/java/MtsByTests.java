import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsByTests {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Открытие страницы
        driver.get("https://www.mts.by");

        // Принятие cookie
        acceptCookiesIfPresent();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private void acceptCookiesIfPresent() {
        try {
            WebElement cookieBanner = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".cookie-banner")));
            WebElement acceptButton = cookieBanner.findElement(By.cssSelector(".accept-button"));
            acceptButton.click();
        } catch (Exception e) {
            System.out.println("Баннер cookie не найден или уже скрыт.");
        }
    }


    @Test
    public void testBlockTitle() {
        // Проверка названия блока
        WebElement blockTitle = driver.findElement(By.cssSelector(".pay__wrapper > h2"));
        assertEquals("Онлайн пополнение без комиссии", blockTitle.getText().replace("\n", " "));
    }

    @Test
    public void testPaymentSystemLogos() {
        // Проверка наличия логотипов платёжных систем
        WebElement visaLogo = driver.findElement(By.cssSelector("img[alt='Visa']"));
        WebElement verifiedByVisaLogo = driver.findElement(By.cssSelector("img[alt='Verified By Visa']"));
        WebElement mastercardLogo = driver.findElement(By.cssSelector("img[alt='MasterCard']"));
        WebElement mastercardSecureCodeLogo = driver.findElement(By.cssSelector("img[alt='MasterCard Secure Code']"));
        WebElement belkartLogo = driver.findElement(By.cssSelector("img[alt='Белкарт']"));

        assertTrue(visaLogo.isDisplayed(), "Логотип Visa должен быть видим");
        assertTrue(verifiedByVisaLogo.isDisplayed(), "Логотип Verified By Visa должен быть видим");
        assertTrue(mastercardLogo.isDisplayed(), "Логотип MasterCard должен быть видим");
        assertTrue(mastercardSecureCodeLogo.isDisplayed(), "Логотип MasterCard Secure Code должен быть видим");
        assertTrue(belkartLogo.isDisplayed(), "Логотип Белкарт должен быть видим");
    }

    @Test
    public void testMoreInfoLink() {
        // Проверка работы ссылки «Подробнее о сервисе»
        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        assertNotNull(moreInfoLink, "Ссылка 'Подробнее о сервисе' должна быть найдена");
        moreInfoLink.click();

    }

    @Test
    public void testContinueButton() {
        // Заполнение полей и проверка кнопки «Продолжить»
        WebElement phoneNumberInput = driver.findElement(By.id("connection-phone"));
        phoneNumberInput.sendKeys("297777777");

        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        sumInput.sendKeys("10");

        WebElement continueButton = driver.findElement(By.cssSelector("#pay-connection .button.button__default"));
        assertNotNull(continueButton, "Кнопка 'Продолжить' должна быть найдена");
        assertTrue(continueButton.isDisplayed(), "Кнопка 'Продолжить' должна быть видимой");
        assertEquals("Продолжить", continueButton.getText(), "Текст кнопки должен быть 'Продолжить'");

        continueButton.click();

       
    }
}
