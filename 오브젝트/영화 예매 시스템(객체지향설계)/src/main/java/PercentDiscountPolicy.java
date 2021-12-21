public class PercentDiscountPolicy implements DiscountPolicy{
    double percent;

    public PercentDiscountPolicy(double percent) {
        this.percent = percent;
    }

    @Override
    public Money calculateDiscountAmount(Movie movie) {
        return movie.getFee().times(percent);
    }
}
