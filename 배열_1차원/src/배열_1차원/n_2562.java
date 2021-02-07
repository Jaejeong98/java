package 배열_1차원;

import java.util.*;

public class n_2562 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		int max=0, j=0;
		for(int i=0; i<9; i++) {
			array[i]=sc.nextInt();
			if(max<array[i]) {
				max=array[i];
				j=i+1;
			}
		}
		System.out.println(max+"\n"+j);
	}
}
