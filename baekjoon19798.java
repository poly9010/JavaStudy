import java.util.Scanner;

public class baekjoon1978 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++) arr[i] = scanner.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==1) count++;
            else {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(n-count);


    }
}
