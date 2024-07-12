public class Staff {
    private int staffID;
    private String name;
    private String role;

    // Constructor
    public Staff(int staffID, String name, String role) {
        this.staffID = staffID;
        this.name = name;
        this.role = role;
    }

    // Getters and Setters
    public int getStaffID() {
        return staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
