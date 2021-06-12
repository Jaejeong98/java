package 그리디_알고리즘_p1;

import java.io.*;
import java.util.Arrays;

public class n_9237 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T], num=0;
		String st[]=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]+(arr.length-i)>num)
				num=arr[i]+(arr.length-i);
		}
		System.out.println(num+1);
	}
}