/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=0,c2=0;
        ListNode t=headA;
        while(t!=null){
            c1++;
            t=t.next;
        }
        t=headB;
        while(t!=null){
            c2++;
            t=t.next;
        }
        int len=0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if(c1>c2){
            for(int i=1;i<=Math.abs(c1-c2);i++){
            temp1=temp1.next;
        }
        }
        else {
            for(int j=1;j<=Math.abs(c1-c2);j++){
            temp2=temp2.next;
        }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}