

class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int ans = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(!map.containsKey(arr[i]))map.put(arr[i],1);
            else map.put(arr[i],map.get(arr[i])+1);
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
         Integer key = iterator.next();
         if(map.get(key)>n/2){
            ans = key;
            break;
         }
        }
        return ans;
    }
}
