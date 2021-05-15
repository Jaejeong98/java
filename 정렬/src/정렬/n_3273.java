package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_3273 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		String[] st=br.readLine().split(" ");
		int sum=Integer.parseInt(br.readLine()), s=0, e=T-1, count=0;
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		while(s<e) {
			int rsum=arr[s]+arr[e];
			if(sum==rsum)count++;
			if(sum>=rsum)s++;
			else e--;
		}
		System.out.println(count);
	}
}
