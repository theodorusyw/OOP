package hospital;

public class CreditCardPayment implements IPayment {
    private final String cardHolder;
    private final String cardNumber;
    private double amountPaid;

    public CreditCardPayment(String cardHolder, String cardNumber) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        this.amountPaid = amount;
        System.out.println("Payment of $" + amount + " made by " + cardHolder + " using Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }

    @Override
    public double getAmountPaid() {
        return amountPaid;
    }
}