import java.util.Scanner;

public class Perfect_Number{
    public static boolean isPerfect(int num){
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        if(isPerfect(num)){
            System.out.println(num+" is Perfect Number");
        }else{
            System.out.println("not perfect");
        }
    }
}