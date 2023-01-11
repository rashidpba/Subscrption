package Stepdefintions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class subscription {
	WebDriver driver = null;

	@Given("I navigate to the subscription page https:\\/\\/subscribe.stctv.com\\/")
	public void i_navigate_to_the_subscription_page_https_subscribe_stctv_com() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://subscribe.stctv.com/sa-en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	}

	@When("I view the subscription packages for  country SA")
	public void i_view_the_subscription_packages_for_country_sa() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String subscription_type_litte = driver.findElement(By.id("name-lite")).getText();
		String subcription_currency_litte = driver.findElement(By.id("currency-lite")).getText();
		String subscription_type_classic = driver.findElement(By.id("name-classic")).getText();
		String subscription_currency_classic = driver.findElement(By.id("currency-classic")).getText();
		String subscription_type_premium = driver.findElement(By.id("name-premium")).getText();
		String subscription_currency_premium = driver.findElement(By.id("currency-premium")).getText();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(subscription_type_litte, "LITE", "Package is liite");
		softAssert.assertEquals(subcription_currency_litte, "Starting from: 15 SAR/month", "currency is sar");
		softAssert.assertEquals(subscription_type_classic, "CLASSIC");
		softAssert.assertEquals(subscription_currency_classic, "Starting from: 25 SAR/month");
		softAssert.assertEquals(subscription_type_premium, "PREMIUM");
		softAssert.assertEquals(subscription_currency_premium, "Starting from: 60 SAR/month");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Then("I should see the correct subscription package type and price for the bahrain")
	public void i_should_see_the_correct_subscription_package_type_and_price_for_the_bahrain() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"country-btn\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"bh-contry-flag\"]")).click();

		String subscription_type_litte = driver.findElement(By.id("name-lite")).getText();
		String subcription_currency_litte = driver.findElement(By.id("currency-lite")).getText();
		String subscription_type_classic = driver.findElement(By.id("name-classic")).getText();
		String subscription_currency_classic = driver.findElement(By.id("currency-classic")).getText();
		String subscription_type_premium = driver.findElement(By.id("name-premium")).getText();
		String subscription_currency_premium = driver.findElement(By.id("currency-premium")).getText();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(subscription_type_litte, "LITE", "Package is liite");
		softAssert.assertEquals(subcription_currency_litte, "2 BHD/month");
		softAssert.assertEquals(subscription_type_classic, "CLASSIC");
		softAssert.assertEquals(subscription_currency_classic, "3 BHD/month");
		softAssert.assertEquals(subscription_type_premium, "PREMIUM");
		softAssert.assertEquals(subscription_currency_premium, "6 BHD/month");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("I should see the correct subscription package type and price for the kuwait")
	public void i_should_see_the_correct_subscription_package_type_and_price_for_the_kuwait() {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.xpath("//*[@id=\"country-btn\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"kw-contry-flag\"]")).click();

		String subscription_type_litte = driver.findElement(By.id("name-lite")).getText();
		String subcription_currency_litte = driver.findElement(By.id("currency-lite")).getText();
		String subscription_type_classic = driver.findElement(By.id("name-classic")).getText();
		String subscription_currency_classic = driver.findElement(By.id("currency-classic")).getText();
		String subscription_type_premium = driver.findElement(By.id("name-premium")).getText();
		String subscription_currency_premium = driver.findElement(By.id("currency-premium")).getText();

		Assert.assertEquals(subscription_type_litte, "LITE", "Package is liite");
		Assert.assertEquals(subcription_currency_litte, "1.2 KWD/month");
		Assert.assertEquals(subscription_type_classic, "CLASSIC");
		Assert.assertEquals(subscription_currency_classic, "2.5 KWD/month");
		Assert.assertEquals(subscription_type_premium, "PREMIUM");
		Assert.assertEquals(subscription_currency_premium, "4.8 KWD/month");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
