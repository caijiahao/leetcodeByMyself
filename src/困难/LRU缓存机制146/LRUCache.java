package 困难.LRU缓存机制146;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private int mCapacity;
    LinkedHashMap linkedHashMap;

    public LRUCache(int capacity) {
        mCapacity = capacity;
        linkedHashMap = new LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size()>mCapacity;
            }
        };
    }

    public int get(int key) {
        if(linkedHashMap.get(key)!=null){
            return (int)linkedHashMap.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
         linkedHashMap.put(key,value);
    }
}
