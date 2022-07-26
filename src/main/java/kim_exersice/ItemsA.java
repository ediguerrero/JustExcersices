package kim_exersice;

import java.util.Map;

public class ItemsA implements Ivalidator {
    @Override
    public double validate(Map<ItemsEnum, Integer> items) {
        double amount = 0;
        if (items.containsKey(ItemsEnum.A)) {
            if (items.get(ItemsEnum.A) % 3 == 0) {
                amount = items.get(ItemsEnum.A) / 3 * 130;
            } else {
                amount = items.get(ItemsEnum.A) * 50;
            }
        }
        return amount;
    }

}
