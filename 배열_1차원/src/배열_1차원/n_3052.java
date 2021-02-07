package 배열_1차원;

import java.util.*;

public class n_3052 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		int[] count=new int[42];
		int c=0;
		for(int i=0; i<10; i++) {
			num[i]=sc.nextInt();
			count[num[i]%42]++;
		}
		for(int i=0; i<42; i++) {
			if(count[i]!=0)
				c++;
		}
		System.out.println(c);
	}
}
