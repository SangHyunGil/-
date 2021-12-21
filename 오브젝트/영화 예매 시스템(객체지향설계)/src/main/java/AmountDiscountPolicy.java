public class AmountDiscountPolicy implements DiscountPolicy{
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscountAmount(Movie movie) {
        return discountAmount;
    }
}
