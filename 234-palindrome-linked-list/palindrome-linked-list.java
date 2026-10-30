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
       ArrayList<Integer>list=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
        int x=temp.val;
        list.add(x);
        temp=temp.next;
       } 
       int l=0,r=list.size()-1;
       while(l<r){
        if(list.get(l)!=list.get(r))return false;
        l++;
        r--;
       }
       return true;
    }
}