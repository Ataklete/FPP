package doublylinklist;



public class DoublLinkList {
	
	private Node head;
	
	
	
	public DoublLinkList() {
	
		head = new Node();
	}

	public void add(String item) {
		Node n = new Node();
		n.data = item;
		Node temp = head;
		
		if (temp.next != null) {
		
		    if (item.compareTo(temp.next.data)<1) {
					n.next = temp.next;
					temp.next.prev = n;
					n.prev = temp;
					temp.next = n;
				} else {
					 temp = temp.next;
					n.next = temp.next;
					n.prev = temp;
					temp.next = n;
					if (n.next!=null)
					temp.next.prev = n;
				}
		} else {
			head.next = n;
			n.next = null;
			n.prev = head;
		}
	}
	
	public void last(String item) {
		Node last = new Node();
		last.data = item;
		Node temp = head;
		while(temp.next!= null) {
			temp = temp.next;
		}
		temp.next = last;
		last.prev = temp;
//		last.next = null;
	}
	
	public String toString() {
		String str = "";
		Node temp = head;
		while(temp!= null) {
			str = str + temp.data + "->";
			temp = temp.next;
		}
		return str;
	}
  
	public class Node{
		Node next;
		Node prev;
		String data;
		
	
	}
	
	public static void main(String[] args) {
		
		DoublLinkList a = new DoublLinkList();
		
		a.last("saba");
		a.add("Ati");
		a.add("Joseph");
		a.add("Henok");
		a.add("Helen");
		a.add("sabadugna");
		a.add("abel");
		a.last("great");
		a.last("Mario");
		
		System.out.println(a);
	}

}
