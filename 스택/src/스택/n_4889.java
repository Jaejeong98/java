package Ω∫≈√;

import java.io.*;
import java.util.*;

public class n_4889{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t = 1;
		String st=new String();
		while(!(st=br.readLine()).contains("-")) {
			int count = 0;
			Stack<Character> stack = new Stack<>();
			for(int i = 0; i < st.length(); i++) {
				if(st.charAt(i) == '{')
					stack.push('{');
				else {
					if(stack.isEmpty()) {
						count++;
						stack.push('{');
					}
					else
						stack.pop();
				}
			}
			bw.write((t++) + ". " + (count + stack.size()/2) + "\n");
		}
		bw.flush(); bw.close();
	}
}
