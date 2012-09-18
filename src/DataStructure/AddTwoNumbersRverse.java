package DataStructure;
public class AddTwoNumbersRverse {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		
		int len1 = len(l1), len2 = len(l2);
		int lenMax = len1>len2?len1:len2;
		
		if(lenMax == len2)
			l1 = padList(l1,lenMax - len1);
		else
			l2 = padList(l2,lenMax - len2);
		
		PSum result = addHelper(l1, l2);
		if(result.carry > 0)
		{
			result.sum = insertFront(result.sum,result.carry);
		}
		return result.sum;
	}
	
	public ListNode insertFront(ListNode l, int num)
	{
		ListNode temp = new ListNode(num);
		temp.next = l;
		l = temp;
		return l;
	}
	
	
	public PSum addHelper(ListNode l1, ListNode l2)
	{
		if(l1 == null && l2 == null)
		{
			PSum result = new PSum();
			return result;
		}
		PSum result = addHelper(l1.next,l2.next);
		int sum = l1.val + l2.val + result.carry;
		result.carry = sum/10;
		result.sum = insertFront(result.sum,sum%10);
		return result;
	}

	public ListNode padList(ListNode l, int padding)
	{
		for(int i =0; i< padding; i++)
		{
			l = insertFront(l,0);
		}
		return l;
	}
	
	public int len(ListNode l)
	{
		int length = 0;
		for(ListNode current = l; current != null; current = current.next)
		{
			length++;
		}
		return length;
	}
}

class PSum{
	public ListNode sum = null;
	public int carry = 0;
	
}


