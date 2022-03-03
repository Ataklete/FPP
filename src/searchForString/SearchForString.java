package searchForString;

import java.util.Arrays;
import java.util.List;

public class SearchForString {
	
	private List<String> list;
	
	public SearchForString(List<String> list) {
		this.list = list;
	}
	
	public boolean search(String s) {
		
		  if (s == null)
	            return false;
	        if (list == null || list.size() == 0)
	            return false;
	        if (list.size() == 1)
	            return s.equals(list.get(0));
	        if (list.size() == 2)
	            return (s.equals(list.get(0)) || s.equals(list.get(1)));
	        return recurSearch(s, 0);
	}
	
	public boolean recurSearch(String s, int x) {
		int front = x;
		int rear = list.size()-1-front;

		if ( rear == front+1 ) {
            return (s.equals(list.get(front)) || s.equals(list.get(rear)));
        }
		if(rear!=front) {
			if( (list.get(front).equals(s) || list.get(rear).equals(s))) {
				return true;
			}
			 else {
			  return recurSearch(s, x + 1  );	
			}
			
		}
		else {
            return s.equals(list.get(x));
        } 
		}
	
     public static void main(String[] args) {
		List<String> str = Arrays.asList("Billy", "Steve","Ralph", "Susan", "Ati");
		SearchForString sfs = new SearchForString(str);
		System.out.println(sfs.search("man"));
		System.out.println(sfs.search("Billy")); //expect true
		System.out.println(sfs.search("Tom")); //expect false
	}

}
