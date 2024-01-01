package leetCode.collections.linked_list;

import java.util.Stack;

public class Nodel {
    int val;
    Nodel next;
    Nodel(){
    }
    Nodel(int val){
        this.val = val;
    }
    Nodel(int val, Nodel next){
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString() {
        return "Nodel{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
        Nodel head = new Nodel(1);
        Nodel second = new Nodel(1);
        Nodel third = new Nodel(2);
        Nodel fourth = new Nodel(2);
        Nodel fifth = new Nodel(3);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

//        System.out.println(deleteDuplicates(head));
//        System.out.println(removeDupl(head));
        Nodel temp = removeDupl(head);
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }
    public static Nodel deleteDuplicates(Nodel head){
      if(head ==null) return null;
      Nodel curr = head;
      Stack<Nodel> st = new Stack<>();
      while (curr != null){
          if(st.isEmpty())
              st.push(curr);
          else{
              if(st.peek().val != curr.val){
                  st.push(curr);
              }
          }
          curr = curr.next;
      }
      Nodel newHead = null;
      while (!st.isEmpty()){
          Nodel temp = st.pop();
          temp.next = newHead;
          newHead = temp;
      }
      return newHead;
    }
    public static Nodel removeDupl(Nodel head){   //  1  1  2  2  2  3  3  4
        if (head == null) return null;
        Nodel dummyHead = new Nodel(-1);
        dummyHead.next = head;
        Nodel curr = head;
        Nodel prev = dummyHead;

        while (curr != null){
            if (curr.next != null && curr.val == curr.next.val){
                while (curr.next != null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                prev.next = curr;
                prev = curr;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
