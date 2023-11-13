import java.util.Scanner;
public class Task_5 {
    public static int Fact(int k) {
        int a = 1;
        for (int i=1;i<=k;i++) {
            a*=i;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Fact(a));
    }
}
