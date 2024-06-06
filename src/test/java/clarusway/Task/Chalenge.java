package clarusway.Task;

import clarusway.utilitius.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Chalenge extends TestBase {
    /*
1. https://bonigarcia.dev/selenium-webdriver-java/web-form.html adresine gidin.
2. Slider'in başlangıç değerini kaydet
3. Slider'i 5 birim sağa hareket ettirin.
4. Slider'in son değerini kaydedin.
5. endValue-initValue==5 oldugunu dogrulayin
*/
    ////input[@name='my-range']
    public void test(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        String initValue = driver.findElement(By.xpath("//input[@name='my-range']")).getAttribute("value");
        System.out.println(initValue);
        driver.findElement(By.xpath("//input[@name='my-range']")).sendKeys("5");
        String endValue = driver.findElement(By.xpath("//input[@name='my-range']")).getAttribute("value");
        System.out.println(endValue);
        Assert.assertEquals(endValue, "5");
        Assert.assertEquals(initValue, "0");
        Assert.assertEquals(endValue, initValue);
    }
}
