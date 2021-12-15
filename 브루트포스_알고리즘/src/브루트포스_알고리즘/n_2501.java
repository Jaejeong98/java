package 브루트포스_알고리즘;

import java.util.*;

public class n_2501 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt()-1;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1; i<=Math.sqrt(n1); i++){
			if(n1%i==0) { 
				list.add(i);
				if((n1/i)!=i) list.add(n1/i);
			}
		}
		Collections.sort(list);
		System.out.println(list.size()-1<n2?0:list.get(n2));
	}
}
