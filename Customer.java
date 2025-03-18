public class Customer extends Person
{
    private String question;

    public Customer(String phoneNumber, String email, String password, String username, String lastName, String firstName)
    {
        super(phoneNumber, email, password, username, lastName, firstName);
    }

    public void sendQuestion(String question)
    {
        this.question = question;
    }

    public void viewAccountDetails()
    {
        System.out.println(account);
    }
}
