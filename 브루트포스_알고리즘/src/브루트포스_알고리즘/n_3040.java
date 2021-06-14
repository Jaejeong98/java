package 브루트포스_알고리즘;

import java.io.*;

public class n_3040 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[]=new int[9], sum=0, n1=0, n2=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		for(int i = 0 ; i<arr.length-1;i++) {
			for(int j = i ; j < arr.length;j++) {
				if(sum-(arr[i]+arr[j])==100&&i!=j) {
					n1=i; n2=j;
					break;
				}
			}
		}
		for(int i = 0 ; i <arr.length;i++) {
			if(i == n1 || i == n2)
				continue;
			bw.write(arr[i]+"\n");
		}
		bw.flush();bw.close();
	}
}