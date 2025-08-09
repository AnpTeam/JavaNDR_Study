public class Customer {
    private int id;
    private String name;
    private int discount;

    /*
     * Constructor for create customer object
     * 
     * @param customer id unique & not - Integer
     * 
     * @param name not null
     * 
     * @param discount (%) is between 0-100
     * 
     * @throw IllegalArgumentException if@parms invalid
     */

    public Customer(int id, String name, int discount) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be posstitive number");
        }

        if (name.isBlank() || name == null) {
            System.out.println("Name must be assigned !! ");
            return; // End Program
        }

        if (discount < 0 || discount > 100) {
            System.out.println("Discount must between 0 - 100 !! ");
            return; // End Program
        }

        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        if (discount < 0 || discount > 100) {
            System.out.println("Discount must between 0 - 100 !! ");
            return; // End Program
        }

        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("%s (%d) %d%%" , name ,id , discount);
    }
}
