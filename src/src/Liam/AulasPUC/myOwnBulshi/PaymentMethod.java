package Liam.AulasPUC.myOwnBulshi;


public abstract class PaymentMethod {
    protected static String currency = "USD";
    private double valueToPay;
    private String item;

    private static int nextID = 1000; // is the Counter of IDs
    private final int transactionID; // needs to be final so it cant be changed

    // remember, Abstract classes do need a constructor
    // each time a new Object is instantiated it will have nextID + 1 of Transaction ID!
    public PaymentMethod(double valueToPay, String somethingYouBought){
        this.valueToPay = valueToPay;
        this.item = somethingYouBought;
        this.transactionID = nextID;
        nextID++;
    }

    // GETTERS
    public String getItem() {
        return item;
    };
    public double getValueToPay(){
        return valueToPay;
    };
    public int getTransactionID(){
      return transactionID;
    };
    public String getCurrency(){
        return currency;
    };

    // SETTERS!


    public void setItem(String item) {
        this.item = item;
    };

    public void changeCurrency(String newCurrency){
        PaymentMethod.currency = newCurrency; // A small logic error
        // if I use "THIS.CURRENCY = newCURRENCY"
        // since I have 3 different paying methods, the currency will change for all 3 ways
        // instead we use the name of the parent, because if the method is card, then CARD.CURRENCY will be changed and so on!

    };

    public double calculateTotal() {
        double taxAmount = (getValueToPay() * getTaxRate()) / 100;
        return getValueToPay() + taxAmount;
    }

    public void printReceipt() {
        System.out.println("-------------------------");
        System.out.println("| items: " + getItem());
        System.out.println("| total price: " + calculateTotal() + getCurrency());
        System.out.println("| taxes: " + getTaxRate() + "%");
        System.out.println("-------------------------");
    }

    abstract void authorizePayment();
    abstract double getTaxRate();
}
