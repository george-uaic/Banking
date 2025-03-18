public class BankEmployee extends Person
{
    private String answer;
    private String employeeId;

    public BankEmployee(String phoneNumber, String email, String password, String username, String lastName, String firstName)
    {
        super(phoneNumber, email, password, username, lastName, firstName);
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public String readAnswer()
    {
        return "Reading answer: " + answer;
    }

    public void editAnswer(String newAnswer) {
        this.answer = newAnswer;
        System.out.println("Answer edited: " + answer);
    }

    public void sendAnswer() {
        System.out.println("Sending answer: " + answer);
    }
}
