package ¼öÇÐp6;

import java.io.*;

public class n_8932 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int sum=0;
			String[] st=br.readLine().split(" ");
			sum+=(int)(9.23076*Math.pow((26.7-Integer.parseInt(st[0])),1.835 ));
			sum+=(int)(4.99087*Math.pow((42.5-Integer.parseInt(st[3])),1.81 ));
			sum+=(int)(0.11193*Math.pow((254-Integer.parseInt(st[6])),1.88 )); 
			sum+=(int)(1.84523 * Math.pow((Integer.parseInt(st[1])-75), 1.348));
			sum+=(int)(56.0211 * Math.pow((Integer.parseInt(st[2])-1.5), 1.05));
			sum+=(int)(0.188807 * Math.pow((Integer.parseInt(st[4])-210), 1.41));
			sum+=(int)(15.9803 * Math.pow((Integer.parseInt(st[5])-3.8), 1.04));
			System.out.println(sum);
		}
	}
}
