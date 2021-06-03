package Ω∫≈√;

import java.io.*;
import java.util.Stack;

public class n_12605 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			Stack stack=new Stack();
			for(int j=0; j<st.length; j++)
				stack.add(st[j]);
			System.out.print("Case #"+(i+1)+": ");
			while(stack.size()!=0)
				System.out.print(stack.pop()+" ");
			System.out.println("");
		}
	}
}
