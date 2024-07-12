import java.util.ArrayList;
import java.util.List;

public class CareProfile {
    private int profileID;
    private String specialNeeds;
    private List<FeedingInstructions> feedingInstructions;
    private List<MedicationList> medicationLists;

    // Constructor
    public CareProfile(int profileID) {
        this.profileID = profileID;
        this.feedingInstructions = new ArrayList<>();
        this.medicationLists = new ArrayList<>();
    }

    // Getters and Setters
    public int getProfileID() {
        return profileID;
    }

    public String getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public List<FeedingInstructions> getFeedingInstructions() {
        return feedingInstructions;
    }

    public void addFeedingInstruction(FeedingInstructions instruction) {
        this.feedingInstructions.add(instruction);
    }

    public List<MedicationList> getMedicationLists() {
        return medicationLists;
    }

    public void addMedicationList(MedicationList medicationList) {
        this.medicationLists.add(medicationList);
    }
}
