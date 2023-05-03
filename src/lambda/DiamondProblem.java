package lambda;

public class DiamondProblem implements Interface1, Interface2{
    @Override
    public void defaultTestMethod() {
        Interface1.super.defaultTestMethod();
        System.out.println("DiamondProblem default test method");
    }

    public static void main(String[] args) {


        Interface1 object1=new DiamondProblem();
        object1.defaultTestMethod();

        Interface2 object2=new DiamondProblem();
        object2.defaultTestMethod();
    }
}

interface Interface1{
    public default void defaultTestMethod(){
        System.out.println("interface1 default test method");
    }
}
interface Interface2{
    public default void defaultTestMethod(){
        System.out.println("interface2 default test method");
    }
}
