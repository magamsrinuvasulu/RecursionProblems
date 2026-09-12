import java.util.*;

class Permutations {
    List<List<Integer>> permute;

    public void permute(int[] nums, ArrayList<Integer> temp, int index) {
        if (nums.length == temp.size()) {
            permute.add(new ArrayList<>(temp));
            return;
        }

        int val = nums[index];

        for (int i = 0; i <= temp.size(); i++) {
            temp.add(i, val);
            permute(nums, temp, index + 1);
            temp.remove(i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        permute = new ArrayList<>();
        permute(nums, new ArrayList<>(), 0);
        return permute;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4};

        Permutations p = new Permutations();

        System.out.println(p.permute(nums));
    }
}