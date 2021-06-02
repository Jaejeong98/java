package ¹®ÀÚ¿­;

import java.io.*;
import java.util.Arrays;

public class n_6996 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" "), st1="", st2="";
			char[] ch1=st[0].toCharArray();
			char[] ch2=st[1].toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
				bw.write(st[0]+" & "+st[1]+" are anagrams.\n");
			else
				bw.write(st[0]+" & "+st[1]+" are NOT anagrams.\n");
		}
		bw.flush();bw.close();
	}
}
