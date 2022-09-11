package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Locaters;
import utilities.Driver;


public class StepDef01 {


            Faker faker=new Faker();
            Locaters locaters=new Locaters();
            Actions actions=new Actions(Driver.getDriver());


        @Given("Kullanici A101 sitesine yonlenir")
        public void kullanici_a101_sitesine_yonlenir() {
                Driver.getDriver().get("https://www.a101.com.tr");
        }

        @Given("Kullanici anasayfadaki Giyim & Aksesuar sekmesine uzerinde bekler")
        public void kullanici_anasayfadaki_giyim_aksesuar_sekmesine_uzerinde_bekler() throws InterruptedException {
             //Kullanici cikan reklem popupını kapatır
             // Thread.sleep(5000);
              //locaters.gozAtPopup.click();
            //Kullanici cerezleri kabul et butonuna tiklar
                Thread.sleep(2000);
                locaters.cerezKabulEtButonu.click();
             //Kullanici giyim ve aksesuar butonuna tiklar
                Thread.sleep(2000);
               locaters.giyim_aksesuar.click();



        }

        @Given("Kullanici Kadin ic Giyim sekmesine tiklar")
        public void kullanici_kadin_ic_giyim_sekmesine_tiklar() throws InterruptedException {
                Thread. sleep(2000);
                locaters.kadinicGiyim.click();


        }

        @Given("Kullanici Dizalti Corap secenegine tiklar")
        public void kullanici_dizalti_corap_secenegine_tiklar() throws InterruptedException {
                Thread. sleep(2000);
                locaters.dizaltiCorap.click();
        }

        @Given("Kullanici ilk urune tiklar")
        public void kullanici_ilk_urune_tiklar() throws InterruptedException {
                Thread. sleep(2000);
                locaters.ilkUrun.click();
        }

        @Given("Kullanici acilan urunun siyah oldugu dogrular")
        public void kullanici_acilan_urunun_siyah_oldugu_dogrular() throws InterruptedException {
              Thread. sleep(2000);
              String beklenenText="siyah";
              String gerceklesenText=locaters.ilkUrun.getText();
              System.out.println("Secilen İlk Üründeki Text = " + gerceklesenText);
              Assert.assertTrue(gerceklesenText.contains(beklenenText));
        }

        @Given("Kullanici Sepete ekle butonuna tiklar")
        public void kullanici_sepete_ekle_butonuna_tiklar() throws InterruptedException {
                Thread. sleep(2000);
               locaters.ilkUrun.click();
               Thread.sleep(1000);
               locaters.sepeteEkleButonu.click();
        }

        @Given("Kullanici Sepeti Goruntule butonuna tiklar")
        public void kullanici_sepeti_goruntule_butonuna_tiklar() throws InterruptedException {
                Thread. sleep(2000);
                locaters.sepetiGoruntule.click();
        }

        @Given("Kullanici Sepeti Onayla butonuna tiklar")
        public void kullanici_sepeti_onayla_butonuna_tiklar() throws InterruptedException {
                Thread. sleep(2000);
                locaters.sepetiOnayla.click();
        }

        @Given("Kullanici üye olmadan devam et butonuna tiklar.")
        public void kullanici_üye_olmadan_devam_et_butonuna_tiklar() throws InterruptedException {
                Thread. sleep(2000);
                locaters.uyeOlmadanDevamEt.click();
        }

        @Given("Kulanici bos gelen E-Mail textboxi doldurur")
        public void kulanici_bos_gelen_e_mail_textboxi_doldurur() throws InterruptedException {
                Thread. sleep(2000);
                locaters.emailTextBox.click();
                Thread. sleep(2000);
                locaters.uyeOlmadanDevamEt.sendKeys("halilibrahimyavuz07@gmail.com");
                Thread. sleep(2000);
                locaters.devamEtButonu.click();
        }

        @Given("Kullanici Yeni Adres olustur bolumunden adres olusturur")
        public void kullanici_yeni_adres_olustur_bolumunden_adres_olusturur() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }

        @Given("Kullanici Kaydet ve Devam et butonuna basar")
        public void kullanici_kaydet_ve_devam_et_butonuna_basar() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }

        @Given("Kullanici odeme ekranina gidildigi dogrular")
        public void kullanici_odeme_ekranina_gidildigi_dogrular() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }

}