class DivideAndConquer{
    public static int findMax(int[] arr,int start,int end){
        if(start==end){
            return arr[start];
        }
        int mid=(start+end)/2;//Divides an array
        int leftMax=findMax(arr,start,mid);// It performance Recursion
        int rightMax=findMax(arr,mid+1,end);//It performance Recursion
        return Math.max(leftMax,rightMax);
    }
    public static void main(String[] args){
        int[] arr={3,5,-1,-9,13,13,848,5729,-6371,1372,928};
        int start=0,end=arr.length-1;
        System.out.println(findMax(arr,start,end));
    }
}