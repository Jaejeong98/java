package Ω∫≈√;

import java.io.*;
import java.util.*;

public class n_2493 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T+1], n[]=new int[T+1];
		String st[]=br.readLine().split(" ");
		for(int i=1; i<T+1; i++)
			n[i]=Integer.parseInt(st[i-1]);
		Stack<Integer> stack=new Stack<>();
		for(int i=1; i<T+1; i++) {
			while(!stack.isEmpty()) {
				if(n[stack.peek()]>=n[i]) {
					arr[i]=stack.peek();
					break;
				}else stack.pop();
			}
			stack.push(i);
		}
		for(int i=1; i<=T; i++) bw.write(arr[i]+" ");
		bw.flush();bw.close();
	}
}