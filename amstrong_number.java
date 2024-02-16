public class amstrong_number {
    public static void main(String[] args) {
        int n = 153;
        int rem=0;int sum=0;
        int temp =n;
        while(n>0){
            rem = n % 10; //3
            sum = sum + rem*rem*rem; //0+27
            n = n/10; //15
        }
        System.out.println(sum);
        if(temp == sum) System.out.println("amstrong no");
        else System.out.println("not amstrong no");
    }
      }