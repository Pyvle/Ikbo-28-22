package Pr_12.Pr_12_1;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Стек: " + stack);

        System.out.println("Извлеченный элемент: " + stack.pop());

        System.out.println("Верхний элемент стека: " + stack.peek());

        System.out.println("Размер стека: " + stack.size());

        System.out.println("Стек пустой? " + stack.isEmpty());
    }
}
