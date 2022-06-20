package com.mintlolly.advance;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created on 2022/6/6
 *
 * @author jiangbo
 * Description:
 */
public class LRULinkedHashMap {
    private LinkedHashMap<String,String> lru;
    LRULinkedHashMap(int capacity){
        this.lru = new LinkedHashMap<String,String>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }
    public void put(String key,String value){
        lru.put(key,value);
    }
    public void get(String key){
        lru.get(key);
    }

    public static void main(String[] args) {
        LRULinkedHashMap lru = new LRULinkedHashMap(3);
        lru.put("1","1");
        lru.put("2","2");
        lru.put("3","3");
        lru.get("1");
        lru.put("2","2");
        for (Map.Entry<String, String> re : lru.lru.entrySet()) {
            System.out.println(re.getKey()+":"+re.getValue());
        }
    }
}
