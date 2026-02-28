package comparator;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {
    /*@Override
    public int compare(Item item1, Item item2){
        // сравниваем товары — более дорогой должен быть дальше в списке
        if (item1.price > item2.price){
            return 1;
        }
        // более дешёвый — ближе к началу списка
        else if (item1.price < item2.price) {
            return -1;
        }
        // если стоимость равна, нужно вернуть 0
        else {
            return 0;
        }
    }*/

    /*@Override
    public int compare(Item item1, Item item2){
        return item1.price - item2.price;
        /* Если положительный результат => первый товар дороже второго.
 Если ноль => цены равны.
 Если отрицательный результат => первый товар дешевле второго. */

    @Override
    public int compare(Item item1, Item item2) {
        // используем статический метод compare(Integer, Integer) из класса Integer
        return Integer.compare(item1.price, item2.price);
    }
}
