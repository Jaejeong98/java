package ¼öÇÐp4;

import java.io.*;

public class n_14726 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		int[] arr=new int[16];
		for(int i=0; i<T; i++) {
			String num=br.readLine();
			int sum=0;
			for(int j=0; j<=15; j++)
				arr[j]=num.charAt(j)-'0';
			for(int k=0; k<16; k++) {
				if(k%2==0) {
					arr[k]*=2;
					if(arr[k]>=10) {
						arr[k]=arr[k]/10+arr[k]%10;
					}
				}
				sum+=arr[k];
			}
			if(sum%10==0)
				bw.write("T\n");
			else
				bw.write("F\n");
		}
		bw.flush();
		bw.close();
	}
}
