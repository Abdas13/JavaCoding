package practice.interv;
import practice.interv.Temp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TradeFilter {
    public static List<Temp> filterTradesByQualifier(List<Temp> tradeObjects, String qualifier) {
        List<Temp> qualifiedTrades = new ArrayList<>();

        // Split the qualifier string into individual conditions
        String[] conditions = qualifier.split("\\|");
        for (String condition : conditions) {
            condition = condition.trim();
            List<Temp> filteredTrades = applyCondition(tradeObjects, condition);
            qualifiedTrades.addAll(filteredTrades);
        }

        // Sort the qualified trades by maturity date in descending order
        qualifiedTrades.sort(Collections.reverseOrder());

        return qualifiedTrades;
    }

    private static List<Temp> applyCondition(List<Temp> tradeObjects, String condition) {
        List<Temp> filteredTrades = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (Temp trade : tradeObjects) {
            String maturityDateStr = trade.getMaturityDate();
            try {
                Date maturityDate = dateFormat.parse(maturityDateStr);
                if (evaluateCondition(maturityDate, condition)) {
                    filteredTrades.add(trade);
                }
            } catch (ParseException e) {
                // Handle parsing errors if necessary
            }
        }

        return filteredTrades;
    }

    private static boolean evaluateCondition(Date maturityDate, String condition) {
        // Implement the logic to evaluate the condition based on the provided qualifier
        // For simplicity, this example assumes the condition is in the format: <= 'yyyy-MM-dd' & >= 'yyyy-MM-dd'
        // You may need to enhance this method for more complex conditions.
        return true; // Modify this logic based on your requirements
    }
}
