package Activity3_3A;

import java.util.LinkedList;
import java.util.Queue;

public class Activty3_3a {

	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<>();
		q.add(44);
		q.add(55);
		q.add(66);
		q.add(77);
		q.add(88);
		//for(int i=0;i<q.size();i++)
		System.out.println("Queue:"+q);
		System.out.println("Size of Queue:"+q.size());
		System.out.println("Removed Element:"+q.remove());
		System.out.println("Peek at the first element after removal:"+q.peek());
		System.out.println("Size of Queue after removal of element:"+q.size());
		System.out.println("Queue after removal of element:"+q);
		
		
		
	}

}
