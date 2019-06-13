package 困难.公交路线815;

import java.util.*;

public class Solution {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        if(S == T){
            return 0;
        }

        Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
        for(int i=0;i<routes.length;i++){
            for(int j:routes[i]){
                if(!map.containsKey(j)){
                    map.put(j,new HashSet<Integer>());
                }
                map.get(j).add(i);
            }
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        Set<Integer> vis = new HashSet<Integer>();
        for(int st:map.get(S)){
            queue.offer(st);
            vis.add(st);
        }
        int ans = 1;
        while(!queue.isEmpty()){
            Queue<Integer> t=new LinkedList<Integer>(); //备用节点存新添加的未访问过的节点
            while(!queue.isEmpty()){
                int curCar = queue.poll();
                for(int k:routes[curCar]){  //遍历当前公交车节点所连接的所有公交车站节点
                    if(k == T){
                        return ans;
                    }
                    for(int nextCar:map.get(k)){ //遍历当前公交车站节点连接的所有公交车节点
                        if(!vis.contains(nextCar)){
                            t.offer(nextCar);
                            vis.add(nextCar);
                        }
                    }
                }
            }
            ++ans;
            queue = t;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] r={{1, 2, 7}, {3, 6, 7}};
        System.out.println(new Solution().numBusesToDestination(r,1,6));
    }
}
