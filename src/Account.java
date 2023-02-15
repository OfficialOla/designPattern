public class Account {
    private float balance;

    public float getBalance() {
        return balance;
    }

    void deposit(float amount){
        if (amount > 0) balance += amount;
    }
    public void withdraw(float amount) {
        if (amount > 0) balance -= amount;
    }
}
