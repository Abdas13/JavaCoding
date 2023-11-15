package string;

public class Constructor {

    static  String str;

    public void Consructor(){
        System.out.println("AA");
        str = "bb";
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(str);
    }
}
