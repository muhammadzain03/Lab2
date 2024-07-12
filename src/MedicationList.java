import java.util.ArrayList;
import java.util.List;

public class MedicationList {
    private int listID;
    private List<String> medications;

    // Constructor
    public MedicationList(int listID) {
        this.listID = listID;
        this.medications = new ArrayList<>();
    }

    // Getters and Setters
    public int getListID() {
        return listID;
    }

    public List<String> getMedications() {
        return medications;
    }

    public void setMedications(List<String> medications) {
        this.medications = medications;
    }

    public void addMedication(String medication) {
        this.medications.add(medication);
    }
}
