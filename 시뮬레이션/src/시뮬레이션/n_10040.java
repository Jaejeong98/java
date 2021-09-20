package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.io.*;

public class n_10040 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]), max=0, c=0;
		int[] arr=new int[n1], arr2=new int[n1];
		for(int i=0;i<n1; i++)
			arr[i]=Integer.parseInt(br.readLine());
		for(int i=0; i<n2; i++) {
			int n=Integer.parseInt(br.readLine());
			for(int j=0; j<n1; j++) {
				if(arr[j]<=n) {arr2[j]++; break;}
			}
		}
		for(int i=0; i<n1; i++) {
			if(arr2[i]>max) {
				max=arr2[i];
				c=i+1;
			}
		}
		System.out.println(c);
	}
}