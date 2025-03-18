/**
 * MADE WITH CLAUDE AI !!!!!!!!!!!!
 * AIChatbot class for handling customer inquiries in a banking application
 * Provides methods for reading questions, generating answers, and sending responses
 */
public class AIChatbot {
    private String question;
    private String answer;
    
    /**
     * Default constructor
     */
    public AIChatbot() {
        this.question = "";
        this.answer = "";
    }
    
    /**
     * Constructor with parameters
     * @param question Initial question
     * @param answer Initial answer
     */
    public AIChatbot(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    
    /**
     * Read and process the customer's question
     * @param question The question from the customer
     */
    public void ReadQuestion(String question) {
        this.question = question;
        System.out.println("Question received: " + question);
        // Additional processing logic can be added here
    }
    
    /**
     * Generate an answer based on the question
     * @return The generated answer
     */
    public String GenerateAnswer() {
        // This is where your AI logic would process the question
        // Simplified example:
        if (question.toLowerCase().contains("balance")) {
            this.answer = "I can help you check your account balance. Please navigate to the 'Accounts' section or I can retrieve it for you if you confirm.";
        } else if (question.toLowerCase().contains("card")) {
            this.answer = "For card information, please go to the 'Cards' section. I can show you how to view your card details safely.";
        } else if (question.toLowerCase().contains("transaction")) {
            this.answer = "Your recent transactions can be found in the 'Transactions' tab. Would you like me to help filter them?";
        } else if (question.toLowerCase().contains("password")) {
            this.answer = "For security reasons, password changes require verification. Would you like me to connect you with a customer service representative?";
        } else {
            this.answer = "Thank you for your question. I'm here to help with your banking needs. Could you provide more details about what you're looking for?";
        }
        
        return this.answer;
    }
    
    /**
     * Send the generated answer to the customer
     * @param answer The answer to send
     * @return The sent answer
     */
    public String SendAnswer(String answer) {
        if (answer != null && !answer.isEmpty()) {
            this.answer = answer;
        }
        
        System.out.println("Answer sent: " + this.answer);
        return this.answer;
    }
    
    /**
     * Get the current question
     * @return The current question
     */
    public String getQuestion() {
        return question;
    }
    
    /**
     * Set a new question
     * @param question The new question
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    
    /**
     * Get the current answer
     * @return The current answer
     */
    public String getAnswer() {
        return answer;
    }
    
    /**
     * Set a new answer
     * @param answer The new answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
