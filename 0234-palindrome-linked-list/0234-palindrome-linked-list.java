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
    public boolean palindrome(ArrayList<Integer> arr){
        int left = 0;
        int right = arr.size()-1;
        while(left<right){
            if(!arr.get(left).equals(arr.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer>arr = new ArrayList<>();
        ListNode a = head;
        while(a!=null){
            arr.add(a.val);
            a=a.next;
        }
        return palindrome(arr);
    }
}