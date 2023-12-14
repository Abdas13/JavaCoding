package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AverageOfMovieReviews {
    public static void main(String[] args) {
        int r=0, m=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of reviewers");
        r = scan.nextInt();
        System.out.println("Enter the number of movies");
        m = scan.nextInt();
        int[][] movRev = new int[r][m];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < m ; j++) {
                movRev[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(movRev));
        List<Double> avgRev = new ArrayList<>();
        int sumReviewer=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < m; j++) {
                sumReviewer+=movRev[i][j];
            }
            avgRev.add((double)sumReviewer/m);
            sumReviewer =0;
        }
        System.out.println("The average review points of each reviewer is "+avgRev);

        List<Double> avgMov = new ArrayList<>();
        int sumMov = 0;
        int j = 0;
        while(j<m) {
            for (int i = 0; i < r; i++) {
                sumMov += movRev[i][j];
            }
            avgMov.add((double)sumMov/r);
            sumMov=0;
            j++;
        }
        System.out.println("The average review points of each Movie is "+avgMov);
        }
    }



