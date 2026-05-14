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

        List<Integer> node_list = new ArrayList<>();

        ListNode currNode = head;
        
        while(currNode != null){
            node_list.add(currNode.val);
            currNode = currNode.next;
        }

        if(node_list.isEmpty()) return null;

        ListNode newHead = new ListNode(node_list.get(node_list.size() - 1));
        ListNode currentNode = newHead;


        for(int i = node_list.size() - 2 ; i >= 0; --i){
         currentNode.next = new ListNode(node_list.get(i));
         currentNode = currentNode.next;
        }

        return newHead;
    }
}
