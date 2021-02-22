package 정수론_및_조합론;

import java.util.*;

public class n_1676 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=N/125+N/25;
		if(N%10<5)
			System.out.println(count+N/10*2);
		else
			System.out.println(count+N/10*2+1);
	}
}
