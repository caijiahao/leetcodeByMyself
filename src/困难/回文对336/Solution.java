package 困难.回文对336;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
         List<List<Integer>> res = new ArrayList<>();
         if(words == null || words.length<2){
             return res;
         }

        HashMap<String,Integer> hashMap = new HashMap<>();
         for(int i = 0;i<words.length;i++){
             hashMap.put(words[i],i);
         }

         for(int i = 0;i<words.length;i++){
             for(int j = 0;j<=words[i].length();j++){  //j是能到word[i].length()
                   String left = words[i].substring(0,j);
                   String right = words[i].substring(j);

                   if(isPalindrome(left)){
                       String reverseRight = new StringBuilder(right).reverse().toString();
                       if(hashMap.containsKey(reverseRight) && hashMap.get(reverseRight)!=i){
                           List<Integer> item = new ArrayList<>();
                           item.add(hashMap.get(reverseRight));
                           item.add(i);
                           res.add(item);
                       }
                   }

                   if(isPalindrome(right)){
                       String reverseLeft = new StringBuilder(left).reverse().toString();
                       if(hashMap.containsKey(reverseLeft)&& hashMap.get(reverseLeft)!=i&&right.length()!=0){
                           List<Integer> item = new ArrayList<Integer>();
                           item.add(i);
                           item.add(hashMap.get(reverseLeft));
                           res.add(item);
                       }
                   }
             }
         }
         return res;
    }

    private boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}
