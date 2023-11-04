package leetCode.strings;

import java.util.*;

public class TransactionsInLogs {

    public static void main(String[] args) {
        String[] logs = {"1 2 50","1 7 70","1 3 20","2 2 17"}; // first two s are id s (sender_user_id, recipient_user_id, transaction_number)
        int threshold=2;  // the id s which are used more than or equal to threshold
        System.out.println(processLogs(List.of(logs),threshold)); // [1,2]
    }
    public static List<String> processLogs(List<String> logs, int threshold){

        List<String > thresholds = new ArrayList<>();
        for (String str : logs) {
            String[] nums = str.split(" ");
            System.out.println(Arrays.toString(nums));
            for (int j = 0; j < 2; j++) {
                thresholds.add(nums[j]);
            }
        }
        // [1,2,1,7,1,3,2,2]
        List<String> mainThresholds = new ArrayList<>();
        Map<String, Integer> frequency = new HashMap<>();
        for (String num:thresholds) {
            frequency.put(num, frequency.getOrDefault(num,0)+1);
           // [(1,3),(2,3),(7,1),(3,1)]
        }
        for(Map.Entry<String, Integer>m: frequency.entrySet()) {
            if (m.getValue()>=threshold)
                mainThresholds.add(m.getKey());
        }
        System.out.println(frequency);
        System.out.println(thresholds);
        return mainThresholds;
        }
}
