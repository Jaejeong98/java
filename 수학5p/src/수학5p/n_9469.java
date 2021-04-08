package ¼öÇÐ5p;

import java.io.*;

public class n_9469 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			double[] arr=new double[5];
			for(int j=0; j<5; j++)
				arr[j]=Double.parseDouble(st[j]);
			bw.write((int)arr[0]+" "+String.format("%.6f", (arr[1]/(arr[2]+arr[3]))*arr[4])+"\n");
		}
		bw.flush();
		bw.close();
	}
}