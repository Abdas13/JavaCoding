package collections.questionKitchenItem;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        KitchenItem[] kitchenItems={new KitchenItem("fork",10), new KitchenItem("spoon",8),
                                    new KitchenItem("fork",10), new KitchenItem("knife",12),
                                    new KitchenItem("knife",12), new KitchenItem("spoon",8),
                                    new KitchenItem("fork",10)};

        Map<KitchenItem,Integer> itemsCount=new HashMap<>();
        for (KitchenItem item:kitchenItems) {
            if (!itemsCount.containsKey(item)){
                itemsCount.put(item,1);

            }else{
                int count=itemsCount.get(item);
                itemsCount.put(item,count++);
            }
            System.out.println(itemsCount.get(item));

        }
        System.out.println();
    }
}
