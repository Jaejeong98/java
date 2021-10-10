package Ω∫≈√;

import java.io.*;
import java.util.*;

public class n_1406 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=br.readLine();
		Stack stack1=new Stack<String>(), stack2=new Stack<String>();
		for(int i=0; i<st.length(); i++)
			stack1.push(st.charAt(i));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String str[]=br.readLine().split(" ");
			switch(str[0]) {
			case "L": 
				if(!stack1.isEmpty())
					stack2.push(stack1.pop());
				break;
			case "D":
				if(!stack2.isEmpty())
					stack1.push(stack2.pop());
				break;
			case "B":
				if(!stack1.isEmpty())
					stack1.pop();
				break;
			case "P":
				stack1.push(str[1]);
				break;
			}
		}
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		while(!stack2.isEmpty()) {
			bw.write(stack2.pop()+"");
		}
		bw.flush();bw.close();
	}
}