package arrays;

public class MultipleArraysShape {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}
