package leetCode.collections.linked_list;

public class RemoveElement {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        head.next = secondNode;
        secondNode.next = thirdNode;
        System.out.println(removeLinkedListElement(head, secondNode));
    }

    public static Node removeLinkedListElement(Node head, Node key) {
        Node current = head;
        while(current !=null && current.next!=null){
            current = current.next;
            if(current.next == key){
                current.next = current.next.next;
            }
        }
        return head;
    }
}
class Node {
    int value;

    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
    }
}
