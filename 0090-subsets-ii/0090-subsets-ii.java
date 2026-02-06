class Solution {

    public void findSubsets(int ind, int[] nums, Set<List<Integer>> result, List<Integer> ds){
        if(ind==nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        findSubsets(ind+1,nums,result,ds);
        ds.remove(ds.size()-1);
        findSubsets(ind+1, nums,result,ds);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Set<List<Integer>> result=new HashSet<>();
        Arrays.sort(nums);
        findSubsets(0,nums, result, new ArrayList<>());
        return new ArrayList<>(result);
    }
}