package Pr_11.Pr_11_1;

public class Students implements Comparable<Students>{
    private int idNumber;
    private String name;

    public Students(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public int compareTo(Students s) {
        return Integer.compare(this.idNumber,s.idNumber);
    }

    public String toString() {
        return "Student{" +
                "iDNumber=" + idNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
