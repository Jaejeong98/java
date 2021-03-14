package ¼öÇÐp3;

import java.io.*;

public class n_6378 {
	public static int func(String num) {
		String[] st=num.split("");
		int sum=0;
		for(int i=0; i<st.length; i++)
			sum+=Integer.parseInt(st[i]);
		if(sum>=10)
			return func(String.valueOf(sum));
		else
			return sum;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String num=br.readLine();
			if(num.equals("0"))
				break;
			else
				bw.write(func(num)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
