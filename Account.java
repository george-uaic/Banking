import java.util.ArrayList;
import java.util.UUID;

public class Account
{
    private ArrayList<String> transactions;
    private String accountID;
    private float balance;

    Account()
    {
        accountID = UUID.randomUUID().toString();
        balance = 0.0f;
    }

    public String getAccountID()
    {
        return accountID;
    }

    public float getBalance()
    {
        return balance;
    }

    public void addTransaction(Transaction transaction)
    {
        transactions.add(transaction.getTransactionID());
    }

    public ArrayList<String> getTransactions()
    {
        return transactions;
    }

    @Override
    public String toString() {
        return accountID + " : balance" + balance;
    }
}
