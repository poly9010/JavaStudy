import java.util.Scanner;

public class baekjoon2439 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i,j,k;
		
		for (i=0;i<n;i++) {
			for(j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(k=j;k<n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
