package labexam;

import java.util.Queue;

public class Exam {
	public static <E> void main(Strings[]args) {
		Queue<E> q = new LinkedList();
		for(int i = 0;i < 5;i++) {
			q.add(i);
			
		}
		System.out.println("Elements of queue " +q);
	}
	int removedelement = q.remove();
	System.out.println("removed element: " +removedelement);
	System.out.println("updated queue: " +q);
	int head = q.peek();
	System.out.println("head of queue:" +head);
	int size = q.size();
	System.out.println("Size of queue:" +size);

	
}
