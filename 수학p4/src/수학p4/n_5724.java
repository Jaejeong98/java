package ¼öÇÐp4;

import java.io.*;

public class n_5724 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true){
			int num=Integer.parseInt(br.readLine()), sum=0;
			if(num==0)
				break;
			while(num>0) {
				sum+=Math.pow(num, 2);
				num--;
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
