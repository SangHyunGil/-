public class NoneDiscountPolicy implements DiscountPolicy{
    @Override
    public Money calculateDiscountAmount(Movie movie) {
        return Money.ZERO;
    }
}
