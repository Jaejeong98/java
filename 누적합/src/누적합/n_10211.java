package ДЉРћЧе;

import java.io.*;
import java.util.Arrays;

public class n_10211 {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine()), dp[]=new int[num], arr[]=new int[num];
			String st[]=br.readLine().split(" ");
			for(int j=0; j<num; j++)
				arr[j]=Integer.parseInt(st[j]);
			dp[0]=arr[0];
			for(int j=1; j<num; j++)
				dp[j]=Math.max(dp[j-1]+arr[j],arr[j]);
			Arrays.sort(dp);
			bw.write(dp[num-1]+"\n");
		}
		bw.flush();bw.close();
	}
}
