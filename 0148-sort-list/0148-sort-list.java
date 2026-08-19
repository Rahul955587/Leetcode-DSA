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
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int arr[]=new int[c];
        ListNode tem=head;
        int i=0;
        while(tem!=null){
            arr[i++]=tem.val;
            tem=tem.next;
        }
        Arrays.sort(arr);
        ListNode r=new ListNode(arr[0]);
        ListNode curr=r;
        for(int j=1;j<arr.length;j++){
            curr.next=new ListNode(arr[j]);
            curr=curr.next;
        }
        return r;
    }
}