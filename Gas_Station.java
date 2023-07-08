// 134. Gas Station – Leetcode

class Gas_Station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0,cur =0,prev=0;
        for(int i =0;i<n;i++){
            cur+=gas[i]-cost[i];
            if(cur<0){
                prev+=cur;
                cur = 0;
                start = i+1;
            }
        }
        if(cur+prev >=0)return start;
        return -1;
    }
}
