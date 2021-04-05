//https://leetcode.com/problems/3sum/
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            
            int start = i+1;
            int end = arr.length-1;
            
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            
            while(start<end){
                if(end <arr.length-1 && arr[end] == arr[end+1]){
                    end--;
                    continue;
                }
                
                if(arr[i]+arr[start]+arr[end] == 0){
                    List<Integer> triplet = Arrays.asList(arr[i],arr[start],arr[end]);
                    result.add(triplet);
                    start++;
                    end--;
                }
                else if(arr[i] +arr[start] + arr[end]<0){
                    start++;
                }
                else{
                    end --;
                }
            }
        }
        return result;
        
    }
}