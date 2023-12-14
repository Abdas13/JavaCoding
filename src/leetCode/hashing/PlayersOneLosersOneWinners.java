package leetCode.hashing;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class PlayersOneLosersOneWinners {
    /*You are given an integer array matches where matches[i] = [winneri, loseri] indicates
    that the player winneri defeated player loseri in a match.
    Return a list answer of size 2 where:
   answer[0] is a list of all players that have not lost any matches.
   answer[1] is a list of all players that have lost exactly one match.
   The values in the two lists should be returned in increasing order.
Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
Output: [[1,2,10],[4,5,7,8]]
Explanation:
Players 1, 2, and 10 have not lost any matches.
Players 4, 5, 7, and 8 each have lost one match.
Players 3, 6, and 9 each have lost two matches.
Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].
     */
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        System.out.println(findWinnersAndOneLosers(matches));
        System.out.println(findWinnersAndOneLosers2(matches));
    }
    public static List<List<Integer>> findWinnersAndOneLosers(int[][] matches){  // required one more condition
        Set<Integer> zeroLoss = new HashSet<>(), oneLoss = new HashSet<>(), moreLosses = new HashSet<>();

        for(int[] match : matches){
            int winner = match[0];
            int loser = match[1];
            // add winner
            if(!oneLoss.contains(winner) && !moreLosses.contains(winner))
                zeroLoss.add(winner);

            if(zeroLoss.contains(loser)){
                zeroLoss.remove(loser);   // remove frome winners
                oneLoss.add(loser);       // then add into onelosers
            } else if (oneLoss.contains(loser)) {
                oneLoss.remove(loser);
                moreLosses.add(loser);
            } else if (moreLosses.contains(loser)) {
                continue;
            }else {
                oneLoss.add(loser);
            }
        }
        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());

        ans.get(0).addAll(zeroLoss);
        ans.get(1).addAll(oneLoss);
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));

        return ans;
    }
    public static List<List<Integer>> findWinnersAndOneLosers2(int[][] matches){
        Map<Integer, Integer> zeroLoss = new ConcurrentHashMap<>();
        Map<Integer, Integer> losses = new ConcurrentHashMap<>();

        for(int[] match:matches){
            int winner = match[0];
            int loser = match[1];
            zeroLoss.put(winner,zeroLoss.getOrDefault(winner,0)+1);
            losses.put(loser, losses.getOrDefault(loser,0)+1);
        }
        for (Map.Entry <Integer,Integer>loss:losses.entrySet()){
            if(zeroLoss.containsKey(loss.getKey())){
                zeroLoss.remove(loss.getKey());
            } else if (losses.get(loss.getKey())>1) {
                losses.remove(loss.getKey());
            }
        }
        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());

        ans.get(0).addAll(zeroLoss.keySet());
        ans.get(1).addAll(losses.keySet());
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));

        return ans;
    }
}
