package ¼öÇÐp6;

import java.io.*;

public class n_14182 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=0;
		while((num=Integer.parseInt(br.readLine()))!=0) {
			if(num<=1000000)
				bw.write(num+"\n");
			else if(num<=5000000)
				bw.write((int)(num*0.9)+"\n");
			else
				bw.write((int)(num*0.8)+"\n");
		}
		bw.flush();bw.close();
	}
}
