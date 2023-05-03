package generics;

public class GenericMethod {
    public <T> T showItem(T item){
        System.out.println("The item is : "+item.toString());
        return item;
    }
}
