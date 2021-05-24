package ±¸Çö;

import java.io.*;

public class n_10797 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), count=0;
		String[] st=br.readLine().split(" " );
		for(int i=0; i<st.length; i++) {
			if(Integer.parseInt(st[i])==T)
				count++;
		}
		System.out.println(count);
	}
}
