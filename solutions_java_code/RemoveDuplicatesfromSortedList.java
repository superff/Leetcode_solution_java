package questions100;
import DataStructure.*;

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
		if (head == null || head.next == null)
			return head;

		ListNode prev = head;
		ListNode nextNode = head.next;

		while (nextNode != null) {
			if (nextNode.val != prev.val) {
				prev = nextNode;
			} else {
				prev.next = nextNode.next;
			}
			nextNode = nextNode.next;
		}
		return head;	                                 
    }
}
