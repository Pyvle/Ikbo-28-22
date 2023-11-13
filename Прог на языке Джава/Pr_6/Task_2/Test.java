package Task_2;

public class Test {
    public static void main(String[] args) {
        Dog pug = new Pug(12,"straight");
        System.out.println(pug);
        System.out.println("Age: " + pug.getAge());
        System.out.println("Breed: " + pug.getBreed());
        System.out.println("Tail: " + ((Pug)pug).getTail());
        pug.setPeculiarities("cute");
        System.out.println("Peculiarities: " + pug.getPeculiarities());
        Dog chi = new Chihuahua(90, "evil",true);
        System.out.println(chi);
        System.out.println("Breed: " + chi.getBreed());
    }
}
