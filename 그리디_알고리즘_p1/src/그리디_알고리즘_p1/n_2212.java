package 그리디_알고리즘_p1;

import java.io.*;
import java.util.Arrays;

public class n_2212 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), num=Integer.parseInt(br.readLine());
		String st[]=br.readLine().split(" ");
		int arr[]=new int[T], arr2[]=new int[T-1], sum=0;
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		for(int i=1; i<T; i++)
			arr2[i-1]=arr[i]-arr[i-1];
		Arrays.sort(arr2);
		for(int i=0; i<T-num; i++)
			sum+=arr2[i];
		System.out.println(sum);
	}
}
