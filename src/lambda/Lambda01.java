package lambda;

public class Lambda01 {
    public static void main(String[] args) {
        Calculator lambda1=(int x, int y) -> x+y;  // x+y means return x+y:   you should use {} if you use return keyword

        Calculator lambda2=(x,y)-> x-y;

        Calculator lambda3=(m,n) -> {return m*n; };

        System.out.println(lambda1.operation(10,20));
        System.out.println(lambda2.operation(10,20));
        System.out.println(lambda3.operation(10,20));

    }
}
@FunctionalInterface
interface Calculator{
    int operation(int number1, int number2);



}
