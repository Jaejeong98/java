package Ω∫≈√;

import java.io.*;
import java.util.*;

public class n_17298 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		Stack<Integer>stack=new Stack<Integer>();
		String[] st=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		for(int i = 0; i < T; i++) {
			while(stack.isEmpty()==false && arr[stack.peek()] < arr[i])
				arr[stack.pop()] = arr[i];
			stack.push(i);
		}
		while(stack.isEmpty()==false)
			arr[stack.pop()] = -1;
		for(int i = 0; i < T; i++)
			bw.write(arr[i]+" ");
		bw.flush();bw.close();
	}
}