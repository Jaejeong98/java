package ¼öÇÐp3;

import java.io.*;

public class n_15780 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st1=br.readLine().split(" "), st2=br.readLine().split(" ");
		int sum=0;
		for(int i=0; i<st2.length; i++) 
			sum+=(int)Math.ceil(Double.parseDouble(st2[i])/2);
		if(Integer.parseInt(st1[0])<=sum)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
