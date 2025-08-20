public class ChekingAccount extends Account {
    
    public ChekingAccount() {
        super();
    }

    public ChekingAccount(String id, double balance, List<Transaction> transactionList) {
        super(id, balance, transactionList);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("So tien nap vao khong hop le!");

        super.doDeposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        if (amount <= 0 || amount > balance - amount) throw new IllegalArgumentException("So tien rut ra khong hop le!");

        super.doWithdraw(amount);
    }
}
