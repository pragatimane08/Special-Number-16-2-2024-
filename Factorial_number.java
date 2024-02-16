import java.util.Scanner;

public class Factorial_number {
    //factorial
    public static int factorial(int n){
        if(n==0 || n==1){
        return 1;
        }
        return n *factorial(n-1);
    }
    //check factorial or not
    public static boolean isSpecial(int num){
        int OriginalNum = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == OriginalNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        if(isSpecial(num)){
            System.out.println(num+" is special number.");
        }else{
            System.out.println("Special number");
        }
    }
}
