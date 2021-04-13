package ¼öÇÐ5p;

import java.io.*;

public class n_17203 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st1=br.readLine().split(" "), st2=br.readLine().split(" ");
		for(int i=0; i<Integer.parseInt(st1[1]); i++) {
			String[] st3=br.readLine().split(" ");
			int sum=0;
			for(int j=Integer.parseInt(st3[0]); j<Integer.parseInt(st3[1]); j++)
				sum+=Math.abs(Integer.parseInt(st2[j])-Integer.parseInt(st2[j-1]));
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
