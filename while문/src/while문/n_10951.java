package while¹®;

import java.util.*;
import java.io.*;

public class n_10951{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String str;
		StringTokenizer st;
		
		while((str=br.readLine())!=null){
			st=new StringTokenizer(str);
			int n1=Integer.parseInt(st.nextToken());
			int n2=Integer.parseInt(st.nextToken());
			
			bw.write((n1+n2)+"\n");
		}
		bw.flush();
		bw.close();
	}
}