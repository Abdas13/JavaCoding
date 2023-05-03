import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinSubstring {

    public static void main(String[] args) {
        SortedSet<String>set=new TreeSet<String>();

        String[] word={"karakalem","akle"};
        String[] word0=word[0].split("");

        set.add("karakalem");
        set.add("akle");

        Set<String> subset=set.tailSet("akle");
        System.out.println(subset);
    }

}
