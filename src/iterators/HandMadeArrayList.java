package iterators;

public class HandMadeArrayList<T> {
    private int size = 0;
    private Object[] elements;

    public HandMadeArrayList() {
        this.elements = new Object[10];
    }

    /**
     * Сначала проверяем, достиг ли размер массива вместимости.
     * Если достиг — увеличиваем вместимость, иначе сразу добавляем элемент
     */

    public void add(T newElement) {
        if (size == elements.length) {
            grow();
        } else {
            elements[size] = newElement;
            size++;
        }


    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Element with index " + index + " does not exist");
        }
        return (T) this.elements[index];
    }

    /**
     * Заменяем текущий массив элементов elements на новый с вместимостью +50%
     */
    private void grow() {
        //New array
        Object[] newArray = new Object[elements.length + elements.length / 2];

        // Допишите цикл, который копирует все элементы из массива elements в новый массив newArray
        // Копируем элементы из старого массива в новый

        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }

        // Возвращаемый новый массив
        this.elements = newArray;
    }

    public int getSize() {
        return size;
    }
}
