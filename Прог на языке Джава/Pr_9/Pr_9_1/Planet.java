package Pr_9.Pr_9_1;

public class Planet implements Nameable{
   private String name;

   public Planet(String name) {
       this.name = name;
   }

    @Override
    public String getName() {
        return name;
    }
}
