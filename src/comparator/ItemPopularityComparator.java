package comparator;

import java.util.Comparator;

public class ItemPopularityComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2){
        return item1.popularity - item2.popularity;
    }
}
