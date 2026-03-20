package Liam.AulasPUC.myOwnBulshi;

public class Card extends PaymentMethod{


    public Card(double valueToPay, String somethingYouBought) {
        super(valueToPay, somethingYouBought);
    }

    @Override
    void authorizePayment() {
        System.out.println("To authorize your payment, we check the BANK API!");
    }

    @Override
    double getTaxRate() {
        return 2.35;
    }

};


