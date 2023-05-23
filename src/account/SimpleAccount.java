package account;

public class SimpleAccount extends Account {

    public SimpleAccount(long amount) {
        super(amount);
    }

    @Override
    public boolean add(long amount) {
        long firstBalance = getAmount();
        if (amount >= 0) {
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
        long firstBalance = getAmount();
        if (amount > 0 && (amount <= firstBalance)) {
            super.amount += -(amount);
        }

        if (amount >= 0 && firstBalance > getAmount()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
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
