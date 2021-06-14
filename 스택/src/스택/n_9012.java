package Ω∫≈√;

import java.io.*;
import java.util.*;

public class n_9012 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split("");
			Stack<String> stack=new Stack<String>();
			boolean b=true;
			for(int j=0; j<st.length; j++) {
				if(st[j].equals("("))
					stack.push("(");
				else {
					if(stack.empty()) {
						b=false;
						bw.write("NO\n");
						break;
					}else 
						stack.pop();
				}
			}
			if(b) {
				if(stack.empty())
					bw.write("YES\n");
				else
					bw.write("NO\n");
			}
		}
		bw.flush();bw.close();
	}
}