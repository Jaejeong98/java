package 그리디_알고리즘_p1;

import java.io.*;

public class n_11047 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		int arr[]=new int[Integer.parseInt(st[0])], s = 0, result=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]<Integer.parseInt(st[1]))
				s=i;
		}
		int num=Integer.parseInt(st[1]);
		for(int i=s; i>=0; i--) {
			result+=num/arr[i];
			num%=arr[i];
		}
		System.out.println(result);
	}
}
