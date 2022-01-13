package 우선순위큐;

import java.io.*;
import java.util.*;

public class n_14235 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String st="";
		PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
		for (int i=0; i<T; i++) {
			if((st=br.readLine()).equals("0"))
				bw.write((queue.isEmpty()?-1:queue.poll())+"\n");
			else {
				String str[]=st.split(" ");
				for (int j=1; j<str.length; j++)
					queue.add(Integer.parseInt(str[j]));
			}
		}
		bw.flush();bw.close();
	}
}
