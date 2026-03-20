package Liam.AulasPUC.myOwnBulshi;

public class Paypal extends PaymentMethod{
    private String buyPlace;
    private boolean isInternational;
    private String ACH;


    // created the constructor matching the Super!!
    public Paypal(double valueToPay, String somethingYouBought, String buyPlace, boolean isInternational, String ACH) {
        super(valueToPay, somethingYouBought); // sends the Basic info to the Parent
        this.buyPlace = buyPlace;
        this.isInternational = isInternational;
        this.ACH = ACH;
    };

    public boolean getIsInternational(){
        return isInternational;
    };

    public String getBuyPlace() {
        return buyPlace;
    }

    public String getACH() {
        return ACH;
    }

    @Override
    void authorizePayment() {
        System.out.println("we do shit to authorize, just pray yo shi wont be hacked or robbed");
    };

    @Override
    double getTaxRate() {
        double taxCounter = 0.0;
        if (isInternational) {
            taxCounter += 1.5;
        };
        if (getACH().trim().toLowerCase().equals("bankofamerica")) {
            taxCounter += 1.0;
        };
        if (getBuyPlace().trim().toLowerCase().equals("online")) {
            taxCounter += 3.49;
        };

        return taxCounter;
    };
}
