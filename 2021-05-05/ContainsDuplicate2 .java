// https://leetcode.com/problems/contains-duplicate-ii/submissions/

class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            if(map.containsKey(current) && i-map.get(current) <= k){
                return true;
            }
            else {
                map.put(current,i);
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		int arr[] = {1,2,1,1};
		int diff = 1;
		boolean result = containsNearbyDuplicate(arr,diff);
		System.out.println(result);
	}
}