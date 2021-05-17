package 자료구조;

import java.io.*;
import java.util.*;

public class n_11279 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			if(st.equals("0")) {
				if(priorityQueue.isEmpty())
					bw.write("0\n");
				else
					bw.write(priorityQueue.poll()+"\n");
			}
			else
				priorityQueue.add(Integer.parseInt(st));
		}
		bw.flush();
		bw.close();
	}
}
