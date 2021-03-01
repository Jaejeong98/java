package ¼öÇÐp2;

import java.io.*;

public class n_5596 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] mk=br.readLine().split(" ");
		String[] ms=br.readLine().split(" ");
		int sum1=0, sum2=0;
		for(int i=0; i<4; i++) {
			sum1+=Integer.parseInt(mk[i]);
			sum2+=Integer.parseInt(ms[i]);
		}
		if(sum2>sum1)
			System.out.println(sum2);
		else
			System.out.println(sum1);
	}
}
