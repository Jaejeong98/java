package ±¸Çö2;

import java.io.*;

public class n_21866 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]= {100, 100, 200, 200, 300, 300, 400, 400, 500}, sum=0;
		String st[]=br.readLine().split(" ");
		for(int i=0; i<arr.length; i++) {
			int num=Integer.parseInt(st[i]);
			if(num>arr[i]) {
				System.out.println("hacker");
				return;
			}
			else
				sum+=num;
		}
		if(sum>=100)
			System.out.println("draw");
		else
			System.out.println("none");
	}
}
