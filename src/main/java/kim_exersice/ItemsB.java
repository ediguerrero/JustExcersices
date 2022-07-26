package kim_exersice;

import java.util.Map;

public class ItemsB implements Ivalidator {
    @Override
    public double validate(Map<ItemsEnum, Integer> items) {
        double amount = 0;
        if (items.containsKey(ItemsEnum.B)) {
            if (items.get(ItemsEnum.B) % 2 == 0) {
                amount = items.get(ItemsEnum.B) / 2 * 45;
            } else {
                amount = items.get(ItemsEnum.B) * 30;
            }
        }
        return amount;
    }
}
