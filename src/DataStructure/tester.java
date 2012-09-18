package DataStructure;

public class tester {
	public static void main(String[] args) {
		AddTwoNumbersRverse at = new AddTwoNumbersRverse();
		ListNode a = new ListNode(0);
		for (int i = 0; i < 3; i++)
			a = at.insertFront(a, i);

		printList(a);
		
		ListNode b = new ListNode(0);
		for (int i = 0; i < 4; i++)
			b = at.insertFront(b, i);
		
		printList(b);
		
		ListNode ln = at.addTwoNumbers(a, b);
		printList(ln);
		
		

	}

	public static void printList(ListNode ab) {
		while (ab != null) {
			if (ab.next != null) {
				System.out.print(ab.val + "->");
				ab = ab.next;
			} else {
				System.out.println(ab.val);
				break;
			}
		}
	}
}

