import java.util.Scanner;

public class baekjoon10952{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		while(true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a==0 && b==0){
				break;
			} 
			i += 1;
			System.out.println(a+b);
		}
	}
}
