package account;

public class CreditAccount extends Account {
    public long creditLimit;

    public CreditAccount(long amount) {
        super(-(amount));
        this.creditLimit = -(amount);
    }

    @Override
    public long getCreditLimit() {
        return this.creditLimit;
    }

    @Override
    public boolean add(long amount) {
        long firstBalance = getAmount();
        if ((amount > 0) && (firstBalance + amount <= 0) && (amount + firstBalance) >= this.creditLimit) {
            super.amount += amount;
        }

        if (amount >= 0 && firstBalance < getAmount()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        long firstBalance = getBalance();
        if (amount > 0 && amount <= Math.abs(firstBalance) && (Math.abs(this.creditLimit) >= (amount + Math.abs(firstBalance)))) {
            super.amount += -(amount);
        }

        if (amount >= 0 && firstBalance > getAmount()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(Account account, long amount) {
        boolean flag = false;
        if (pay(amount)) {
            if (account.add(amount)) {
                flag = true;
            } else {
                add(amount);
                flag = false;
            }
        }
        return flag;
    }

}
