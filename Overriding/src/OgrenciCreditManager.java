public class OgrenciCreditManager extends BaseCreditManager  {

    // Hesaplayı aynı imza ile yazarsak, override edip buradakini çalıştırıyor
    public double calculate(double amount) {
        return amount * 1.10;
    }
}
