public class question {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
           ListNode dummy = new ListNode(-1);
           ListNode dp = dummy;
           dp.next = head;
           dp = dp.next;
           ListNode curr = head.next;
           while(curr != null){
             while(curr != null && curr.val == dp.val){
                 ListNode forw = curr.next;
                 curr.next = null;
                 curr = forw;
             }
               dp.next = curr;
               if(curr != null){ curr = curr.next;
                                dp = dp.next;}
           }
           return dummy.next;
           
       }
       public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr= head;
        while(curr != null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr=forw;
            
        }
        return prev;
        
    }
}
    
}
