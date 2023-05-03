public class Lambda02 {
    public static void main(String[] args) {

        Message lambda1= (String str) -> System.out.println(str);

        Message lambda2 = (str) -> System.out.println(str);

        Message lambda3 =str -> System.out.println(str);

        lambda1.printMessage("massage1");
        lambda2.printMessage("massage2");
        lambda3.printMessage("massage3");

    }
}
@FunctionalInterface
interface Message{
    public void printMessage(String msg);
}
