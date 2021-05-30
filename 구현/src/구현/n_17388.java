package ±¸Çö;

import java.util.*;

public class n_17388 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int S=sc.nextInt(), K=sc.nextInt(), H=sc.nextInt(), sum=S+K+H;
		if(sum>=100)
			System.out.println("OK");
		else {
			int num=Math.min(S, Math.min(K, H));
			if(num==S)
				System.out.println("Soongsil");
			else if(num==K)
				System.out.println("Korea");
			else
				System.out.println("Hanyang");
		}	
	}
}