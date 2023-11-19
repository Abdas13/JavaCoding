package leetCode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OccupyParkingProblem {

    public static void main(String[] args) {

        System.out.println(commonSpots());
    }
    public static int commonSpots(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many spots do you have?");
        int spots = scan.nextInt();
        scan.nextLine();
        System.out.println("What number of the spots were occupied yesterday?");
        String[] yesterdayOccupies = scan.nextLine().split(" ");

        System.out.println("What number of the spots were occupied today?");
        String[] todayOccupies = scan.nextLine().split(" ");
        int count = 0;
        for (int i = 0; i < spots; i++) {
            if (yesterdayOccupies[i].equals("C") && todayOccupies[i].equals("C"))
                count++;
        }
        return count;
    }
}
