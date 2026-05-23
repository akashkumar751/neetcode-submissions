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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        List<Integer> list = new ArrayList<>();
        int n = 0;
        ListNode tmp = head;

        while(head!=null){
            list.add(head.val);
            n+=1;
            head = head.next;
        }
        ListNode ans = tmp;

        for(int i = n-1;i>=0;i--){
            tmp.val = list.get(i);
            tmp = tmp.next;
        }
         return ans;
    }
}
