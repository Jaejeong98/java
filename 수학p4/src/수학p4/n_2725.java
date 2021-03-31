package ¼öÇÐp4;

import java.io.*;

public class n_2725 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[][]=new int[1001][1001];
		for(int i=1; i<1001; i++) {
			for(int j=1; j<1001; j++)
				arr[i][j]=gcd(i, j);
		}
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine()), count=0;
			for(int j=1; j<=num; j++) {
				for(int k=1; k<=j; k++) {
					if(arr[j][k]==1)
						count++;
				}
			}
			bw.write((count+1)*2-1+"\n");
		}
		bw.flush();
		bw.close();
	}
}
