import java.util.Scanner;

public class baekjoon1546 {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		float sum_ = 0;
		float[] arr = new float[n];
		float max = 0;//최대값 
		
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
			if(max<arr[i]) {
				max = arr[i]; 
			}
		}
		scanner.close();
		for(int i=0;i<n;i++) {
			sum_ += arr[i]/max*100;
			}
		System.out.print(sum_/n);
		
	}
}
