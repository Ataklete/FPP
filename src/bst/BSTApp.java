package bst;

public class BSTApp {
	
	Node root;
	
	public Node insert(Node node, int val) {
		if (node == null) {
			return createNewNode(val);
		}
	    if (val < node.data) {
	    	node.left = insert(node.left, val);
	    }else if (val > node.data) {
	    	node.right = insert(node.right, val);
	    }
	    return node;
		
	}
	public Node createNewNode(int k) {
		 Node a = new Node();
		 a.data = k;
		 a.left = null;
		 a.right = null;
		 return a;
	}
	
	public Node delete(Node node, int val) {
		if (node == null) {
			return null;
		}
		else if (val < node.data) {
			node.left = delete(node.left, val);
		}
		else if (val > node.data) {
			node.right = delete(node.right, val);
		}
		
		else { 
			if (node.left == null || node.right == null) {
			Node temp = null;
			     temp = node.left == null ? node.right : node.left;
			     
			     if (temp == null) {
			    	 return null;
			     }else {
			    	 return temp;
			     }
			}else {
				Node successor = getSuccessor(node);
				node.data = successor.data;
				node.right = delete(node.right, 4);
				
			}
		}
		return node;
		
	}
	
	public Node getSuccessor(Node node) {
		if (node == null ) {
			return null;
		}

			Node temp = node.right;
			while( temp.left != null) {
				temp = temp.left;
			}
			
		return temp;
	}
	
	public void inorder(Node node) {
		if (node == null) {
			return ;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	
	public void preorder(Node node) {
		
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}
	
	public void postorder(Node node) {
		if(node==null) {
			return;
		}
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}
	
	public boolean isPresent(Node node, int val) {
		if (node == null) {
			return false;
		}
		boolean isPresent = false;
		while(node!= null) {
		if (val < node.data) {
			node = node.left;
		}else if (val > node.data) {
			node = node.right;
		}else {
			isPresent = true;
			break;
		}
	}
		return isPresent;
	}
	public Node getParentNode(Node node, int val) {
		if (node == null) {
			return null;
		}
		Node getParent = null;
		while(node!= null) {
		if (val < node.data) {
			getParent = node;
			node = node.left;
		}else if (val > node.data) {
			getParent = node;
			node = node.right;
		}else {
				break;
		}
	}
		return node != null ? getParent : null;
	}
	
	@Override
	public String toString() {
		
		return "BSTApp [root=" + root + "]";
	}



	public class Node{
		int data;
		Node left;
		Node right;
		@Override
		public String toString() {
	
			return data + " " + left + " " + right;
	} 
	}		
		
	public static void main(String[] args) {
		BSTApp a = new BSTApp();
		Node root = null;
		root = a.insert(root, 8);
		root = a.insert(root, 3);
		root = a.insert(root, 6);
		root = a.insert(root, 10);
		root = a.insert(root, 4);
		root = a.insert(root, 7);
		root = a.insert(root, 1);
		root = a.insert(root, 14);
		root = a.insert(root, 13);
		
		System.out.println(root);
		
		System.out.println(" \n delition------------");
//		root = a.delete(root, 3);
		System.out.println(" \n inorder------------");
		a.inorder(root);
		System.out.println(" \n preorder------------");
		a.preorder(root);
		System.out.println(" \n postorder------------");
		a.postorder(root);
		System.out.println(" \n Searching node value------------");
		System.out.println(a.isPresent(root, 13));
		System.out.println(" \n Get parent node value------------");
		Node parentNode = a.getParentNode(root, 4);
		if(parentNode!=null) {
			System.out.println(parentNode.data);
		}else {
			System.out.println("parent does not exists ");
		}
	}

}
