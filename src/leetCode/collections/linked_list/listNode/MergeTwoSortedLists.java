package leetCode.collections.linked_list.listNode;
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(8);
        head.next = second;
        second.next = third;

        ListNode head2 = new ListNode(1);
        ListNode second2 = new ListNode(3);
        ListNode third2 = new ListNode(7);
        head2.next = second2;
        second2.next = third2;

        ListNode temp = mergeTwoLists(head, head2);

        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
//        System.out.println(temp);

//        ListNode tmp = mergeSorteds(head, head2);
//        System.out.println(tmp);
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;

        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
    public static ListNode mergeSorteds(ListNode p1, ListNode p2){
        ListNode preHead = new ListNode(-1);
        ListNode curr = preHead;

        while (p1!=null && p2!=null){
            if (p1.val <= p2.val){
                curr.next = p1;
                curr = curr.next;
                p1 = p1.next;
            }else{
                curr.next = p2;
                curr = curr.next;
                p2 = p2.next;
            }
        }
        if (p1 == null) curr.next = p2;
        if (p2 == null) curr.next = p1;
        return preHead.next;
    }

}
