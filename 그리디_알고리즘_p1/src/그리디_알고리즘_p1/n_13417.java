package 그리디_알고리즘_p1;

import java.io.*;
import java.util.*;

public class n_13417 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int C=Integer.parseInt(br.readLine());
			String st[]=br.readLine().split(" ");
	        Deque<String> deque = new ArrayDeque<>();
	        deque.add(st[0]);
			for(int j=1; j<C; j++) {
				if(st[j].charAt(0)<=deque.getFirst().charAt(0)) deque.addFirst(st[j]);
				else deque.addLast(st[j]);
			}
			Iterator iter = deque.iterator(); 
			while(iter.hasNext()) 
				bw.write(iter.next()+"");
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}
