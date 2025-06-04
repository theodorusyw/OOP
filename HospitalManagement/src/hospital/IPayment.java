package hospital;

public interface IPayment {
    void pay(double amount);
    double getAmountPaid();
}