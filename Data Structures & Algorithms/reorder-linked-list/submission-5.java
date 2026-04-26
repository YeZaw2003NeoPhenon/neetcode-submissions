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
    public void reorderList(ListNode head) {

        if( head == null || head.next == null ) return;

        ListNode tortoise = head;
        ListNode hare = head;

        while( hare != null && hare.next != null ){
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        ListNode secondNodeToReverse = tortoise.next;
        tortoise.next = null;

        ListNode firstNode = head;
        ListNode secondNode = reverseLinkedList(secondNodeToReverse);

        while( secondNode != null ){
            ListNode temp1 = firstNode.next;
            ListNode temp2 = secondNode.next;

            firstNode.next = secondNode;
            secondNode.next = temp1;
            firstNode = temp1;
            secondNode = temp2;
        }

    }
    public ListNode reverseLinkedList( ListNode currNode){
        Stack<ListNode> stack = new Stack<>();

        while(currNode != null){
            stack.push(currNode);
            currNode = currNode.next;
        }

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        while(!stack.isEmpty()){
            prev.next = stack.pop();
            prev = prev.next;
        }
        prev.next = null;

        return dummy.next;
    }
}