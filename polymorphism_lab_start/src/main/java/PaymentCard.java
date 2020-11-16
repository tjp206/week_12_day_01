public abstract class PaymentCard {

    protected String cardNumber;
    protected String expiryDate;

    public PaymentCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }
}
