package Pr_10;

/*Дана последовательность натуральных чисел (одно число в строке),
        завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой
        последовательности встречается число 1. Числа, идущие после двух нулей,
        необходимо игнорировать.*/

import java.util.Scanner;

public class NumberOfUnits {
    static void units() {
        Scanner sc = new Scanner(System.in);
        int n=0;
        boolean b = false;
        int g;
        while(true) {
            g = sc.nextInt();
            if (b && g == 0) {
                break;
            } else if(g == 1) {
                n++;
            } else if(g==0) {
                b=true;
            } else if(b && g!=0) {
                b=false;
            }
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        units();
    }
}
