import java.util.Scanner;

public class baekjoon1712 {
    public static void main(String[] args){
        int static_expense;
        int income;
        int product_expense;
        int result = 0;
        int total_expense = 0;
        Scanner scanner = new Scanner(System.in);

        static_expense = scanner.nextInt();
        product_expense = scanner.nextInt();
        income = scanner.nextInt();

        total_expense += static_expense;
        if(product_expense>=income) result = -1;
        else result = (total_expense / (income - product_expense)) + 1 ;
        System.out.println(result);
    }
}
