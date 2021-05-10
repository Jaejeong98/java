package ±¸Çö;

import java.io.*;
import java.util.*;

public class n_10773 {
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), sum=0;
		Stack<Integer>stack=new Stack<Integer>();
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			if(st.equals("0"))
				stack.pop();
			else
				stack.push(Integer.parseInt(st));
		}
		for(int i=0; i<stack.size(); i++)
			sum+=stack.elementAt(i);
		System.out.println(sum);
	}
}
