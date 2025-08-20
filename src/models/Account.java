import java.util.List;
import java.util.concurrent.TransferQueue;

public abstract class Account {

    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    private String id;
    private double balance;
    private List<Transaction> transactionList;

    public Account() {}

    public Account(String id, double balance, List<Transaction> transactions) {
        this.id = id;
        this.balance = balance;
        this.transactionList = transactions;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setBalance(double balance) {
        if (balance < 0) throw new IllegalArgumentException("So du khong hop le");
        
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        if (transactionList == null) throw new IllegalArgumentException("Danh sach giao dich rong");
        this.transactionList = transactionList;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void doDeposit(double amount) {
        balance += amount;
    }

    public void doWithdraw(double amount) {
        balance = balance - amount;
    }
}