package 困难.最低加油次数871;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());//倒叙
        int d = startFuel;
        int idx = 0,res = 0;
        while(true){
            while(idx<stations.length&&d>=stations[idx][0]){
                queue.offer(stations[idx][1]);
                idx++;
            }
            if(d>=target){
                return res;
            }
            if(queue.size() == 0){
                return -1;
            }
            d+=queue.poll();
            res++;
        }
    }
}
