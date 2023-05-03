package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tombala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 99;
        char give = '.';

        List<Integer> num1 = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            num1.add(i);
        }
        do {
            System.out.println("Please continue press y exit press n");
            give = scan.next().charAt(0);
            if (give == 'y') {
                int index = (int) ((Math.random() * num1.size()));
                System.out.println(num1.get(index));
                num1.remove(index);
            }
            if (give == 'n') {
                break;
            }

        } while (true);


    }
}



