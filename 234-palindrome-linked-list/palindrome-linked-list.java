/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head1 = reverse(slow.next);
        ListNode head2 = head;

        return compare(head1,head2);   
    }

    public ListNode reverse(ListNode A){
        if(A == null || A.next == null){
            return A;
        }

        ListNode previous = null;
        ListNode current = A;
        ListNode temp = current.next;

        while(current != null){
            current.next = previous;

            previous = current;
            current = temp;

            if(temp != null){
                temp = temp.next;
            }
        }

        return previous;
    }

    public boolean compare(ListNode A, ListNode B){
        ListNode temp1 = A;
        ListNode temp2 = B;

        while(temp1 != null && temp2 != null){

            if(temp1.val != temp2.val){
                return false;
            }else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        return true;
    }
}