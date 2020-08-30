package Activity3_3A;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3B {

	public static void main(String[] args) 
	{
		Deque<String> dq = new LinkedList<>();
		dq.add("Dog");
		dq.add("Lepord");
		dq.add("Tiger");
		dq.add("Lion");
		dq.add("Monkey");
		dq.add("Zebra");
		Iterator<String> i= dq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		System.out.println("\nSize of deque:"+dq.size());
		System.out.println("Peek at the head element: "+dq.peekFirst());
		System.out.println("Peek at the last element: "+dq.peekLast());
		System.out.println("Constains Wolf: "+dq.contains("Wolf"));
		
		System.out.println("\nRemove first element: "+dq.removeFirst());
		System.out.println("Remove last element: "+dq.removeLast());
		System.out.println("Size of deque after removal: "+dq.size());
		System.out.println("Deque after removal: "+dq);
		
		System.out.println("\nOffer: "+dq.offer("Wolf"));
		System.out.println("Offer first: "+dq.offerFirst("Deer"));
		System.out.println("Offer last: "+dq.offerLast("Girraffe"));
		System.out.println("Constains Wolf: "+dq.contains("Wolf"));
		System.out.println("Deque after offer: "+dq);
		System.out.println("Size of deque after offer: "+dq.size());
		System.out.println("\nPoll: "+dq.poll());
		System.out.println("Poll first: "+dq.pollFirst());
		System.out.println("Poll last: "+dq.pollLast());
		System.out.println("Deque after poll: "+dq);
		System.out.println("Size of deque after poll: "+dq.size());
	}

}
