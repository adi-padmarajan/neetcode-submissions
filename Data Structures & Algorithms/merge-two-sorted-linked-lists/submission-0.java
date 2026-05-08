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
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode currentNode = list1;
        while(currentNode != null){
            list.add(currentNode.val);
            currentNode = currentNode.next;
        }
        currentNode = list2;
        while(currentNode != null){
            list.add(currentNode.val);
            currentNode = currentNode.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int i = 0; i < list.size(); i++){
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return dummy.next;
    }
}