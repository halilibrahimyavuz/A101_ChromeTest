package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Locaters {

    public Locaters(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

        @FindBy (xpath = "//div[@class='closePopupPersona']")
        public WebElement gozAtPopup;

        @FindBy (xpath = "//button[text()='Kabul Et']")
        public WebElement cerezKabulEtButonu;

        @FindBy (xpath = "(//a[@title='GİYİM & AKSESUAR'])[1]")
        public WebElement giyim_aksesuar;

         @FindBy (xpath = "(//a[@class='js-filter-link '])[2]")
        public WebElement kadinicGiyim;

        @FindBy (xpath = "(//a[@title='Dizaltı Çorap'])[2]")
        public WebElement dizaltiCorap;

        @FindBy (xpath = "(//h3)[1]")
        public WebElement ilkUrun;

        @FindBy (xpath = "//h1[text()='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
        public WebElement ilkUrununDetaySayfasi;

        @FindBy (xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
        public WebElement sepeteEkleButonu ;

        @FindBy (xpath = "(//a[@title='Sepeti Görüntüle'])[2]")
         public WebElement sepetiGoruntule;

        @FindBy (xpath = "(//a[@title='Sepeti Onayla'])[2]")
         public WebElement sepetiOnayla;

        @FindBy (xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
         public WebElement uyeOlmadanDevamEt;


         @FindBy (xpath = "//*[text()='E-mail']")
         public WebElement emailTextBox;

         @FindBy (xpath = "//button[@class='button block green']")
         public WebElement devamEtButonu;

         @FindBy (xpath = "(//*[@title='Yeni adres oluştur'])[1]")
         public WebElement yeniAdresEkle;

         @FindBy (xpath = "(//*[@name='title'])[1]")
         public WebElement adresBasligiTextBox;

         @FindBy (xpath = "//*[@name='city']")
         public WebElement ilTextBox;

         @FindBy (xpath = "//*[@name='township']")
         public WebElement ilceTextBox;

         @FindBy (xpath = "//*[@name='district']")
         public WebElement mahalleTextBox;



}
