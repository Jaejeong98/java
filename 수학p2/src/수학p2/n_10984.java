package ¼öÇÐp2;

import java.io.*;

public class n_10984 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int n=Integer.parseInt(br.readLine()), sum_1=0;
			double sum_2=0;
			for(int j=0; j<n; j++) {
				String[] st=br.readLine().split(" ");
				int n1=Integer.parseInt(st[0]);
				double n2=Double.parseDouble(st[1]);
				sum_1+=n1;
				sum_2+=n1*n2;
			}
			bw.write(sum_1+" "+String.format("%.1f",sum_2/sum_1)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
