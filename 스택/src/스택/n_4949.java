package Ω∫≈√;

import java.io.*;
import java.util.Stack;

public class n_4949 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=new String();
		while((st=br.readLine()).equals(".")==false) {
			boolean b=false;
			String str[]=st.split("");
			Stack<String> stack=new Stack<>();
			for(int i=0; i<str.length; i++) {
				if(str[i].equals("(")||str[i].equals("["))
					stack.push(str[i]);
				else if(str[i].equals(")")) {
					if(stack.empty()||stack.pop().equals("(")==false) {
						b=true;
						break;
					}
				}
				else if(str[i].equals("]")) {
					if(stack.empty()||stack.pop().equals("[")==false) {
						b=true;
						break;
					}
				}
			}
			if(stack.empty()==false)
				b=true;
			bw.write(b?"no\n":"yes\n");
		}
		bw.flush();bw.close();
	}
}
