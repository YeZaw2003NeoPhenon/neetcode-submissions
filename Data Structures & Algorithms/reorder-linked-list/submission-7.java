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

        List<ListNode> node_list = new ArrayList<>();
        ListNode curNode = head;

        while(curNode != null){
            node_list.add(curNode);
            curNode = curNode.next;
        }

        int left = 0;

        int right = node_list.size() - 1;

        while(left < right){

            node_list.get(left).next = node_list.get(right);
            left++;
            if(left >= right){
                break;
            }
            
            node_list.get(right).next = node_list.get(left);;
            right--;
        }

        node_list.get(left).next = null;
    }
}