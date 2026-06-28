public class Customer {
    private int customerNumber;
    private String customerName;
    private String customerAddress;
    private String itemDescription;
    private double itemPrice;
    private int quantity;
    private int modeOfPayment; // 1 = cash, 2 = two installment, 3 = three installment

    // Setters
    public void setCustomerNumber(int customerNumber) { this.customerNumber = customerNumber; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setCustomerAddress(String customerAddress) { this.customerAddress = customerAddress; }
    public void setItemDescription(String itemDescription) { this.itemDescription = itemDescription; }
    public void setItemPrice(double itemPrice) { this.itemPrice = itemPrice; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setModeOfPayment(int modeOfPayment) { this.modeOfPayment = modeOfPayment; }

    // Getters
    public int getCustomerNumber() { return customerNumber; }
    public String getCustomerName() { return customerName; }
    public String getCustomerAddress() { return customerAddress; }
    public String getItemDescription() { return itemDescription; }
    public double getItemPrice() { return itemPrice; }
    public int getQuantity() { return quantity; }
    public int getModeOfPayment() { return modeOfPayment; }

    // Compute total item purchased
    public double compute() {
        return quantity * itemPrice;
    }

    // Compute net total based on mode of payment
    public double NET() {
        double total = compute();
        switch (modeOfPayment) {
            case 1: return total - (total * 0.05); // Cash, less 5%
            case 2: return total + (total * 0.05); // Two installment, plus 5%
            case 3: return total + (total * 0.10); // Three installment, plus 10%
            default: return total;
        }
    }

    // Display customer details
    public void display() {
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Item Description: " + itemDescription);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Mode of Payment: " + modeOfPayment);
        System.out.println("Total Item Purchased: " + compute());
        System.out.println("Net Total Item Purchased: " + NET());
    }
}