package ť;

import java.util.*;

public class n_11866 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt(), n=sc.nextInt();
		Queue<Integer> queue=new LinkedList<>();
		System.out.print("<");
		for(int i=1; i<=k; i++)
			queue.add(i);
		while(queue.size()!=1) {
			for(int i=0; i<n-1; i++)
				queue.add(queue.poll());
			System.out.print(queue.poll()+", ");
		}
		System.out.print(queue.poll()+">");
	}
}