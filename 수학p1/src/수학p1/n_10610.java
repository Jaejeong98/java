package ¼öÇÐp1;

import java.util.*;

public class n_10610 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		int sum=0, arr[]=new int[num.length()];
		for(int i=0; i<num.length(); i++) {
			sum+=num.charAt(i)-'0';
			arr[i]=num.charAt(i)-'0';
		}
		Arrays.sort(arr);
		if(num.contains("0")&&sum%3==0) {
			for(int i=num.length()-1; i>=0; i--)
				System.out.print(arr[i]);
		}
		else
			System.out.println(-1);
    }
}
