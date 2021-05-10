package 그리디_알고리즘_p1;

import java.io.*;
import java.util.*;

public class n_11399 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), sum=0;
		int[] arr=new int[T], arr2=new int[T];
		String[] st=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		arr2[0]=arr[0];
		for(int i=1; i<T; i++) {
			arr2[i]=arr2[i-1]+arr[i];
		}
		for(int i=0; i<T; i++)
			sum+=arr2[i];
		System.out.println(sum);
	}
}
