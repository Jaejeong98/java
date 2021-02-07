package 배열_1차원;

import java.util.Scanner;

public class n_2577 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt();
		int num=A*B*C, div=0;
		if(num<10000000)
			div=6;
		else if(num<100000000)
			div=7;
		else if(num<1000000000)
			div=8;
		for(; div>=0;div--) {
			int d=(int)Math.pow(10, div);
			array[num/d]++;
			num=num%d;
		}
		for(int i=0; i<10; i++)
			System.out.println(array[i]);
	}
}
