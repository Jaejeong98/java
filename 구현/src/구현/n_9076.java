package ±¸Çö;

import java.io.*;
import java.util.Arrays;

public class n_9076 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String[] st=br.readLine().split(" ");
			int arr[]=new int[st.length];
			for(int j=0; j<st.length; j++)
				arr[j]=Integer.parseInt(st[j]);
			Arrays.sort(arr);
			if(arr[4]-arr[1]>=4) bw.write("KIN\n");
			else bw.write(arr[1]+arr[2]+arr[3]+"\n");
		}
		bw.flush();bw.close();
	}
}
