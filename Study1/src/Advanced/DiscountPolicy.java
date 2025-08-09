package Advanced;
// DiscountPolicy Inteface

public interface DiscountPolicy {
    /*
     * @param amount the original.
     * Return Amount after the discount is Apply.
     */

    double applyDiscount(double amount);
}
