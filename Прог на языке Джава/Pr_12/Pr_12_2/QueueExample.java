package Pr_12.Pr_12_2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Создаем объект очереди на основе LinkedList
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Очередь: " + queue);


        System.out.println("Извлеченный элемент: " + queue.poll());

        System.out.println("Верхний элемент очереди: " + queue.peek());

        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Очередь пуста? " + queue.isEmpty());
    }
}