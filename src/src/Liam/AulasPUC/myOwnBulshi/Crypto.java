package Liam.AulasPUC.myOwnBulshi;

public class Crypto extends PaymentMethod {


    public Crypto(double valueToPay, String somethingYouBought) {
        super(valueToPay, somethingYouBought);
    }

    @Override
    void authorizePayment() {
        System.out.println("To authorize your payment, we check the CRYPTO'S BLOCKCHAIN!");
    }

    @Override
    double getTaxRate() {
        return 0.0;
    }
}
