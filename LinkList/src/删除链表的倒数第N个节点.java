
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class 删除链表的倒数第N个节点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode lower = head;
        ListNode fast = lower;

        for(int i = 1;i <= n;i ++){
            fast = fast.next;
        }

        if(fast == null){
            head = head.next;
            return head;
        }

        fast = fast.next;
        while(fast != null){
            fast = fast.next;
            lower = lower.next;
        }

        ListNode p = lower.next;
        lower.next = p.next;
        p = null;
        return head;
    }
}