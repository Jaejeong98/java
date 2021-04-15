package ¼öÇÐ5p;

import java.io.*;

public class n_11109 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[]st=br.readLine().split(" ");
			int arr[]=new int[4];
			for(int j=0; j<4; j++)
				arr[j]=Integer.parseInt(st[j]);
			if(arr[0]+arr[1]*arr[3]>arr[1]*arr[2])
				bw.write("do not parallelize\n");
			else if(arr[0]+arr[1]*arr[3]<arr[1]*arr[2])
				bw.write("parallelize\n");
			else
				bw.write("does not matter\n");
		}
		bw.flush();
		bw.close();
	}
}
