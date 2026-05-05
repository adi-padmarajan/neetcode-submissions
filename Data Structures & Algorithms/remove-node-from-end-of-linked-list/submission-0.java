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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = listSize(head);
        int location = size - n + 1;
        if(location == 1){
            return head.next;
        }
        int counter = 1;
        ListNode currentNode = head;
        while(counter != (location - 1)){
            currentNode = currentNode.next;
            counter++;
        }
        currentNode.next = currentNode.next.next;
        return head;
    }

    public int listSize(ListNode head){
        int size = 0;
        ListNode currNode = head;
        while(currNode != null){
            size++; 
            currNode = currNode.next;
        }
        return size;
    }

}
