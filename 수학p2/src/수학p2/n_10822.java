package ¼öÇÐp2;

import java.io.*;

public class n_10822 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(",");
		int sum=0;
		for(int i=0; i<st.length; i++)
			sum+=Integer.parseInt(st[i]);
		System.out.println(sum);
	}
}
