public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Alphabet", "Kolesnilova");
        Book book2 = new Book("Mathematical steps", "S.I.Volkov");

        System.out.println("Book 1:");
        book1.displayInfo();
        System.out.println();

        System.out.println("Book 2:");
        book2.displayInfo();
        System.out.println();

        System.out.println("Changing properties of Book 1:");
        book1.setTitle("New Title");
        book1.setAuthor("New Author");

        System.out.println("Updated Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
    }
}