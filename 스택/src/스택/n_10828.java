package Ω∫≈√;

import java.io.*;
import java.util.*;

public class n_10828 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			if(st.contains("push")) {
				String[] st1=st.split(" ");
				stack.push(Integer.parseInt(st1[1]));
			}
			else if(st.contains("top")) {
				if(stack.empty())
					bw.write("-1\n");
				else
					bw.write(stack.peek()+"\n");
			}
			else if(st.contains("size"))
				bw.write(stack.size()+"\n");
			else if(st.contains("empty")) {
				if(stack.empty())
					bw.write("1\n");
				else
					bw.write("0\n");
			}
			else {
				if(stack.empty())
					bw.write("-1\n");
				else
					bw.write(stack.pop()+"\n");
			}
		}
		bw.flush();bw.close();
	}
}
