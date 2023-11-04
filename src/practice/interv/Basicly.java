package practice.interv;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Basicly {


    public static List<Temp> qualified(List<Temp> temps, String qualifier){

        List<Temp> qualified = new ArrayList<>();

        String[] infos = qualifier.split("|");
        return null;

    }
    private static List<Temp> prepare(List<Temp> temps, String modified ){

        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        List<Temp> filtered = new ArrayList<>();

        for (Temp temp:temps) {
            String matDate = temp.getMaturityDate();
        }
        // complete
        return filtered;
    }
}
