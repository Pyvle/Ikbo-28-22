package Pr_11.Pr_11_2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Students>{
    @Override
    public int compare(Students student1, Students student2) {
        return Double.compare(student2.getGpa(), student1.getGpa());
    }

    public static void quickSort(Students[] arr, int low, int high, Comparator<Students> comp) {
        if(low < high) {
            int pi = pertition(arr,low,high,comp);
            quickSort(arr,low,pi-1,comp);
            quickSort(arr,pi+1,high,comp);
        }
    }

    private static int pertition(Students[] arr, int low, int high, Comparator<Students> comp) {
        Students pivot = arr[high];
        int i=low-1;

        for(int j = low;j<high;j++) {
            if(comp.compare(arr[j],pivot)>0) {
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,high);
        return i+1;
    }

    private static void swap(Students[] arr, int i, int j) {
        Students temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
