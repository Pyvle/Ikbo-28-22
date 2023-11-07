package Pr_11.Pr_11_2;

public class Students {
    private double gpa;
    private String name;

    public Students(String name, double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }
}
