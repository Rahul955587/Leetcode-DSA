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
    public ListNode insertionSortList(ListNode head) {
        if(head==null) return null;
        int c=0;
        ListNode t=head;
        while(t!=null){
            c++;
            t=t.next;
        }
        int arr[]=new int[c];
        int i=0;
        ListNode temp=head;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(arr);
        ListNode ans = new ListNode(arr[0]);
        ListNode curr = ans;
        for(int j=1;j<c;j++){
            curr.next=new ListNode(arr[j]);
            curr=curr.next;
        }
        return ans;
    }
}