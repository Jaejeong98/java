package ÀüÃ¼;

import java.io.*;

public class n_1032 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String[] str=new String[T];
		for(int i=0; i<T; i++)
			str[i]=br.readLine();
		String st=str[0];
		for(int i=0; i<str.length; i++) {
			String st_c=new String();
			for(int j=0; j<st.length(); j++) {
				if(st.charAt(j)==str[i].charAt(j))
					st_c+=st.charAt(j);
				else
					st_c+="?";
			}
			st=st_c;
		}
		System.out.println(st);
	}
}