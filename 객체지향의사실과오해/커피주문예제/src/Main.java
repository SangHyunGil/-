import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Barista barista = new Barista();
        Menu menu = new Menu(makeMenu());
        customer.order("아메리카노", menu, barista);
        customer.order("라떼", menu, barista);
    }

    public static List<MenuItem>  makeMenu() {
        MenuItem americano = new MenuItem("아메리카노", 4000);
        MenuItem latte = new MenuItem("라떼", 4000);
        return new ArrayList<>(Arrays.asList(americano, latte));
    }
}
