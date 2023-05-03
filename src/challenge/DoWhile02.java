package challenge;

public class DoWhile02 {
    public static void main(String[] args) {
        int m=9, n=1, x=0;
        do {
            m--;
            n+=2;
            x+=m+n;

        }while (m>n);
        System.out.println(x);
    }
}
