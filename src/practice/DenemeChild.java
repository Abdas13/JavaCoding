package practice;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DenemeChild implements Deneme{

    @Override
    public void come() {
    }
    public static int sum(int... a){

        int total=0;

        for (int i:a) {
            total+=i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,4,5));

        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            l1.add(i);
        }
        List<Integer>l2=l1.stream().filter((s)->s%2==0).collect(Collectors.toList());

        System.out.println(l2);

    }

}
