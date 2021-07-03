package 다이나믹_프로그래밍p1;

import java.io.*;

public class n_11052 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T+1],arr2[]=new int[T+1];
		String st[]=br.readLine().split(" ");
		for(int i=1; i<=T; i++)
			arr[i]=Integer.parseInt(st[i-1]);
		for (int i=1; i<=T; i++) {
			for (int j=1; j<=i; j++) {
				arr2[i] = Math.max(arr2[i], arr[j]+arr2[i-j]);
			}
		}
		System.out.println(arr2[T]);
	}
}
