package clarusway.homework;

import clarusway.utilitius.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Hwork_23 extends TestBase {
    /*
    Find the height of the earliest built tower on this page:
    (Listedeki ilk inşa edilmiş kulenin uzunluğunu yazdırınız)
    https://www.techlistic.com/p/demo-selenium-practice.html
    Your code must be dynamic
    Run test with XML file
*/
@Test
    public void Tower(){
    driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
    List<WebElement>BuiltDate=driver.findElements(By.xpath("//table[@class='tcs_table_s13']//tr//td[4]"));
    List<WebElement>BuiltName=driver.findElements(By.xpath("//table[@class='tcs_table_s13']//tr//th[1]"));
int minValue=Integer.MAX_VALUE;
int minIndex=-1;
for(int i=0;i< BuiltDate.size();i++){
    int Value=Integer.valueOf(BuiltDate.get(i).getText());
    if(Value<minValue){
        minValue=Value;
        minIndex=i;
    }
}
   // System.out.println(BuiltName.get(minIndex+2).getText());
}
    }



