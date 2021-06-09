package ±¸Çö;

import java.io.*;

public class n_20205 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		int num1=Integer.parseInt(st[0]), num2=Integer.parseInt(st[1]);
		int[][] arr=new int[num1][num1];
		for(int i=0; i<num1; i++) {
			String st1[]=br.readLine().split(" ");
			for(int j=0; j<num1; j++)
				arr[i][j]=Integer.parseInt(st1[j]);
		}
		for(int i=0; i<num1*num2; i++) {
			for(int j=0; j<num1*num2; j++)
				System.out.print(arr[i/num2][j/num2]+" ");
			System.out.println("");
		}
	}
}