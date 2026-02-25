package iterators;

public class Main {
    public static void main(String[] args) {
        /*final ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(" ");
        list.add("World!");

        final Iterator<String> iterator;  // объявили объект iterator
        iterator = list.iterator();  // проинициализировали iterator через метод iterator()

        while (iterator.hasNext()){  // проверяем, есть ли следующий элемент в коллекции
            final String element  = iterator.next(); // возвращаем элемент
            System.out.println(element);
        }

        final Collection<String> colors = new ArrayList<>();
        colors.add("Жёлтый");
        colors.add("Красный");
        colors.add("Зелёный");
        System.out.println("Список содержит Зелёный: " + colors.contains("Зелёный"));

        colors.remove("Жёлтый");
        System.out.println(colors);
        System.out.println("Оставшееся количество элементов: " + colors.size());
        System.out.println("Коллекция пустая? " + colors.isEmpty());*/

        /*final Collection<String> colors1 = new ArrayList<>();
        colors1.add("Жёлтый");
        //colors1.add("Красный");

        final Collection<String> colorsAdditional = new ArrayList<>();
        colorsAdditional.add("Зелёный");
        colorsAdditional.add("Жёлтый");

        colors1.addAll(colorsAdditional);
        System.out.println(colors1);

        final Collection<String> greenAndRed = new ArrayList<>();
        greenAndRed.add("Зелёный");
        greenAndRed.add("Красный");
        System.out.println("Список содержит Зелёный и Красный: " + colors1.containsAll(greenAndRed));

        final Collection<String> yellowOnly = new ArrayList<>();
        yellowOnly.add("Жёлтый");
        colors1.removeAll(yellowOnly);
        System.out.println(colors1);

        System.out.println(Arrays.toString(colors1.toArray()));

        List<Long> list = new ArrayList<>(); // создание списка

        // добавление элементов в конец:
        list.add(0L);
        list.add(1L);
        list.add(2L);
        System.out.println(list); // список выглядит так - [0, 1, 2]

        // добавление элемента по индексу
        list.add(2, 22L); // 2L сдвигается вправо, и на его месте появится 22L
        System.out.println(list); // список стал таким - [0, 1, 22, 2]

        // вставка элемента в конец списка
        list.add(4, 4L);
        System.out.println(list); // обновлённый список - [0, 1, 22, 2, 4]

        // удаление элемента
        list.remove(4); // по индексу
        list.remove(2L); // по значению
        System.out.println(list); // получился список - [0, 1, 22]

        // получение и вывод элемента по индексу
        System.out.println(list.get(2)); // напечатали 22

        // замена элемента по индексу
        list.set(2, 33L);
        System.out.println(list); // последняя версия списка - [0, 1, 33]*/

        /*final List<String> cats = new ArrayList<>();

        cats.add("Маркиз");
        cats.add("Принцесса");
        cats.add("Пирожок");
        cats.add("Мурка");
        System.out.println(cats); // сейчас печатается [Маркиз, Принцесса, Пирожок, Мурка]

        cats.remove("Принцесса");
        cats.remove("Мурка");

        cats.add("Лев");*/

        /* cats.remove(1);
        cats.set(2, "Лев"); */

        /*System.out.println(cats);

        List<String> list = Arrays.asList("Astana", "Kostanay");

        String[] citiesArray = {"Astana" , "Kokshetau"};
        //Integer[] citiesArray = {5, 10};
        List<String> cities = Arrays.asList(citiesArray);

        System.out.println(list);
        System.out.println(cities);*/

        /*String[] citiesArray = {"Astana", "Almaty", "Kostanay"};
        // Создание и заполнение списка из массива:
        List<String> cities = List.of(citiesArray);
        System.out.println(cities);

        // Создание и заполнение списка из набора значений:
        List<String> otherCities = List.of("Amsterdam", "Tokyo", "Rym");
        System.out.println(otherCities);

        List<String> cities2 = Arrays.asList("Astana", "Almaty");
        List<String> cities3 = new ArrayList<>();

        System.out.println(cities.getClass());
        System.out.println(cities2.getClass());
        System.out.println(cities3.getClass());

        final String[] coffeeArray = {"Латте", "Капучино", "Эспрессо"};

        for (String c : coffeeArray){
            System.out.print(c + ", ");
        }
        System.out.println();

        //final List<String> coffeeList = Arrays.asList(coffeeArray);
        final List<String> coffeeList = List.of(coffeeArray);
        System.out.println(coffeeList);*/

        // начальная вместимость 10 элементов:
        /*ArrayList<String> arrayListWithDefaultCapacity = new ArrayList<>();

        // начальная вместимость 33 элемента:
        ArrayList<String> arrayListWithSetCapacity = new ArrayList<>(33); // передали 33 конструктор

        // фактический размер обоих списков — 0:
        System.out.println(arrayListWithDefaultCapacity.size());
        System.out.println(arrayListWithSetCapacity.size());*/

        /*List<Integer> numbers = new ArrayList<>(5);

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.addAll(numbers);
        System.out.println(numbers);*/

        final HandMadeArrayList<Integer> arr = new HandMadeArrayList<>();
    for (int i = 0; i < 2000; i++){
        arr.add(i);
    }
        System.out.println(arr.getSize());
    }
}