package 简单.同构字符串205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
         if(s == null && t == null){
             return true;
         }
         if(s == null | t == null)
             return false;
         if(s.length()!=t.length())
             return false;

        Map<Character,Character> map = new HashMap<>(s.length()); //创建map,set的写法。还有字符串求长度的写法。
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i); //char类型c不是大写的
            char tc = t.charAt(i);
            if(!map.containsKey(sc)){
                if(set.contains(tc)){
                    return false;
                }else{
                    map.put(sc,tc);
                    set.add(tc);
                }
            }else{
                if(map.get(sc)!=tc){
                    return false;
                }
            }
            return false;
        }
        return true;
    }
}
