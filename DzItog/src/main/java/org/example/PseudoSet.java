package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PseudoSet<T> {
    private final HashMap<T,Object> map = new HashMap<>();
    private static final Object o = new Object();

    public boolean addEl(T num){
        return map.put(num,o) == null;

    }

    public  boolean removeEl(T num){
        return map.remove(num)==o;
    }

    public String toStringCol(){
        return map.keySet().toString();
    }

    public Iterator<T> iterator(){
        return map.keySet().iterator();
    }

    public Object getByIndex(int index){
        int it= 0;
       for (Map.Entry<T, Object> entry : map.entrySet()){
            if(it == index) return entry.getKey();
            it++;
        }
        return null;
    }
}