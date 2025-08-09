package Advanced;

/*
 * Customer Class
 * It has a relationship with DiscountPolicy
 * This class represent a customer with an ID, Name , DiscountPlolicy
 */

public class Customer {
    private int id;
    private String name;
    private DiscountPolicy discountPolicy;

    /*
     * Constructor for create customer object
     * 
     * @param customer id unique & not - Integer
     * 
     * @param name not null
     * 
     * @param discountPolicy is not null
     * 
     * @throw IllegalArgumentException if@parms invalid
     */

    public Customer(int id, String name, DiscountPolicy discountPolicy) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be posstitive number");
        }

        if (name.isBlank() || name == null) {
            System.out.println("Name must be assigned !! ");
            return; // End Program
        }

        if (discountPolicy == null) {
            System.out.println("Discount Policy is Invalid !! ");
            return; // End Program
        }

        this.id = id;
        this.name = name;
        this.discountPolicy = discountPolicy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }

    public void setDiscountPolicy(DiscountPolicy policy) {
        if (policy == null) {
            System.out.println("Discount Policy is Invalid !! ");
            return; // End Program
        }

        this.discountPolicy = policy;
    }

    @Override
    public String toString() {
        return "Customer(id =" + id + "name = " + name + "discount policy = " + discountPolicy + ")";
    }
}
