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

         @FindBy (xpath = "//a[@title='Kadın İç Giyim']")
        public WebElement kadinicGiyim;

        @FindBy (xpath = "(//a[@title='Dizaltı Çorap'])[2]")
        public WebElement dizaltiCorap;

        @FindBy (xpath = "(//h3)[1]")
        public WebElement ilkUrun;

        @FindBy (xpath = "//i[@class='icon-sepetekle']")
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



}
