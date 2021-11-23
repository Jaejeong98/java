package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.util.*;

public class n_14928 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), count=0;
		while(num!=1) {
			if(num%2==0) num/=2;
			else num=num*3+1;
			count++;
		}
		System.out.println(count+1);
	}
}