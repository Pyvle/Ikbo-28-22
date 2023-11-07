package Pr_11.Pr_11_2;

public class Main {
    public static void main(String[] args) {
        Students[] students = {
                new Students("Alice", 3.8),
                new Students("Bob", 3.9),
                new Students("Charlie", 3.5),
                new Students("David", 4.0),
                new Students("Eve", 3.7)
        };

        System.out.println("Before sorting:");
        for (Students student : students) {
            System.out.println(student);
        }

        SortingStudentsByGPA.quickSort(students, 0, students.length - 1, new SortingStudentsByGPA());

        System.out.println("\nAfter sorting by GPA (descending order):");
        for (Students student : students) {
            System.out.println(student);
        }
    }
}
