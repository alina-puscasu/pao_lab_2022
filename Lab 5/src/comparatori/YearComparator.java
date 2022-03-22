package comparatori;

import java.util.Comparator;

public class YearComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getYear() - o2.getYear();

        // in case of equality, sort by Name
        if (result != 0)
            return result;
        else
            return o1.getName().compareTo(o2.getName());
    }
}
