package ±¸Çö2;

import java.util.*;

public class n_20113 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), arr[]=new int[T+1], max=0, maxn=0;
		for(int i=1; i<=T; i++)
			arr[sc.nextInt()]++;
		boolean b=false;
		for(int i=1; i<=T; i++) {
			if(max<arr[i]) {
				max=arr[i]; maxn=i;
				b=false;
			}else if(max==arr[i])
				b=true;
		}
		System.out.println(b?"skipped":maxn);
	}
}