package 다이나믹_프로그래밍p1;

import java.io.*;

public class n_9084 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int t=0; t<T; t++){
			int n = Integer.parseInt(br.readLine()), arr[] = new int[n];
			String st[]=br.readLine().split(" ");
			for(int i=0; i<n; i++) 
				arr[i] = Integer.parseInt(st[i]);
			int w= Integer.parseInt(br.readLine()), arr2[] = new int[w+1];
			arr2[0] = 1;
			for (int i = 0; i <n; i++) {
				for (int j = arr[i]; j <= w; j++)
					arr2[j] += arr2[j - arr[i]];
			}
			bw.write(arr2[w]+"\n");
		}
		bw.flush();bw.close();
	}
}