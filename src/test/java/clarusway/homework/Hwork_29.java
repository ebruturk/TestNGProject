package clarusway.homework;

import clarusway.utilitius.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hwork_29 extends TestBase {
    /*
Go to https://testpages.eviltester.com/styled/dynamic-buttons-simple.html
Click buttons to see message 'All Buttons Clicked!
Use Allure reports and listeners
https://testpages.eviltester.com/styled/dynamic-buttons-simple.html adresine gidin.
'Tüm Düğmeler Tıklandı!' mesajını görmek için düğmelere tıklayın!
Allure raporlarını ve dinleyicilerini kullanma

 */
    @Test
 void test01(){
     driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
     driver.findElement(By.id("button00")).click();
     driver.findElement(By.id("button01")).click();
     driver.findElement(By.id("button02")).click();
    driver.findElement(By.id("button03")).click();

     WebElement message=driver.findElement(By.id("buttonmessage"));

     Assert.assertEquals(message.getText(), "All Buttons Clicked");
 }
}
