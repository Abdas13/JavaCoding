package javaPractice;

public class NestedLoops01 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("i: "+i);
                System.out.println("j: "+j);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
            }
            System.out.println("# ");
        }
    }
}
