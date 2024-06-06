public class NegativeNumberException extends Exception {
    private int valueTreshold;

    public NegativeNumberException() {
    }

    public NegativeNumberException(String message, int valueTreshold) {
        super(message);

        this.valueTreshold = valueTreshold;
    }
}
