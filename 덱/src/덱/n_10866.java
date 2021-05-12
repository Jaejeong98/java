package µ¦;

import java.io.*;
import java.util.*;

public class n_10866 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		ArrayDeque<Integer> deque=new ArrayDeque<>();
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			if(st.contains("push")) {
				String[] str=st.split(" ");
				if(st.contains("front"))
					deque.addFirst(Integer.parseInt(str[1]));
				else if(st.contains("back"))
					deque.addLast(Integer.parseInt(str[1]));
			}
			else if(st.contains("pop")) {
				if(deque.isEmpty())
					bw.write("-1\n");
				else if(st.contains("front"))
					bw.write(deque.removeFirst()+"\n");
				else if(st.contains("back"))
					bw.write(deque.removeLast()+"\n");
			}
			else if(st.contains("size"))
				bw.write(deque.size()+"\n");
			else if(st.contains("empty")) {
				if(deque.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
			}
			else if(st.contains("front")) {
				if(deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(deque.getFirst()+"\n");
			}
			else if(st.contains("back")) {
				if(deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(deque.getLast()+"\n");
			}
		}
		bw.flush();bw.close();
	}
}
