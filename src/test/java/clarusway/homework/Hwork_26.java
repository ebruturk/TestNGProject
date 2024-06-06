package clarusway.homework;

import clarusway.utilitius.DataProviderUtils;
import clarusway.utilitius.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Hwork_26 extends TestBase {
    //Create 5 users by using Data Provider on https://thinking-tester-contact-list.herokuapp.com/addUser

// adresindeki Veri Sağlayıcıyı kullanarak 5 kullanıcı oluşturun}

    @Test(dataProvider = "usernamePasswordFaker2", dataProviderClass = DataProviderUtils.class)
    void Test01(String firstName, String LastName, String email, String password) throws InterruptedException{
        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");

        driver.findElement(By.id("signup")).click();

        driver.findElement(By.id("firstName")).sendKeys(firstName);
       // driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
        String logout = driver.findElement(By.id("logout")).getText();
        Thread.sleep(2000);
//        assertEquals("Logout", logout);

    }

    }



