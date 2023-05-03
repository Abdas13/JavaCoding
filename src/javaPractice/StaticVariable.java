package javaPractice;

public class StaticVariable {
    static  int a=100;
    int b=10;

    public static void main(String[] args) {
        StaticVariable t1=new StaticVariable();
        StaticVariable t2=new StaticVariable();

        t1.a=300;
        t2.b=200;

        System.out.println(t2.a);//300
        System.out.println(t1.b);//10

//        System.out.println(t2.b);
//        System.out.println(t1.a);
    }
}
