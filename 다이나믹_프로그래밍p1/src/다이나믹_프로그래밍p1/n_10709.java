package 다이나믹_프로그래밍p1;

import java.io.*;

public class n_10709 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" ");
		for(int i=0; i<Integer.parseInt(st[0]); i++) {
			String str=br.readLine();
			boolean b=false;
			int count=0;
			for(int j=0; j<Integer.parseInt(st[1]); j++) {
				if(str.charAt(j)=='c') {
					b=true;
					count=0;
					bw.write(0+" ");
				}else {
					if(b==false)
						bw.write(-1+" ");
					else {
						count++;
						bw.write(count+" ");
					}
				}
			}
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}
