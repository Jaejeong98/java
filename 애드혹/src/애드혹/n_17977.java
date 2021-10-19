package æ÷µÂ»§;

import java.util.*;

public class n_17977 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), arr[]=new int[1000001];
		arr[3]=0; arr[4]=1;
		for(int i=5; i<=num; i++)
			arr[i]=arr[(i+1)/2]+2;
		System.out.println(arr[num]);
	}
}