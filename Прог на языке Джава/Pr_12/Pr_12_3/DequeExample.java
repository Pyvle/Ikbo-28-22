package Pr_12.Pr_12_3;

import java.util.LinkedList;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addLast(5);

        System.out.println("Двусторонняя очередь: " + deque);

        System.out.println("Извлеченный элемент из начала: " + deque.removeFirst());
        System.out.println("Извлеченный элемент с конца: " + deque.removeLast());

        System.out.println("Верхний элемент очереди: " + deque.getFirst());
        System.out.println("Элемент с конца очереди: " + deque.getLast());

        System.out.println("Размер очереди: " + deque.size());

        System.out.println("Очередь пуста? " + deque.isEmpty());
    }
}