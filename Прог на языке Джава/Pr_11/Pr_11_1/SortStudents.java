package Pr_11.Pr_11_1;

public class SortStudents {
    //сортировка вставками
    public static void insertionSort (Students[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++) {
            Students student = arr[i];
            int j = i-1;
            for(; j>=0 && arr[j].compareTo(student) > 0 ;j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = student;
        }
    }
    public static void main(String[] args) {
        Students[] students = {
                new Students(102, "Alice"),
                new Students(101, "Bob"),
                new Students(105, "Charlie"),
                new Students(103, "David"),
                new Students(104, "Eve")
        };
        System.out.println("Before sorting");
        for(Students student :students)
            System.out.println(student);

        insertionSort(students);

        System.out.println("After sorting");
        for(Students student :students)
            System.out.println(student);
    }
}
