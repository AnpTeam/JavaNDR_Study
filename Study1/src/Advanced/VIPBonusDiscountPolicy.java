package Advanced;

/*
 * VIP Bonus Discount Policy Class
 * This class apply a base percentage and an additional bonus if the amount exceed the threshold.
 * 
 */

public class VIPBonusDiscountPolicy  implements DiscountPolicy{
    private int basePercent; // Base Percent always for VIP member
    private int bonusPercent; // Bonus add exclude of base percent
    private double bonusThreshold; // Condition by Amount > bonusRatio : Special Bonus = Bonus Percent + Base Percent;

    public VIPBonusDiscountPolicy(int basePercent , int bonusPercent , double bonusThreshold){
        if (basePercent < 0 || basePercent > 100) {
            throw new IllegalArgumentException("Base Percentage must be possitive number");
        }
                if (bonusPercent < 0 || bonusPercent > 100) {
            throw new IllegalArgumentException("Bonus Percentage must be possitive number");
        }

                if (bonusThreshold < 0) {
            throw new IllegalArgumentException("bonusThreshold must be possitive number");
        }

        this.basePercent = basePercent;
        this.bonusPercent = bonusPercent;
        this.bonusThreshold = bonusThreshold;
    }

    @Override
    public double applyDiscount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        int totalPercent = basePercent;

        if (amount > bonusThreshold) {
            totalPercent += bonusPercent;
        }

        //Cap the total discount to prevent negative price
        if (totalPercent > 100) totalPercent = 100;

        return amount * (1 - totalPercent/100.0);
    }

    @Override
    public String toString() {
        return String.format("%d base + %d bonus over %.2f" ,basePercent,bonusPercent , bonusThreshold);
    }
}
