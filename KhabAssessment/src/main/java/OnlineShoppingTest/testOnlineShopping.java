package OnlineShoppingTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testOnlineShopping {
   private WebDriver driver;

        @Before
        public void setup() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\desktop\\KhabAssessment\\src\\main\\java\\Driver\\chromedriver.exe");

        }

         @Test

        public void testOnlineShopping() throws InterruptedException {

        System.out.println("Attempting to navigate the URL");
             ChromeOptions chromeOptions = new ChromeOptions();
             chromeOptions.addArguments("--remote-allow-origins=*");
             ChromeDriver driver = new ChromeDriver(chromeOptions);

             String username = "CANDIDATE_003";
             String password = "qa_assessment";
             String url = "https://"+username+":"+password+"@master.d2thsy9okxnekb.amplifyapp.com/product";

             driver.get(url);

             Thread.sleep(3000);


        System.out.println("Attempting to search for fruits");

             WebElement fruitInput = driver.findElement(By.name("search"));
             fruitInput.sendKeys("fruit");
             Thread.sleep(3000);
             fruitInput.clear();
        System.out.println("Attempting to search for cereals");
             WebElement cerealInput= driver.findElement(By.name("search"));
             cerealInput.sendKeys("cereal");

             Thread.sleep(3000);

        System.out.println("Attempting to navigate on a page for specials");
             WebElement clickSpecialsButton = driver.findElement(By.xpath("//a[@href='/specials']"));
             clickSpecialsButton.click();
             Thread.sleep(3000);
             driver.navigate().back();
             Thread.sleep(3000);

        System.out.println("Attempting to navigate on a page for contact details");
             WebElement clickContactButton = driver.findElement(By.xpath("//a[@href='/contactUs']"));
             clickContactButton.click();
             driver.navigate().back();
             Thread.sleep(3000);

        System.out.println("Attempting to add cornflakes on the cart ");
             WebElement clickAddCornflakes = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
             clickAddCornflakes.click();

             Thread.sleep(3000);
        System.out.println("Attempting to click cart button to add cornflakes on it");
             WebElement clickCartCornflakes = driver.findElement(By.xpath("(//button[contains(.,'ADD TO CART')])[1]"));
             clickCartCornflakes.click();
             Thread.sleep(3000);
        System.out.println("Attempting to add grapes on the cart");
             WebElement clickAddGrapes = driver.findElement(By.xpath("(//button[contains(.,'+')])[5]"));
             clickAddGrapes.click();

             Thread.sleep(3000);
        System.out.println("Attempting to click a cart button to add grapes on the cart");
             WebElement clickCartGrapesButton = driver.findElement(By.xpath("/html/body/app-root/div/app-product/div[2]/div/div/div[5]/table/tbody/tr/td[2]/div/div[4]/button"));
             clickCartGrapesButton.click();

             Thread.sleep(3000);
        System.out.println("Attempting to navigate on cart page");
             WebElement clickCart = driver.findElement(By.xpath("//div[@class='col-3'][contains(.,'0')]"));
             clickCart.click();

             Thread.sleep(3000);

             driver.navigate().back();
        System.out.println("Attempting to click on continue shopping button");
             WebElement clickContinueShoppingBtn = driver.findElement(By.xpath("//button[text()= 'CONTINUE SHOPPING']"));
             clickContinueShoppingBtn.click();

             Thread.sleep(3000);

        }

        @After
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }

        }
    }

