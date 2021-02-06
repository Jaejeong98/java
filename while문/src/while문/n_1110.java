package while¹®;

import java.util.*;

public class n_1110 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int N_Copy=N, count=0;
		while(true) {
			int n1=N/10, n2=N%10;
			count++;
			if(n2*10+(n1+n2)%10==N_Copy) {
				System.out.println(count);
				break;
			}
			else {
				N=n2*10+(n1+n2)%10;
			}
		}
	}
}
