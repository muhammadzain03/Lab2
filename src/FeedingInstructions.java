public class FeedingInstructions {
    private int instructionID;
    private String details;

    // Constructor
    public FeedingInstructions(int instructionID, String details) {
        this.instructionID = instructionID;
        this.details = details;
    }

    // Getters and Setters
    public int getInstructionID() {
        return instructionID;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
