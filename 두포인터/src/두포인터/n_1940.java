package 두포인터;

import java.io.*;
import java.util.*;

public class n_1940 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), n=Integer.parseInt(br.readLine()), arr[]=new int[T];
		String st[]=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		int i=0, j=T-1, count=0;
		while(true) {
			if(i>=j)break;
			if(arr[i]+arr[j]==n) {
				i++; j--; count++;
			}else if(arr[i]+arr[j]>n)
				j--;
			else
				i++;
		}
		System.out.println(count);
	}
}