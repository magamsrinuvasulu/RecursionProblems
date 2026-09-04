import java.util.*;
class ProductOfDigits{
    public static int pod(int num){
        int present=1;
        if(num==0){
            return 1;
        }
          present*=num%10;
        return present*pod(num/10);
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            System.out.println("Product of Digits:"+pod(num));
        }
}