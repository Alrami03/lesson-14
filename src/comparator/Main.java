package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Shirt", 4500, 37));
        items.add(new Item("Socks", 55, 8));
        items.add(new Item("Hoodie", 1399, 74));
        items.add(new Item("Socks", 169, 19));

        System.out.println("Before sort:");
        System.out.println(items);

        // создаём объект-компаратор по цене
        ItemPriceComparator itemPriceComparator = new ItemPriceComparator();

        // применяем компаратор
        items.sort(itemPriceComparator);


        System.out.println("After sort:");
        System.out.println(items);

        // создаём объект-компаратор лексикографической сортировки
        ItemStringInSensitiveNameComparator comparator = new ItemStringInSensitiveNameComparator();

        // применяем компаратор
        items.sort(comparator);

        System.out.println("After sort:");
        System.out.println(items);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Груша");

        System.out.println("Before sort:");
        System.out.println(fruits);

        fruits.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("After sort:");
        System.out.println(fruits);

        // создаём обратный компаратор цен
        Comparator<Item> reversedItemPriceComparator = itemPriceComparator.reversed();

        // применяем его
        items.sort(reversedItemPriceComparator);
        System.out.println("After sort reverse:");
        System.out.println(items);

        RentedFilm film1 = new RentedFilm("Терминатор",
                new DateTime(20, 11, 2021, 10, 0, 0),
                new DateTime(27, 11, 2021, 23, 58, 58));

        System.out.println("Фильм Терминатор взят в аренду: " + film1.getTimeOfRent());
        System.out.println("Фильм должен быть вернут до: " + film1.getTimeOfReturn());

        DateTime today = new DateTime(27, 11, 2021, 23, 58, 59);

        System.out.println("Сегодняшнее число: " + today);

        DateTimeComparator comparator1 = new DateTimeComparator();
        boolean shouldAlreadyBeReturned = comparator1.compare(today, film1.getTimeOfReturn()) > 0;

        System.out.println("Прошло ли время возврата? " + (shouldAlreadyBeReturned ? "Yes!" : "No!"));
    }
}
