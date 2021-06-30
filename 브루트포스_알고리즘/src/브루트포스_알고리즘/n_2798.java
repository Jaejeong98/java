package 브루트포스_알고리즘;

import java.io.*;

public class n_2798 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "), num[]=br.readLine().split(" ");
		int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]),
				arr[]=new int[Integer.parseInt(st[0])], answer=0;
		for(int i=0; i<n1; i++)
			arr[i]=Integer.parseInt(num[i]);
		for(int i=0; i<n1-2; i++) {
			for(int j=i+1; j<n1-1; j++) {
				for(int k=j+1; k<n1; k++) {
					int sum=arr[i]+arr[j]+arr[k];
					if(sum<=n2&&sum>answer)
						answer=sum;
				}
			}
		}
		System.out.println(answer);
	}
}
