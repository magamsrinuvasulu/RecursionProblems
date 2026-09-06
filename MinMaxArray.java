class MinMaxArray {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list=new ArrayList<>();
        int[] result=minmax(arr,0);
        list.add(result[0]);
        list.add(result[1]);
        return list;
    }
    public int[] minmax(int[] arr,int index){
        if(arr.length-1==index){
            return new int[]{arr[index],arr[index]};
        }
        int[] result=minmax(arr,index+1);
        if(arr[index]>result[1]){
            result[1]=arr[index];
        }
        if(arr[index]<result[0]){
            result[0]=arr[index];
        }
        return result;
    }
}
