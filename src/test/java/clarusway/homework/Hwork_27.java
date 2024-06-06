package clarusway.homework;

import clarusway.utilitius.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Hwork_27 extends TestBase {
    /*
Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
Add 10 notes using data provider with excel
Run it with 3 different browsers using XML file
Run it parallel with 3 threads
excel ile veri sağlayıcıyı kullanarak dd 10 notları
XML dosyasını kullanarak 3 farklı tarayıcıda çalıştırın
3 iş parçacığıyla paralel çalıştırın
 */
    @Test
    public void dataProvider(){
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        driver.findElement(By.id("note-title-input")).sendKeys("t");
        driver.findElement(By.id("note-details-input")).sendKeys("n");
        driver.findElement(By.id("add-note")).click();


    }
}
