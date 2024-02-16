import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int f = 1;
        if(num < 0){
            System.out.println("Enter valid Number");
        }
        if(num ==0 && num == 1){
            System.out.println("Not prime Number");
        }else{

            for(int i=2;i<num/2;i++){
                if(num % i==0){
                    f=1;
                }else{
                    f=0;
                }
            }
        }
        if(f ==1){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not prime");
        }

    }
}
