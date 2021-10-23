package ±¸Çö2;

import java.io.*;

public class n_10708 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int m=Integer.parseInt(br.readLine()), T=Integer.parseInt(br.readLine());
		int arr[]=new int[m+1];
		String st[]=br.readLine().split(" ");
		for(int i=0; i<T; i++) {
			String num[]=br.readLine().split(" ");
			for(int j=1; j<=m; j++) {
				if(st[i].equals(j)) arr[j]++;
				else {
					if(st[i].equals(num[j-1])) arr[j]++;
					else arr[Integer.parseInt(st[i])]++;
				}
			}
		}
		for(int i=1; i<=m; i++)
			System.out.println(arr[i]);
	}
}