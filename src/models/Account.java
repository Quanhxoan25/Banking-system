import java.util.List;
import java.util.concurrent.TransferQueue;

public class Account {

    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    private String id;
    private double balance;
    private List<Transaction> transactionList;
}