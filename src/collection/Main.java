package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String> emptyList = Collections.emptyList();
        final List<String> singletonList = Collections.singletonList("Hi");
        final List<String> nCopiesList = Collections.nCopies(5, "Java");

        System.out.println(emptyList);
        System.out.println(singletonList);
        System.out.println(nCopiesList);

        // immutableList — неизменяемый список
        final List<String> immutableList = List.of("Car", "Bear", "Cat");

        // mutableList уже можно изменить
        final ArrayList<String> mutableList = new ArrayList<>(immutableList);

        List<Long> listOfLongs = new ArrayList<>();
        listOfLongs.add(157478403L);
        listOfLongs.add(2450033L);
        listOfLongs.add(32039458858604L);

        System.out.println(listOfLongs);

        Collections.fill(listOfLongs, 5555555L);
        System.out.println(listOfLongs);

        List<Long> listOfSmallLongs = new ArrayList<>();
        listOfSmallLongs.add(1L);
        listOfSmallLongs.add(2L);
        listOfSmallLongs.add(3L);

        List<Long> listOfBigLongs = new ArrayList<>();
        listOfBigLongs.add(10000000000L);
        listOfBigLongs.add(20000000000L);
        listOfBigLongs.add(30000000000L);

        System.out.println(listOfSmallLongs);
        System.out.println(listOfBigLongs);

        Collections.copy(listOfSmallLongs, listOfBigLongs);

        System.out.println(listOfSmallLongs);
        System.out.println(listOfBigLongs);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Груша");

        System.out.println(fruits);

        Collections.sort(fruits, String.CASE_INSENSITIVE_ORDER);

        System.out.println(fruits);

        final var a = new Student("aaa", 30);
        final var b = new Student("aaa", 27);
        final var c = new Student("ccc", 33);
        final var d = new Student("ddd", 21);

        // создаём изменяемый список из неизменяемого List.of(..)
        final var list = new ArrayList<>(List.of(a, b, c, d));
        Collections.sort(list);
        System.out.println(list);

        // выводим минимальный элемент в соответствии с правилами сортировки Comparable<Student>
        // так как список предварительно отсортирован, минимальным будет первый элемент
        System.out.println(Collections.min(list));

        // теперь напечатаем максимальный элемент
        System.out.println(Collections.max(list));

        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(1);
        listOfIntegers.add(3);
        listOfIntegers.add(2);

        // класс Integer реализует Comparable
        System.out.println(Collections.max(listOfIntegers));
        System.out.println(Collections.min(listOfIntegers));

        /* Класс Puppy не реализует Comparable,
 поэтому для поиска минимума и максимума необходимо передать Comparator. */
        List<Puppy> puppies = new ArrayList<>();
        puppies.add(new Puppy("Boris", 2));
        puppies.add(new Puppy("Gaf", 3));
        puppies.add(new Puppy("Izol", 4));

        PuppyComparator comparator = new PuppyComparator();
        System.out.println(Collections.max(puppies, comparator));
        System.out.println(Collections.min(puppies, comparator));
    }
}
