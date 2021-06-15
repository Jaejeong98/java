package 그리디_알고리즘_p1;

import java.io.*;
import java.util.*;

public class n_11508 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T], sum=0, count=0;
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for(int i=T-1;i>=0; i--) {
			count++;
			if(count%3==0) continue;
			else sum+=arr[i];
		}
		System.out.println(sum);
	}
}
