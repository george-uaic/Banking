public class Person
{
    String firstName;
    String lastName;
    String username;
    String password;
    String email;
    String phoneNumber;
    Account account;
    boolean loggedIn;

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