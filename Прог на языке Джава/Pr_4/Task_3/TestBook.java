package Task_3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Alphabet", "Kolesnilova",1000);

        System.out.println("Book:");
        book.displayInfo();
        System.out.println();

        System.out.println("Changing properties of Book:");
        book.setTitle("New Title");
        book.setAuthor("New Author");
        book.setYear(2000);

        System.out.println("Updated Book:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
    }
}
