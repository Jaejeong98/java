package ť;

import java.util.*;

public class n_1158 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt();
		Queue<Integer>queue=new LinkedList<>();
		for(int i=1; i<=n; i++)
			queue.add(i);
		System.out.print("<");
		while(!queue.isEmpty()) {
			for(int i=0; i<k-1; i++)
				queue.add(queue.poll());
			System.out.print(queue.poll());
			if(queue.size()!=0) System.out.print(", ");
		}
		System.out.println(">");
	}
}