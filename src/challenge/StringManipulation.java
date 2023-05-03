package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringManipulation {
    public static void main(String[] args) {
        String word = "Today is Monday, and everybody was packed at home because of heavy snow.";
        String word1 = word.replaceAll("\\W", ""); //TodayisMondayandeverybodywaspackedathomebecauseofheavysnow
        String find = "Monday,";
        String change = "Thuesday";

        System.out.println("Word Length : " + word1.length());
        String word2 = word.replaceAll("[,]", "");
        String[] arr = word2.split(" ");
        System.out.println("word2 array" + Arrays.toString(arr));

        System.out.println("Sentence Length : " + Arrays.toString(arr).length());
        List<String> newList = new ArrayList<>();
        List<String> onlyY = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            newList.add(arr[i]);
            for (int j = 0; j < newList.size(); j++) {
                if (newList.get(j).equals(find)) {
                    newList.remove(j);
                    newList.add(j, change);
                }
            }
            for (int k = 0; k < newList.size() - 1; k++) {
                String onlyiY = newList.get(k);

                if (onlyiY.substring(onlyiY.length() - 2).equals("ay")) {
                    newList.remove(k);

                }

            }

        }
        System.out.println(newList);
    }
}

