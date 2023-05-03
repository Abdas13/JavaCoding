package generics;

import java.util.ArrayList;

public class App {
    public static  void main(String[] args) {
        GenericMethod method=new GenericMethod();
        method.showItem("Hello Jans!");
        method.showItem(333);
        method.showItem('c');
        method.showItem(23.35);
        method.showItem(33.22f);
        System.out.println("Item is returned: "+method.showItem(888));

    }
}
