package 기본수학1;

import java.util.*;

public class n_1011 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			int x=sc.nextInt(), y=sc.nextInt();
			int distance=y-x;
			int max=(int)Math.sqrt(distance);
			
			if(max==Math.sqrt(distance))
				System.out.println(2*max-1);
			else if(Math.sqrt(distance)-max<=0.5)
				System.out.println(2*max);
			else
				System.out.println(2*max+1);
		}
	}
}
