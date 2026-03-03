public class randomEx {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        while(head != null && head.next != null) {
            if(head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return head;
    }
  }

  public static void main(String[] args) {
    // Example usage:
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(3);

    Solution solution = new randomEx().new Solution();
    ListNode result = solution.deleteDuplicates(head);

    // Print the resulting list
    while (result != null) {
        System.out.print(result.val + " ");
        result = result.next;
    }
  }
}
