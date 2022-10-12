public class Main {
    public static void main(String[] args) {

        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        KrediUI krediUI = new KrediUI();
        ogretmenKrediManager.calculate();
        krediUI.calculateCredit(ogretmenKrediManager);
        krediUI.calculateCredit(new AskerKrediManager());

    }
}