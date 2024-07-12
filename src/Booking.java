import java.util.Date;

public class Booking {
    private int bookingID;
    private Date startDate;
    private Date endDate;
    private String status;
    private Pet pet;
    private Invoice invoice;

    // Constructor
    public Booking(int bookingID, Date startDate, Date endDate, String status, Pet pet) {
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.pet = pet;
        this.invoice = new Invoice(bookingID, calculateAmount());  // Generate an invoice for the booking
    }

    // Getters and Setters
    public int getBookingID() {
        return bookingID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pet getPet() {
        return pet;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    // Method to calculate the amount for the invoice
    private double calculateAmount() {
        // Example calculation, can be adjusted based on requirements
        long duration = (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24);
        return duration * 20.0;  // Assume $20 per day
    }
}
