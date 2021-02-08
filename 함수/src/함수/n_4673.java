package ÇÔ¼ö;

public class n_4673 {
	static boolean[] self_num=new boolean[11000];
	public static void selfN(int n) {
		int copy=n;
		while(n!=0) {
			copy+=n%10;
			n/=10;
		}
		self_num[copy]=true;
	}
	public static void main(String[] args) {
		for(int i=1; i<=10000; i++)
			selfN(i);
		for(int i=1; i<-10000; i++) {
			if(self_num[i]=!true)
				System.out.println(i);
		}
	}
}
