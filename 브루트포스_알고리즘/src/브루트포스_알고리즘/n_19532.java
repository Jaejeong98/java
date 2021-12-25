package 브루트포스_알고리즘;

import java.util.*;

public class n_19532 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0; i<6; i++) 
			arr[i]=sc.nextInt();
		for(int i=-999; i<=999; i++) {
			for(int j=-999; j<=999; j++) {
				int n=i*arr[0]+j*arr[1], m=i*arr[3]+j*arr[4];
				if(n==arr[2]&&m==arr[5]) {
					System.out.println(i+" "+j);
					break;
				}
			}
		}
	}
}
