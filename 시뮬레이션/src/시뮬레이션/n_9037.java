package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.io.*;
import java.util.Arrays;

public class n_9037 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T; i++) {
			int n=Integer.parseInt(br.readLine()), arr[]=new int[n],arr2[]=new int[n], count=0;
			String st[]=br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				arr[j]=Integer.parseInt(st[j]);
				if(arr[j]%2==1) arr[j]++;
			}
			while(true) {
				int arr_c[]=Arrays.copyOf(arr, arr.length);
				Arrays.sort(arr_c);
				if(arr_c[0]==arr_c[n-1]) break;
				for(int j=0; j<n; j++) {
					arr2[j]=arr[j]/2;
					arr[j]/=2;
				}
				for(int j=0; j<n; j++) {
					if(j==0) arr[j]+=arr2[n-1];
					else arr[j]+=arr2[j-1];
					if(arr[j]%2==1)arr[j]++;
				}
				count++;
			}
			bw.write(count+"\n");
		}
		bw.flush();bw.close();
	}
}