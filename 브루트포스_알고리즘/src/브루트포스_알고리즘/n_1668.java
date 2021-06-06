package 브루트포스_알고리즘;

import java.util.*;

public class n_1668 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), arr[]=new int[T];
		for(int i=0; i<T; i++)
			arr[i]=sc.nextInt();
		int left=arr[0], right=arr[T-1], lcount=1, rcount=1;
		for(int i=1; i<T; i++) {
			if(left<arr[i]) {
				lcount++;
				left=arr[i];
			}
		}
		for(int i=T-2; i>=0; i--) {
			if(right<arr[i]) {
				rcount++;
				right=arr[i];
			}
		}
		System.out.println(lcount+"\n"+rcount);
	}
}
