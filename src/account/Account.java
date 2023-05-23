package account;

public abstract class Account {

    protected long amount;

    public Account(long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public boolean add(long amount) {
        return false;
    }

    public boolean pay(long amount) {
        return false;
    }

    public boolean transfer(Account account, long amount) {
        return false;
    }

    public long getBalance() {
        return getAmount();
    }

    public long getCreditLimit() {
        return this.amount;
    }
}
