package questions100;

import DataStructure.*;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (l1 == null)
			return l1;
		if (l2 == null)
			return l2;

		ListNode result = null;
		ListNode cur1 = l1;
		ListNode cur2 = l2;
		int carry = 0;

		while (cur1 != null || cur2 != null) {

			int sum = 0;
			if(cur1 == null)
				sum = cur2.val + carry;
			else if(cur2 == null)
				sum = cur1.val + carry;
			else
				sum = cur1.val + cur2.val + carry;
			carry = sum/10;
			result = insertTail(result,sum%10);
			
			if (cur1 != null) {
				cur1 = cur1.next;
			}
			if (cur2 != null) {
				cur2 = cur2.next;
			}
		}
		
		if(carry > 0)
			result = insertTail(result,carry);
		
		return result;
	}

	public ListNode insertTail(ListNode l, int num) {
		ListNode cur = l;
		if (cur == null) {
			return new ListNode(num);
		}

		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = new ListNode(num);
		return l;
	}

}
