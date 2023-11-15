package hackerrank.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GridChallenge {
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>(List.of("ebacd","fghij", "olmkn","trpqs", "xywuv"));

//        System.out.println(gridChallenge(grid));
        System.out.println(gridChallenge2(grid));
    }
    public static String gridChallenge(List<String> grid){
        char[][] gridArr = new char[grid.size()][grid.get(0).length()];
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).length(); j++) {
                gridArr[i][j]=grid.get(i).charAt(j);
            }

        }
        for (char[] ch:gridArr) {
            Arrays.sort(ch);
        }
        for (int i = 0; i < gridArr.length-1; i++) {
            for (int j = 0; j < gridArr[i].length; j++) {
                if (gridArr[i][j]>gridArr[i+1][j])
                    return "NO";
            }
        }
//        System.out.println(Arrays.deepToString(gridArr));
        return "YES";

    }
    public static String gridChallenge2(List<String> grid){

        return "";


    }

}
