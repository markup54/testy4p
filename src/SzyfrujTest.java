import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfrujTest {

    @Test
    void szyfrujJezeliPusteSlowo() {
        String oczekiwana = "";
        String otrzymana =  Main.szyfruj("");
        Assertions.assertEquals(oczekiwana,otrzymana);
    }

    @Test
    void szyfrujJezeliDlugoscPotegaCalkowitaKwadratu(){
        String oczekiwana = "tmaa";
        String otrzymana = Main.szyfruj("tama");
        Assertions.assertEquals(oczekiwana,otrzymana);
    }
    @Test
    void szyfrujJezeliDlugoscMniejszaOdPotegiWiekszaOdPotegi_1(){
        String oczekiwana = "pgmrr oa";
        String otrzymana = Main.szyfruj("program");
        Assertions.assertEquals(oczekiwana,otrzymana);
    }
    @Test
    void szyfrujJezeliDlugoscMniejszaOdPotegiPustyWiersz(){
        String oczekiwana = "prk rai om  gi";
        String otrzymana = Main.szyfruj("programiki");
        Assertions.assertEquals(oczekiwana,otrzymana);
    }


    @Test
    void czyPierwszaJezeliLiczba1(){
        Assertions.assertFalse(Main.czyPierwsza(1));
    }
    @Test
    void czyPierwszaJezeliLiczba0(){
        Assertions.assertFalse(Main.czyPierwsza(0));
    }
    @Test
    void czyPierwszaJezeliLiczba2(){
        Assertions.assertTrue(Main.czyPierwsza(2));
    }

    @Test
    void czyPierwszaJezeliWartoscUjemna(){
        Assertions.assertFalse(Main.czyPierwsza(-5));
    }

    @Test
    void czyPierwszaJezeliPotega(){
        Assertions.assertFalse(Main.czyPierwsza(49));
    }

    @Test
    void czyPierwszaJezeliPierwsza17(){
        Assertions.assertTrue(Main.czyPierwsza(17));
    }


}