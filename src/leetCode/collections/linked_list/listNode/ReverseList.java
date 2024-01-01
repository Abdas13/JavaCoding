package leetCode.collections.linked_list.listNode;

import java.util.Stack;

public class ReverseList {

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

        ListNode temp = rev2(head);
        while (temp!=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }

    }
    public static ListNode reverse(ListNode head){

        Stack<Integer> st = new Stack<>();
        while (head!=null){
            st.push(head.val);
            head = head.next;
        }
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while (!st.isEmpty()){
            temp.next = new ListNode(st.pop());
            temp = temp.next;
        }
        return dummy.next;
    }
    public static ListNode rev2(ListNode head){
        ListNode curr = head, n = head;
        ListNode prev = null;

        while (curr!=null){
            n = curr.next;
            curr.next =prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }
}
