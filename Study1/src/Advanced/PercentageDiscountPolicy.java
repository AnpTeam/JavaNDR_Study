package Advanced;

/*
 * Percentage DisountPolicy Class
 * This class apply the percentage based discount
 */

public class PercentageDiscountPolicy implements DiscountPolicy {
    private int percent;

    public PercentageDiscountPolicy(int percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Discount percentage must be 0 - 100");
        }

        this.percent = percent;
    }

    @Override
    public double applyDiscount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount  cannot be negative");
        }

        return amount * (1 - percent/100.0);
    }

    public int getPercent() {
        return percent;
    }

    @Override
    public String toString() {
        return percent + "%";
    }
}
