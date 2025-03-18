public class Person
{
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    protected Account account;
    private boolean loggedIn;

    public Person(String phoneNumber, String email, String password, String username, String lastName, String firstName)
    {
        phoneNumber = phoneNumber;
        email = email;
        password = password;
        username = username;
        lastName = lastName;
        firstName = firstName;
        account = new Account();
    }

    public void LogginIn(String Username, String Password)
    {
        if(this.username.equals(Username) && this.password.equals(Password))
            setLoggedStatus(true);
    }

    public void setLoggedStatus(boolean status)
    {
        loggedIn = status;
    }
}