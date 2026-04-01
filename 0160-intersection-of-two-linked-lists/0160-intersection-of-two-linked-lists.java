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
        ListNode tempA=headA;
        int l1=0;
        while(tempA!=null){
            l1++;
            tempA=tempA.next;
        }
        ListNode tempB=headB;
        int l2=0;
        while(tempB!=null){
            l2++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if(l1>l2){
            int n=l1-l2;
            for(int i=0;i<n;i++){
                tempA=tempA.next;
            }
        }
        else{
            int m=l2-l1;
            for(int j=0;j<m;j++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}