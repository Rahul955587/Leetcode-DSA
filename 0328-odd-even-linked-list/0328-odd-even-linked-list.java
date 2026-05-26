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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int arr[]=new int[c];
        int i=0;
         temp = head;
        while(temp != null){
            arr[i++] = temp.val;
            
            if(temp.next == null) break;
            temp = temp.next.next;
        }

        temp = head.next;
        while(temp != null){
            arr[i++] = temp.val;

            if(temp.next == null) break;
            temp = temp.next.next;
        }
        temp=head;
        for(int j=0;j<c;j++){
            temp.val=arr[j];
            temp=temp.next;
        }
        return head;
    }
}