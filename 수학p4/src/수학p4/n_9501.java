package ¼öÇÐp4;

import java.io.*;

public class n_9501 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int num1=Integer.parseInt(st[0]), num2=Integer.parseInt(st[1]), count=0;
			for(int j=0; j<num1; j++) {
				String[] st1=br.readLine().split(" ");
				if(num2<=Integer.parseInt(st1[0])*Integer.parseInt(st1[1])/Integer.parseInt(st1[2]))
					count++;
			}
			bw.write(count+"\n");
		}
		bw.flush();
		bw.close();
	}
}
