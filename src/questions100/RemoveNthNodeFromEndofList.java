package questions100;
import DataStructure.*;

public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null)
        	return null;
        if(head.next == null && n == 1)
        	return null;
		
		ListNode slow = head;
        ListNode fast = head;
        
        for(int i = 0;i< n;i++)
        {
        	fast = fast.next;
        }
        
        if(fast == null)
        {
        	return slow.next;
        }
        
        while(fast.next != null)
        {
        	slow = slow.next;
        	fast = fast.next;
        }

        slow.next = slow.next.next;
        
        return head;
    }
}
