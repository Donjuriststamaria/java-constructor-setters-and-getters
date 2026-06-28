public class Main_Customer {
    public static void main(String[] args) {
        Customer cust = new Customer();

        cust.setCustomerNumber(101);
        cust.setCustomerName("Don Jurist Sta Maria");
        cust.setCustomerAddress("Angeles city");
        cust.setItemDescription("");
        cust.setItemPrice(50000.00);
        cust.setQuantity(67);
        cust.setModeOfPayment(2); // Two installment

        cust.display();
    }
}