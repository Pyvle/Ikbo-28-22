package Pr_10;

/*Дана последовательность натуральных чисел (одно число в строке),
        завершающаяся числом 0. Выведите все нечетные числа из этой
        последовательности, сохраняя их порядок.*/

import java.util.Scanner;

public class oddNumbers {
    public static void numbers() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 0) {
            return;
        } else if(a%2 == 0)
            System.out.println(a);
        numbers();
    }
    public static void main(String[] args) {
        numbers();
    }
}
