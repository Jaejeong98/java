package 기본수학2;

import java.util.*;

public class n_9020 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int n=sc.nextInt();
			int n1=n/2;
			
			for(int j=n1; j>=2; j--) {
				int count=0;
				int root1=(int)Math.sqrt(j);
				for(int k=2; k<=root1; k++) {
					if(j%k==0) {
						count++;
						break;
					}
				}
				if(count==0) {
					int root2=(int)Math.sqrt(n-j);
					for(int k=2; k<=root2; k++) {
						if((n-j)%k==0) {
							count++;
							break;
						}
					}
					if(count==0) {
						System.out.println(j+" "+(n-j));
						break;
					}
				}
			}
		}
	}
}
