import java.util.*;
public class Palindrome_Number {
    public static boolean palindrome(int num){
        int rev = 0;
        int oNum = num;
        
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 +digit;
            num /= 10;
        }
        return oNum == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();

        if(palindrome(num)){
            System.out.println(num+" is palindrome number");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
