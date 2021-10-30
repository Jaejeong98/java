package Ω∫≈√;

import java.io.*;
import java.util.*;

public class n_2841 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		Stack<Integer>[] stack=new Stack[7];
		int count=0;
		for(int i=1; i<=6; i++)
			stack[i]=new Stack<>();
		for(int i=0; i<Integer.parseInt(st[0]); i++) {
			String str[]=br.readLine().split(" ");
			int n1=Integer.parseInt(str[0]), n2=Integer.parseInt(str[1]);
			if(stack[n1].isEmpty()||stack[n1].peek()<n2) {
				if(!stack[n1].isEmpty()&&stack[n1].peek()==n2) continue;
				count++;
				stack[n1].push(n2);
			}else {
				while(!stack[n1].isEmpty()&&stack[n1].peek()>n2) {
					stack[n1].pop(); count++;
				}
				if(!stack[n1].isEmpty()&&stack[n1].peek()==n2) continue;
				stack[n1].push(n2); count++;
			}
		}
		System.out.println(count);
	}
}