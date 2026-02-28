package comparator;

import java.util.Comparator;

public class ItemStringInSensitiveNameComparator implements Comparator<Item> {
    /*
 String.CASE_INSENSITIVE_ORDER принимает строки в качестве аргументов,
 поэтому передадим названия товаров в его метод .compare(...)
 */
    @Override
    public int compare(Item item1, Item item2){
        return String.CASE_INSENSITIVE_ORDER.compare(item1.name, item2.name);
    }
}
