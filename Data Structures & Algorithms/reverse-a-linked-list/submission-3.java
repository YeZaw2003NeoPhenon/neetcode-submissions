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

        // List<Integer> node_list = new ArrayList<>();

        int cnt = 0;
        ListNode currNode = head;

        while(currNode != null){
            cnt++;
            currNode = currNode.next;
        }

        int[] node_list = new int[cnt];
        currNode = head;
        for(int i = 0; i < cnt; ++i){
             node_list[i] = currNode.val;
             currNode = currNode.next; 
        }

        if(node_list.length == 0) return null;

        ListNode newHead = new ListNode(node_list[node_list.length - 1]);
        ListNode currentNode = newHead;


        for(int i = node_list.length - 2 ; i >= 0; --i){
         currentNode.next = new ListNode(node_list[i]);
         currentNode = currentNode.next;
        }

        return newHead;
    }
}
