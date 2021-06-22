import java.util.Scanner;

public class baekjoon2753 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
      
        int result;
        int year = scanner.nextInt();
      
        if(year%4==0 &&(year%400==0 || year%100!=0)) result = 1;
        else result = 0;
      
        System.out.println(result);

    }
}
