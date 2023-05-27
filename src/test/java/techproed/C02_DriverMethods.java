package techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.Driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://amazon.com");
        //gettitle() sayfa başlığını verir
        System.out.println("Amazon sayfa basligi"+driver.getTitle());
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());
        String amazonWindowHanle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHanle);

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Sayfa Başlığı : "+driver.getTitle());//getTitle() methodu Sayfa başlığını verir

        //getCurrenturl() gidilen sayfanın url'ini verir
        System.out.println("Techproed Actual Url : "+driver.getCurrentUrl());

        //getPageSource() açılan sayfanın kaynak kodlarını verir
       // System.out.println(driver.getPageSource()); bilerek yoruma aldık her çalıştırdığımızda kaynak kod vereceği için

        //getWindowHandle()gidilen sayfanın handle değerini(hashkod) verir. bu hanhle değerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window Handle Değeri : "+driver.getWindowHandle());




    }

}
