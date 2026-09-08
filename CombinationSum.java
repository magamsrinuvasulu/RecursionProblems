class CombinationSum {
    public List<List<Integer>> list=new ArrayList<>();
    public void combinationSum(int[] candidates,int target,int index,List<Integer> path){
        if(index==candidates.length||target<0)return;
        if(target==0){
            list.add(new ArrayList<>(path));
            return;
        }
        path.add(candidates[index]);
        combinationSum(candidates,target-candidates[index],index,path);
        path.remove(path.size()-1);
        combinationSum(candidates,target,index+1,path);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinationSum(candidates,target,0,new ArrayList<>());
        return list;
    }
}