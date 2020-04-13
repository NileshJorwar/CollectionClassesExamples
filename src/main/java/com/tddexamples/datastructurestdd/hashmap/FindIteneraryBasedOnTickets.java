package com.tddexamples.datastructurestdd.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindIteneraryBasedOnTickets {
    public void findItenerary(Map<String,String> tickets){
     Map<String, String> reveseMap =
             new HashMap<>();
     for(String key:tickets.keySet()){
        reveseMap.put(tickets.get(key),key);
     }
     String startingPoint=null;
     for(String key:tickets.keySet()){
        if(!reveseMap.containsKey(key))
        {
            startingPoint=key;
            break;
        }
     }
     String to= tickets.get(startingPoint);
     while(to!=null){
         System.out.println(startingPoint +"->"+to);
         startingPoint=to;
         to=tickets.get(startingPoint);
     }

    }
}
