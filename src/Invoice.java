public class Invoice {
    private int invoiceID;
    private double amount;
    private String status;

    // Constructor
    public Invoice(int invoiceID, double amount) {
        this.invoiceID = invoiceID;
        this.amount = amount;
        this.status = "Unpaid";
    }

    // Getters and Setters
    public int getInvoiceID() {
        return invoiceID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
