package ±‚«œ«–;

import java.io.*;

public class n_11758 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[6];
		for(int i=0; i<3; i++) {
			String st[]=br.readLine().split(" ");
			arr[i*2]=Integer.parseInt(st[0]);
			arr[i*2+1]=Integer.parseInt(st[1]);
		}
		int result=(arr[0]*arr[3]+arr[2]*arr[5]+arr[4]*arr[1])-(arr[0]*arr[5]+arr[2]*arr[1]+arr[4]*arr[3]);
		if(result>0)
			System.out.println(1);
		else if(result==0)
			System.out.println(0);
		else
			System.out.println(-1);
	}
}