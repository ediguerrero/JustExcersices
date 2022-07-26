package kim_exersice;

import java.util.Map;

@FunctionalInterface
public interface Ivalidator {

     double validate(Map<ItemsEnum,Integer> items);
}
