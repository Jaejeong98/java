package Á¤·Ä;

import java.io.*;
import java.util.*;;

public class n_11650 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		int[][] xy=new int[num][2];
		for(int i=0; i<num; i++) {
			String[] st=br.readLine().split(" ");
			for(int j=0; j<2; j++)
				xy[i][j]=Integer.parseInt(st[j]);
		}
		Arrays.sort(xy, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0])
					return o1[1]-o2[1];
				else
					return o1[0]-o2[0];
			}
		});
		for(int i=0; i<num; i++) {
			for(int j=0; j<2; j++)
				bw.write(xy[i][j]+" ");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
