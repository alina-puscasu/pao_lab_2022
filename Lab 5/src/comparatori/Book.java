package comparatori;

import java.util.Arrays;

public class Book implements Comparable<Book> {

    private int year;
    private String name;
    private String author;

    public Book(int year, String name, String author) {
        this.year = year;
        this.name = name;
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public int compareTo(Book o) {
        /*
        * Returns:
        * - positive integer, if current object is greater than the specified object
        * - 0 if equals
        * - negative integer, if current object is less than the specified object
        * */
//        return o.year - this.year; // ordonare descrescatoare
        return this.year - o.year; // ordonare crescatoare
    }

    public static void main(String... args) {
        Book book1 = new Book(1920, "Pride and prejudice", "Jane Austen");
        Book book2 = new Book(1910, "Sense and sensibility", "Jane Austen");
        Book book3 = new Book(1935, "Aense and sensibility", "Jane Austen");
        Book book4 = new Book(1910, "Another book", "Jane Austen");

        Book[] books = new Book[]{book1, book2, book3, book4};

        // Using Comparable, natural ordering
        Arrays.sort(books);
        System.out.println("Using Comparable, natural ordering. Sort ASC by Year:");
        for(Book book: books) {
            System.out.println(book.getName() + "-" + book.getYear());
        }

        // Using Comparator - sort by name
        NameComparator nameComparator = new NameComparator();
        Arrays.sort(books, nameComparator);
        System.out.println("Using Comparator. Sort ASC by Name:");
        for(Book book: books) {
            System.out.println(book.getName() + "-" + book.getYear());
        }

        // Using Comparator - sort by year and in case of equality, sort by Author
        YearComparator yearComparator = new YearComparator();
        Arrays.sort(books, yearComparator);
        System.out.println("Using Comparator. Sort ASC by Year. Use Name criteria for sort in case of equality:");
        for(Book book: books) {
            System.out.println(book.getName() + "-" + book.getYear());
        }

    }
}
