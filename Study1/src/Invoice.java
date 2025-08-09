/*
 * Composition Concept
 * Relationship has Customer Class
 */

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be posstitive number");
        }

        if (customer == null) {
            throw new IllegalArgumentException("Customer must be Assign");
        }

        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be posstitive number");
        }

        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer must be Assign");
        }

        this.customer = customer;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmount() {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be posstitive number");
        }
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    // Calculate Net Price (Discount included)
    public double getAmountAfterDiscount() {
        double discountAmount = amount * (getCustomerDiscount() / 100.0);
        double netTotal = amount - discountAmount;

        return netTotal;

        // return this.amount * (1 - getCustomerDiscount()/100.0);
    }

    @Override
    public String toString() {
        return String.format("Invoice[id = %d, customer = %s,Amount = %.2f]", id, getCustomer(),
                getAmountAfterDiscount());
    }
}
