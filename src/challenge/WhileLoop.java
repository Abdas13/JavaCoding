package challenge;

public class WhileLoop {
    public static void main(String[] args) {
        int x=0;
        while (x++ <10){
        }
        String message=x>10 ? "RIGHT":"WRONG";
        System.out.println(message+", "+x);
    }
}
