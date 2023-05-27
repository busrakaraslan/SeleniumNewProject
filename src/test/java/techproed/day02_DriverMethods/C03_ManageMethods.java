package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanin konumu" + driver.manage().window().getPosition());
        //manage().window() pencereyi yönet, getPosition() pozisyonunu getir.

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanin boyutlari " +driver.manage().window().getSize());
        //getSize() sayfanin boyutunu, size'ini getir

        //Browser'ı maximize yapalım
/*
bir web sitesine gittiğimizde browser default olarak bir boyuta gelir
ve açılan browser'daki webelementlerre browser maximize olmadığı için ulaşamayabilir.
Dolasıyla browser ı açtıktan sonra maximize yaparsak driver bütün webelemntleri görür ce
rahatlıkla müdehale edebilir. Bu yüzden browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
 */

        //Techproeducation sayfasına gidelim
        driver.get("https://www.techproeducation.com/");

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanin konumu = "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanin boyutlari = "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir
        Thread.sleep(3000);

        //sayfayı kapatınız
        driver.close();



    }


}
