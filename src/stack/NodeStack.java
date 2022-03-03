package stack;


public class NodeStack {
	
	private Node top;
	
	public void push(String s) {
		Node newTop = new Node();
		newTop.data = s;
		newTop.next = top;
		top = newTop;
		
	}
	public String peek() {
		return (top==null) ? null : top.data;
	}
	
	public String pop() {
		if(top!= null) {
			String s = peek();
			top = top.next;
			return s;
		}
		else { 
			return null;
			}
		
	}
	
	public class Node{
		
		private String data;
		private Node next;
		
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	
	}
	

	@Override
	public String toString() {
        String str = "";
        Node ns = top;
        while (ns!=null) {
        	str = str + ns.data+ "->";
        	ns = ns.next;
        }
        return str;
	}
	
	public static void main(String[] args) {
		
      NodeStack n = new NodeStack();
      n.push("Saba");
      n.push("Ati");
      n.push("Henok");
      n.push("Helen");
      n.peek();
      n.pop();
      System.out.println(n);
      
      
	}

}
