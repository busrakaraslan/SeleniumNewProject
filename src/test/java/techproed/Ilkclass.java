package techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //Java uygulamarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz.
        //setProperty methodu ile class'imiza driver'in fiziki yolunu belirtiriz
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com"); //get() methodu ile string olarak girilen url'e gideriz


    }

}
