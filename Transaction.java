import java.time.LocalDate;
import java.util.UUID;

public class Transaction
{
    private String transactionID;
    private Float amount;
    private String SenderID;
    private String ReceiverID;
    private LocalDate Date;

    Transaction(float amount, String senderID, String receiverID, LocalDate date)
    {
        this.amount = amount;
        SenderID = senderID;
        ReceiverID = receiverID;
        Date = date;
        transactionID = UUID.randomUUID().toString();
    }
    public String getTransactionID()
    {
        return transactionID;
    }
    public Float getAmount()
    {
        return amount;
    }
    public String getSenderID()
    {
        return SenderID;
    }
    public String getReceiverID()
    {
        return ReceiverID;
    }
    public LocalDate getDate()
    {
        return Date;
    }
}
