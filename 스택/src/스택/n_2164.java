package Ω∫≈√;

import java.util.*;

public class n_2164 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		LinkedList<Integer>queue=new LinkedList<>();
		for(int i=1; i<=num; i++)
			queue.add(i);
		while(queue.size()!=1) {
			queue.removeFirst();
			queue.add(queue.removeFirst());
		}
		System.out.println(queue.get(0));
	}
}
