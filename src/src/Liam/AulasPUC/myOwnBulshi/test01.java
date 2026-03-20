package Liam.AulasPUC.myOwnBulshi;

public class test01 {
    public static void main(String[] args) {

        // let's try to instantiate one of our methods
        Paypal newDebit = new Paypal(100.99,"a Purse", "online", true, "bank of america");

        String place = newDebit.getBuyPlace();
        int ID = newDebit.getTransactionID();

        System.out.println("Your item" + ID + "was bought " + place);
        newDebit.authorizePayment();
        newDebit.printReceipt();


    }
}
