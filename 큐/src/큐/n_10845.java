package ť;

import java.io.*;
import java.util.*;

public class n_10845 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		LinkedList<Integer> queue=new LinkedList<>();
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			if(st.contains("push")) {
				String[] str=st.split(" ");
				queue.add(Integer.parseInt(str[1]));
			}
			else if(st.contains("pop")) {
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.removeFirst());
			}
			else if(st.contains("size"))
				System.out.println(queue.size());
			else if(st.contains("empty")) {
				if(queue.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(st.contains("front")) {
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.getFirst());
			}
			else if(st.contains("back")) {
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.getLast());
			}
		}
	}
}