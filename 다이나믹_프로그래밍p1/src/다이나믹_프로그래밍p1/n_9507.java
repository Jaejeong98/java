package 다이나믹_프로그래밍p1;

import java.io.*;

public class n_9507 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		long arr[]=new long[68];
		arr[0]=arr[1]=1; arr[2]=2; arr[3]=4;
		for(int i=4; i<=67; i++)
			arr[i]=arr[i-1]+arr[i-2]+arr[i-3]+arr[i-4];
		for(int i=0; i<T; i++) {
			int n=Integer.parseInt(br.readLine());
			bw.write(arr[n]+"\n");
		}
		bw.flush();bw.close();
	}
}