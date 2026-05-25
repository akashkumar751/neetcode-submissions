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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();

        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(list);

        ListNode curr = new ListNode(0);
        ListNode tmp = curr;
        for (int n : list) {
            tmp.next = new ListNode(n);
            tmp = tmp.next;
        }

        return curr.next;
    }
}