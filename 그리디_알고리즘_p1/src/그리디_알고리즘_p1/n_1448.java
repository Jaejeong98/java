package 그리디_알고리즘_p1;

import java.io.*;
import java.util.*;

public class n_1448 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		for(int i =0; i<T; i++)
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		int m=0;
		for(int i=T-1; i>=2; i--) {
			if(arr[i-1]+arr[i-2]>arr[i])
				m=Math.max(m, arr[i-1]+arr[i-2]+arr[i]);
		}
		System.out.print(m==0? -1:m);
	}
}
