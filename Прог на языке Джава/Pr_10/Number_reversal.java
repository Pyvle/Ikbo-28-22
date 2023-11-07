package Pr_10;

/*Дано число n, десятичная запись которого не содержит нулей. Получите
        число, записанное теми же цифрами, но в противоположном порядке.*/

public class Number_reversal {
    public static int number_reversal(int n,int rN) {
        if(n<10){
            return rN*10+n;
        }
        int g;
        g = n % 10;
        rN = rN*10 + g;
        return number_reversal(n/10,rN);
    }
    public static void main(String[] args) {
        int n = 1234;
        int rN = number_reversal(n,0);
        System.out.println(rN);
    }

}
