package leetCode.collections;

import java.util.ArrayList;
import java.util.List;

public class MovieTime {

    public static void main(String[] args) {
        List<Integer> comedyReleaseTime = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> comedyDurationTime = new ArrayList<>(List.of(1, 1, 1));
        List<Integer> dramaReleaseTime = new ArrayList<>(List.of(3, 2, 5));
        List<Integer> dramaDurationTime = new ArrayList<>(List.of(10, 2, 4));
        /*
        Above one test case of HackerRank assessment for Amazon
        You will watch two movies. There are multiple alternatives to select the movies.
        1st comedy, 2nd drama
        1st comedy, 2nd comedy
        and so on
        when the first movie finishes, then you will select the second one which release time is appropriate.
        the output should be the earliest finish time.
         */
        // comedy => t=1 to t=2 then drama=> t=2 to t=4  ans=4
        // comedy => t=3 to t=4 then drama=> t=5 to t=9  ans=9
        System.out.println(movieTime(comedyReleaseTime,comedyDurationTime,dramaReleaseTime,dramaDurationTime));
    }
    public static int movieTime(List<Integer> comedyReleaseTime,
                                List<Integer> comedyDurationTime,
                                List<Integer> dramaReleaseTime,
                                List<Integer> dramaDurationTime){

        int firstMovie = Integer.MAX_VALUE;
        for(int i = 0; i < comedyReleaseTime.size(); i++){
            int t =  comedyReleaseTime.get(i) + comedyDurationTime.get(i);
            firstMovie = Math.min(firstMovie, t);
        }
        for(int i = 0; i < dramaReleaseTime.size(); i++){
            int t =  dramaReleaseTime.get(i) + dramaDurationTime.get(i);
            firstMovie = Math.min(firstMovie, t);
        }
        int second = Integer.MAX_VALUE;
        for(int i = 0; i < comedyReleaseTime.size(); i++){
            if(comedyReleaseTime.get(i)< firstMovie){
                continue;
            }
            int t =  comedyReleaseTime.get(i) + comedyDurationTime.get(i);
            second = Math.min(second, t);
        }
        for(int i = 0; i < dramaReleaseTime.size(); i++){
            if(dramaReleaseTime.get(i)< firstMovie){
                continue;
            }
            int t =  dramaReleaseTime.get(i) + dramaDurationTime.get(i);
            second = Math.min(second, t);
        }
        return second;
    }
}
