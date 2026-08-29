class LeetCode1342{
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            count++;
            if(num%2==1){
                num-=1;
            }else{
            num/=2;
            }
        }
        return count;
    }
}