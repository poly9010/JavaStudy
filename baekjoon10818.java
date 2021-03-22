import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = scanner.nextInt();
		}
		int max = num[0];
		int min = num[0];
		for(int j=0;j<n;j++) {
			if (max<num[j]) {
				max = num[j];
			}
			if (min>num[j]) {
				min = num[j];
			}
		}
		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);
		scanner.close();
	}
}
