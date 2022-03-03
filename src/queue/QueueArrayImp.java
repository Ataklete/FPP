package queue;

import java.util.Arrays;

public class QueueArrayImp {
	
	private int[] arr = new int[10];
	private int size = 0;
	private int front = 0;
	private int rear = 0;
	
   public boolean isEmpty() {
	 return  size == 0;
   }
   
   public void resize() {
	   int[] temp = new int[arr.length * 2];
	   System.arraycopy(arr, front, temp, front, arr.length);
	   arr = temp;
   }  
   
   public int peek() {
	   if(isEmpty())
		   return 0;
	   else 
	   return arr[front];
   }
   
   public void enqueue(int x) {
	   if (rear == arr.length)  resize();
	   arr[rear] = x;
	   rear++;
	   size++;
   }
   
   public int dequeue() {
	   if (front == -1) throw new IllegalStateException("cannot be null");
	   int oldfront = arr[front] ;
	   front++;
	   size--;
	   return oldfront;
	   
   }
   
   
	
	@Override
public String toString() {
	return   Arrays.toString(arr);//+ ", size=" + size + ", front=" + front + ", rear=" + rear;
}

	public static void main(String[] args)   {
		
		QueueArrayImp q = new QueueArrayImp();
		for ( int i = 0; i<10; i++) {
		q.enqueue(i);
	     }
		for(int i = 0; i < 4; i ++)
			q.dequeue();
//		System.out.println(q.size());
		System.out.println(q.peek());
        System.out.println(q);
	}

}
