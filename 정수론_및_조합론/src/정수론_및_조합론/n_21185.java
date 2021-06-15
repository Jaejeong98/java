package 정수론_및_조합론;

import java.util.*;

public class n_21185 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==1)
			System.out.println("Either");
		else {
			if((num/2)%2==1)
				System.out.println("Odd");
			else
				System.out.println("Even");
		}
	}
}
