import java.util.Scanner;

public class baekjoon2562 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		int max_index=0;
		for(int i=0;i<9;i++) {
			arr[i] = scanner.nextInt();
			if(max<arr[i]) {
				max = arr[i];
				max_index = i;
			}
		}
		System.out.println(max);
		System.out.println(max_index+1);
		scanner.close();
		
	}
}
