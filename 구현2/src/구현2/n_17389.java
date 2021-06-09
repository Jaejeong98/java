package ±¸Çö2;

import java.util.*;

public class n_17389 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), sum=0, count=0;
		String st[]=sc.next().split("");
		for(int i=0; i<st.length; i++) {
			if(st[i].equals("O")) {
				sum+=(i+1+count);
				count++;
			}
			else
				count=0;
		}
		System.out.println(sum);
	}
}