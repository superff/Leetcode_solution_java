package questions100;

import others.*;

public class RemoveDuplicatesfromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (head == null || head.next == null)
			return head;

		ListNode prev = head;
		ListNode nextNode = head.next;
		ListNode advance = null;

		while (nextNode != null) {
			if (nextNode.val != prev.val) {
				if (prev.next != nextNode) {
					if (advance == null) {
						head = nextNode;
					} else {
						advance.next = nextNode;
					}
				} else {
					advance = prev;
				}
				prev = nextNode;
			}
			nextNode = nextNode.next;
		}
		
		if(prev.next != null)
		{
			if (advance == null) {
				head = nextNode;
			} else {
				advance.next = nextNode;
			}
		}
		return head;
	}
}
