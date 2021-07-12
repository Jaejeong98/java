package ±¸Çö2;

import java.io.*;

public class n_15784 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]), n3=Integer.parseInt(st[2]);
		int arr[][]=new int[n1+1][n1+1];
		for(int i=1; i<=n1;i++) {
			String str[]=br.readLine().split(" ");
			for(int j=1; j<=n1;j++)
				arr[i][j]=Integer.parseInt(str[j-1]);
		}
		boolean b=false;
		for(int i = 1; i <=n1;i++){
            if(arr[i][n3]> arr[n2][n3]) {
            	b=true;
            	break;
            }
        }
        for(int i = 1; i <= n1;i++){
            if(arr[n2][i] > arr[n2][n3]) {
            	b=true;
            	break;
            }
        }
		System.out.println(b?"ANGRY":"HAPPY");
	}
}
