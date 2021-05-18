package 그리디_알고리즘_p1;

import java.util.*;

public class n_5585 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=1000-sc.nextInt(), count=0;
		int[] arr= {500, 100, 50, 10, 5, 1};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>num)
				continue;
			else {
				count+=num/arr[i];
				num%=arr[i];
			}
		}
		System.out.println(count);
	}
}
