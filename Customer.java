// Customer.java
import java.util.Arrays;

public class Customer extends Person {
    private String question;
    private String[] account;

    public Customer(String name, String email, String phoneNumber, String[] accounts) {
        super(name, email, phoneNumber);
        this.accounts = accounts;
    }

    public void sendQuestion(String question) {
        this.question = question;
        System.out.println("Customer asked: " + question);
    }

    public void viewAccountDetails() {
        System.out.println(Arrays.toString(account));
    }
}
