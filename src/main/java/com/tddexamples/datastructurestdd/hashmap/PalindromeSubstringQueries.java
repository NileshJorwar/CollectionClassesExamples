package com.tddexamples.datastructurestdd.hashmap;

import java.util.ArrayList;

public class PalindromeSubstringQueries {

    public ArrayList<String> ifPalindromes(ArrayList<ArrayList<Integer>> lists, String input){
        ArrayList<String> res= new ArrayList<>();
        for(int i=0;i<lists.size();i++){
            String newStr= input.substring(lists.get(i).get(0),lists.get(i).get(1)+1);
            StringBuffer reverseStr= new StringBuffer(newStr).reverse();
            if(newStr.equals(reverseStr.toString()))
                res.add("true");
            else
                res.add("false");

        }

        lists.forEach(list->
        {
            String newStr= input.substring(list.get(0),list.get(1)+1);
            StringBuffer reverseStr= new StringBuffer(newStr).reverse();
            if(newStr.equals(reverseStr.toString()))
                res.add("true");
            else
                res.add("false");

        });
        return res;
    }
}
