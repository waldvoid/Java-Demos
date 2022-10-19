public class Main {
    public static void main(String[] args) {

        OgretmenCreditManager ogretmenCreditManager = new OgretmenCreditManager();
        System.out.println("Your Credit Payment Amount is " + ogretmenCreditManager.calculate(1000));

        BaseCreditManager[] creditManagers = {new TarimCreditManager(), new OgretmenCreditManager(), new OgrenciCreditManager()};
        for (BaseCreditManager creditManager : creditManagers) {
            System.out.println(creditManager.calculate(1000));
        }

    }
}