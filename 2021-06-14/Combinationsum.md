### Back Tracking

```java
public List<List<Integer>> combinationSum(int arr[],int target){
  List<List<Integer>> result = new ArrayList<>();
  backtrack(0,arr,target,new ArrayList(),result);
  return result;
}

private void backtrack(int start,int[] arr,int target,List<Integer> list,List<List<Integer>> result){
  if(target < 0){
    return;
  }
  if(target == 0){
    result.add(new ArrayList(list));
  }
  
  for(int temp = start; temp < arr.length; temp++){
   list.add(arr[temp]);
    backtrack(temp,arr,target-arr[temp],list,result);
    list.remove(list.size()-1);
  }
}
```


![IMG_20210614_192915](https://user-images.githubusercontent.com/63385985/121907155-6c681800-cd49-11eb-8bb0-ef3945ab8d46.jpg)
![IMG_20210614_192946](https://user-images.githubusercontent.com/63385985/121907201-768a1680-cd49-11eb-8493-10b5ef7acba2.jpg)

