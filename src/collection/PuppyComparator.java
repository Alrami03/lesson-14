package collection;

import java.util.Comparator;

public class PuppyComparator implements Comparator<Puppy> {
    @Override
    public int compare(Puppy puppy1, Puppy puppy2){
        return String.CASE_INSENSITIVE_ORDER.compare(puppy1.name, puppy2.name);
    }
}
