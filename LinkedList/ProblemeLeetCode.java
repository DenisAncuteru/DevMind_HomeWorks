package LinkedList;

public class ProblemeLeetCode {
//    Remove Duplicates from sorted list
//
//     class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//     ListNode it = head;
//     while (it != null && it.next != null){
//     if(it.val == it.next.val){
//     it.next = it.next.next;
//     }
//     else{
//     it = it.next;
//     }
//     }
//
//     return head;
//     }

    /** ROTATE LIST

     public ListNode rotateRight(ListNode head, int k) {

     if (head == null || head.next == null ) {
     return head;
     }
     int counter = 1;
     ListNode aux = head;
     ListNode lastElement = head;
     ListNode previous = head;

     while(aux.next != null){
     aux = aux.next;
     counter++;
     }

     k = k % counter;

     if(k == 0){
     return head;
     } else {

     while( k != 0) {
     while(lastElement.next != null){
     previous = lastElement;
     lastElement = lastElement.next;
     }
     previous.next = null;
     lastElement.next = head;
     head = lastElement;
     k--;
     }
     }
     return head;

     }
     }
     */

    /**
     Merge Two Sorted Lists

     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

     if (l1 == null) {
     return l2;
     }
     if (l2 == null) {
     return l1;
     }


     ListNode resultedList = new ListNode();
     ListNode previous = resultedList;

     while(l1 != null && l2 != null){

     if(l1.val <= l2.val){
     previous.next = l1;
     l1 = l1.next;

     }else{
     previous.next = l2;
     l2 = l2.next;
     }
     // previous = previous.next;
     }
     if (l1 != null) {
     previous.next = l1;
     }
     if (l2 != null) {
     previous.next = l2;
     }

     return resultedList.next;
     }
     }
     */
}