import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        int[]a = new int[10];
        int[]b = new int[10];
        for (int i=0;i<10;i++) {
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        for (int i=0;i<10;i++) {
            Scanner sc = new Scanner(System.in);
            b[i] = sc.nextInt();
        }
        int[]c = new int[10];
        for (int i=0;i<10;i++) {
            c[i]=a[i]+b[i];
            System.out.print(c[i]+" ");
        }
        System.out.println();
        int t=0;
        while (t<10) {
            c[t] = a[t] + b[t];
            System.out.print(c[t] + " ");
            t++;
        }
        System.out.println();
        t=0;
        do {
            c[t] = a[t] + b[t];
            System.out.print(c[t] + " ");
            t++;
        } while (t<10);
    }
}
