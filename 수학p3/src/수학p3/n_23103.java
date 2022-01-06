package ¼öÇÐp3;

import java.io.*;

public class n_23103 {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T*2], sum=0;
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			arr[i*2]=Integer.parseInt(st[0]);
			arr[i*2+1]=Integer.parseInt(st[1]);
		}
		for(int i=1; i<T; i++)
			sum+=Math.abs(arr[i*2]-arr[(i-1)*2])+Math.abs(arr[i*2+1]-arr[(i-1)*2+1]);
		System.out.print(sum);
	}
}
