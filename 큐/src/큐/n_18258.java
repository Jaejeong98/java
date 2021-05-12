package ť;

import java.io.*;
import java.util.*;

public class n_18258 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		LinkedList<Integer>queue=new LinkedList<>();
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			if(st.contains("push")) {
				String[] str=st.split(" ");
				queue.add(Integer.parseInt(str[1]));
			}
			else if(st.contains("pop")) {
				if(queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.removeFirst()+"\n");
			}
			else if(st.contains("size")) 
				bw.write(queue.size()+"\n");
			else if(st.contains("empty")) {
				if(queue.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
			}
			else if(st.contains("front")) {
				if(queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.getFirst()+"\n");
			}
			else if(st.contains("back")) {
				if(queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(queue.getLast()+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
