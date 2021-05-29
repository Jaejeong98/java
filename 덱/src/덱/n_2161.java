package µ¦;

import java.util.*;

public class n_2161 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1; i<=num; i++)
			queue.add(i);
		String st=new String();
		while(queue.size()!=1) {
			st+=queue.poll()+" ";
			queue.add(queue.poll());
		}
		System.out.println(st+queue.poll());
	}
}
