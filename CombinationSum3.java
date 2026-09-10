class CombinationSum3 {
    List<List<Integer>> list=new ArrayList<>();
    public void combinationSum3(int k,int target,int index,List<Integer> path){
        if(target==0&&k==0){
            list.add(new ArrayList<>(path));
        }
        if(target<0&&k<0){
            return ;
        }
        for(int i=index;i<=9;i++){
            path.add(i);
            combinationSum3(k-1,target-i,i+1,path);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        combinationSum3(k,n,1,new ArrayList<>());
        return list;
    }
}