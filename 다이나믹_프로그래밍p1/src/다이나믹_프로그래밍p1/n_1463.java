package 다이나믹_프로그래밍p1;

import java.util.*;

public class n_1463 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num+1], result=0;
		arr[0]=arr[1]=0;
		for(int i=2; i<=num; i++) {
			arr[i]=arr[i-1]+1;
			if(i%2==0)
				arr[i]=Math.min(arr[i], arr[i/2]+1);
			if(i%3==0)
				arr[i]=Math.min(arr[i], arr[i/3]+1);
			
		}
		System.out.println(arr[num]);
	}
}