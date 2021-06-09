package ±¸Çö;

import java.io.*;

public class n_10801 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st1[]=br.readLine().split(" "), st2[]=br.readLine().split(" ");
		int count1=0, count2=0;
		for(int i=0; i<10; i++) {
			int num1=Integer.parseInt(st1[i]), num2=Integer.parseInt(st2[i]);
			if(num1>num2)count1++;
			else if(num1<num2) count2++;
		}
		if(count1==count2)
			System.out.println("D");
		else System.out.println(count1>count2?"A":"B");
	}
}
