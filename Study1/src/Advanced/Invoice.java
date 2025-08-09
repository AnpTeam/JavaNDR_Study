package Advanced;

/*
 * Invoice Class
 * This class represent an invoice linking a customer to a total amount.
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

    // Calculate Net Price (Discount included)
    //Core Bussiness Logic "Apply the customer's discount policy"
    public double getAmountAfterDiscount() {
        return this.customer.getDiscountPolicy().applyDiscount(amount);
    }

    @Override
    public String toString() {
        return String.format("Invoice{id = %d, customerId = %d, name = "+getCustomerName()+", original amount = %.2f, discount amount = %.2f}", id, getCustomerId(),
                amount,getAmountAfterDiscount());
    }
}
