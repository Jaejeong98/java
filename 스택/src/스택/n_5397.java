package Ω∫≈√;

import java.io.*;
import java.util.*;

public class n_5397 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			Stack<Character> stack1=new Stack<>(), stack2=new Stack<>();
			for(int j=0; j<st.length(); j++) {
				char ch=st.charAt(j);
				if(ch=='<') {
					if(!stack1.isEmpty()) stack2.push(stack1.pop());
				}
				else if(ch=='>') {
					if(!stack2.isEmpty()) stack1.push(stack2.pop());
				}
				else if(ch=='-') {
					if(!stack1.isEmpty()) stack1.pop();
				}
				else stack1.push(ch);
			}
			while(!stack1.isEmpty())
				stack2.push(stack1.pop());
			while(!stack2.isEmpty())
				bw.write(stack2.pop()+"");
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}