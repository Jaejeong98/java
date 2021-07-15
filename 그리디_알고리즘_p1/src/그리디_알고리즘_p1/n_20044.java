package 그리디_알고리즘_p1;

import java.io.*;
import java.util.Arrays;

public class n_20044 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()),arr[]=new int[T*2],arr2[]=new int[T];
		String st[]=br.readLine().split(" ");
		for(int i=0; i<T*2; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		for(int i=0; i<T; i++)
			arr2[i]=arr[i]+arr[T*2-i-1];
		Arrays.sort(arr2);
		System.out.println(arr2[0]);
	}
}
