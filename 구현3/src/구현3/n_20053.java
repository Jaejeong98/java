package ±¸Çö3;

import java.io.*;
import java.util.Arrays;

public class n_20053 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int c=Integer.parseInt(br.readLine()), arr[]=new int[c];
			String st[]=br.readLine().split(" ");
			for(int j=0; j<c; j++)
				arr[j]=Integer.parseInt(st[j]);
			Arrays.sort(arr);
			bw.write(arr[0]+" "+arr[c-1]+"\n");
		}
		bw.flush();bw.close();
	}
}