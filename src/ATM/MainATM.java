package ATM;

public class MainATM {
    public static void main(String[] args)  {
        ATM atm1 = new ATM(15000, 4564, 1);
        atm1.setCurrentSumInATM(5000);
        ATM atm2 = new ATM(20000, 2212, 2);

        CreditCard card1 = new CreditCard("1111222233334444", 500);
        CreditCard card2 = new CreditCard("1111222233335555", 1000);

        Software version = new Software(3);

        atm1.operateWithATM(card1);

        System.out.println("Number of withdraws from all ATM is " + ATM.getNumberOfWithdrawsFromAllATM());
        System.out.println("Number of deposit from all ATM is " + ATM.getNumberOfDepositsToAllATM());

        for (int arr : ATM.getATMNetwork()) {
            System.out.println(arr);
        }

        try {
            ATMService.installNewVersion(version, atm1);
            ATMService.recoverSoftware(atm1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
