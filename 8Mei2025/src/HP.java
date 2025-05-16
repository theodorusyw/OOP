public class HP implements IRecoverable, IHeal {
    private int value;

    public HP(int value) {
        this.value = value;
    }

    public void decrease(int amount) {
        value -= amount;
        if (value < 0) value = 0;
    }

    public void increase(int amount) {
        value += amount;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void recover(int value) {
        increase(value);
    }

    @Override
    public void heal(int value) {
        increase(value);
    }
}
