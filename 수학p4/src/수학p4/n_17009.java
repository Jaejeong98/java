package ¼öÇÐp4;

import java.io.*;

public class n_17009 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum_a=0, sum_b=0, j=3, k=3;
		for(int i=0; i<6; i++) {
			if(i<3) {
				sum_a+=Integer.parseInt(br.readLine())*j;
				j--;
			}
			else {
				sum_b+=Integer.parseInt(br.readLine())*k;
				k--;
			}
		}
		if(sum_a>sum_b)
			System.out.println("A");
		else if(sum_a<sum_b)
			System.out.println("B");
		else
			System.out.println("T");
	}
}
