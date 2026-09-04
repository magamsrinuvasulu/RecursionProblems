class SumOfDigits{
    public static int sod(int num){
        int present=0;
        if(num==0){
            return 0;
        }
          present+=num%10;
        return present+sod(num/10);
    }
        public static void main(String[] args){
            System.out.println(sod(765));
        }
}