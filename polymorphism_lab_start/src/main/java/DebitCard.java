public class DebitCard extends PaymentCard {
    private int sortCode;
    private int accountNumber;
    private int securityNumber;

    public DebitCard(String cardNumber, String expiryDate, int sortCode, int accountNumber, int securityNumber) {
        super(cardNumber, expiryDate);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.securityNumber = securityNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public String scan() {
        return "Payment Complete";
    }
}
