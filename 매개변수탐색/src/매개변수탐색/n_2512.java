package 매개변수탐색;

import java.io.*;
import java.util.*;

public class n_2512 {
	public static void main(String[]args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		String st[]=br.readLine().split(" ");
		int max=Integer.parseInt(br.readLine()), sum=0;
		for(int i=0; i<T; i++) {
			arr[i]=Integer.parseInt(st[i]);
			sum+=arr[i];
		}
		Arrays.sort(arr);
		if(sum<=max)
			System.out.println(arr[T-1]);
		else {
			int avg=0;
			for(int i=0; i<T; i++) {
				if(arr[i]*(T-i)<max)
					max-=arr[i];
				else {
					avg=max/(T-i);
					break;
				}
			}
			System.out.println(avg);
		}
	}
}
