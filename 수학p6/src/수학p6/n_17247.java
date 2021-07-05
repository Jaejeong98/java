package ¼öÇÐp6;

import java.io.*;

public class n_17247 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "), result=new String();
		int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]), arr[][]=new int[n1][n2];
		for(int i=0; i<n1; i++) {
			String str[]=br.readLine().split(" ");
			for(int j=0; j<n2; j++) {
				arr[i][j]=Integer.parseInt(str[j]);
				if(arr[i][j]==1)
					result+=i+" "+j+" ";
			}
		}
		String a[]=result.split(" ");
		System.out.println(Math.abs(Integer.parseInt(a[0])-Integer.parseInt(a[2]))+
				Math.abs(Integer.parseInt(a[1])-Integer.parseInt(a[3])));
	}
}