package ±¸Çö2;

import java.io.*;

public class n_14909 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		int count=0;
		for(int i=0; i<st.length; i++) {
			if(st[i].contains("-")||st[i].equals("0"))
				continue;
			else
				count++;
		}
		System.out.println(count);
	}
}
