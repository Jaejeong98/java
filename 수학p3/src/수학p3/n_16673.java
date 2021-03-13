package ¼öÇÐp3;

import java.util.*;

public class n_16673 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt(), k=sc.nextInt(), p=sc.nextInt(), sum=0;
		for(int i=0; i<=c; i++) {
			sum+=(k+p*i)*i;
		}
		System.out.println(sum);
	}
}
