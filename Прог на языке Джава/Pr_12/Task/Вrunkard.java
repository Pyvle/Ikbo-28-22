package Pr_12.Task;

import java.util.ArrayList;

public class Вrunkard {
    public static void main(String[] args) {
        int[] playar1 = new int[]{1,3,5,7,9};
        int[] playar2 = new int[]{2,4,6,8,0};

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        for(int i=0;i<5;i++) {
            first.add(playar1[i]);
            second.add(playar2[i]);
        }
        int moves = 0;
        while(moves<=106) {
            if (first.isEmpty()) {
                System.out.println("second " + moves);
                return;
            }
            if(second.isEmpty()) {
                System.out.println("first " + moves);
                return;
            }

            int card1 = first.remove(0);
            int card2 = second.remove(0);

            if((card1 == 0 && card2 ==9)) {
                first.add(card1);
                first.add(card2);
            } else if(card1 > card2 && (card1 !=9 && card2 !=0)) {
                first.add(card1);
                first.add(card2);
            }
            else {
                second.add(card1);
                second.add(card2);
            }
            moves++;
        }
        if (moves == 106) System.out.println("botva");
    }
}
