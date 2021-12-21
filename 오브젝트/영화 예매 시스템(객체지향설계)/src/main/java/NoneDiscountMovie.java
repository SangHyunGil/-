import java.time.Duration;

public class NoneDiscountMovie extends Movie{
    public NoneDiscountMovie(String title, Duration runningTime, Money fee) {
        super(title, runningTime, fee);
    }
    @Override
    Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
