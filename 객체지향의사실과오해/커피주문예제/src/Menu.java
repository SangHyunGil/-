import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem choose(String menuName) {
        return items.stream()
                .filter(item->item.getName().equals(menuName))
                .findFirst()
                .orElse(null);
    }
}
