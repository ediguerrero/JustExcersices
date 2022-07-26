
import kim_exersice.ItemsEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CalculatorTest {

    @Test
    public void exercise(){
        List<ItemsEnum> items = Arrays.asList(ItemsEnum.A,ItemsEnum.A,ItemsEnum.A);
        Map<ItemsEnum, Integer> itemsAmount = Resourse.addItems(items);

        Assertions.assertEquals(3,itemsAmount.get(ItemsEnum.A));
    }

    @Test
    public void exercise2(){
        List<ItemsEnum> items = Arrays.asList(ItemsEnum.A,ItemsEnum.A,ItemsEnum.A, ItemsEnum.A,ItemsEnum.A,ItemsEnum.A);

        Map<ItemsEnum, Integer> itemsAmount = Resourse.addItems(items);

        Assertions.assertEquals(130,Resourse.validate(itemsAmount));
    }
}
