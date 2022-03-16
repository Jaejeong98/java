package 두포인터;

import java.io.*;

public class n_1806 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st1[]=br.readLine().split(" "), st2[]=br.readLine().split(" ");
		int arr[]=new int[st2.length], s=0, e=0, answer_i=100001;
		for (int i=0; i<st2.length; i++)
			arr[i]=Integer.parseInt(st2[i]);
		long sum=arr[s];
		while(true) {
			if(sum>=Integer.parseInt(st1[1])) {
				answer_i=Math.min(answer_i, e-s+1);
				sum-=arr[s++];
			}else {
				if(e==Integer.parseInt(st1[0])-1) break;
				else sum+=arr[++e];
			}
		}
		System.out.print(answer_i<100001?answer_i:0);
	}
}
