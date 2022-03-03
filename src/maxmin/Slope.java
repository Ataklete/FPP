package maxmin;

public class Slope {
	
	
public static void main(String[] args) {
		
		
		int array[] = {2, -5, -21, 3, 8, 18, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		
		System.out.println(slope(array));
	  }
	 
	  
	  public static double slope(int[] arrayofInts){ 
		  
	    double max = arrayofInts[0];
	    double maxIndex = 0;
	    double min = arrayofInts[0];
	    double minIndex = 0;
	    for(int i=1;i < arrayofInts.length;i++){ 
	      if(arrayofInts[i] > max){ 
	         max = arrayofInts[i];
	         maxIndex=i;
	      }
	      if(arrayofInts[i] < min){ 
		        min = arrayofInts[i]; 
		        minIndex = i;
		  }
	    }
	    return (max-min)/(maxIndex-minIndex); 
	  }
	 
}
