package º°Âï±â;
import java.util.Scanner;

public class number_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("N(1~100)");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("¡Ú");
			}
			System.out.println(" ");
		}
		scanner.close();
	}

}
