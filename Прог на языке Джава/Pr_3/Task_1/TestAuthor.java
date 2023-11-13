package Task_1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Pavl", "pavle@gmail.com", 'F');
        System.out.println("Name: "+ author.getName());
        System.out.println("Email: " + author.getEmail());
        author.setEmail("pavl@yandex.ru");
        System.out.println("Gender: " + author.getGender());
        System.out.println(author);
    }
}
