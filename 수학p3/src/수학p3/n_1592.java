package ¼öÇĞp3;

import java.util.*;

public class n_1592 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt(), l=sc.nextInt(), num=1, count=0;
		int[] arr=new int[n+1];
		arr[1]=1;
		while(true) {
			if(arr[num]==m)break;
			if(arr[num]%2==1) num+=l;
			else num-=l;
			if(num>n)
				num%=n;
			else if(num<1)
				num+=n;
			arr[num]++;
			count++;
		}
		System.out.println(count);
	}
}
