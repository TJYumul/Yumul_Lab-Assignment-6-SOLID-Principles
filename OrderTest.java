public class OrderTest {
    public static void main(String[] args) {

        Order order = new OrderAction();
        InvoiceGenerator invoiceGenerator = (InvoiceGenerator) order;
        EmailNotifier emailNotifier = (EmailNotifier) order;

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        invoiceGenerator.generateInvoice("order_123.pdf");
        emailNotifier.sendEmailNotification("johndoe@example.com");
    }
}
