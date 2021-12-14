package 그리디_알고리즘_p1;

import java.io.*;

public class n_20115{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()),arr[]=new int[T], max=0;
		double s=0;
		String st[]=br.readLine().split(" ");
		for(int i=0; i<T;i++) {
			arr[i]=Integer.parseInt(st[i]);
			if(arr[i]>max) max=arr[i];
		}
		for(int i=0; i<T; i++) {
			if(max!=arr[i]) s+=(double)arr[i]/2;
		}
		s+=max;
		System.out.println(s);
	}
}