package com.tddexamples.datastructurestdd.hashmap;

import java.util.HashMap;

public class HashMapForCustomObject {
    private int accountNumber;
    private String holderName;

    public HashMapForCustomObject(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int res = 1;
        res = res * prime + accountNumber;
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (this == o)
            return true;
        if (getClass() != o.getClass())
            return false;
        HashMapForCustomObject customObject =
                (HashMapForCustomObject) o;
        if (accountNumber != customObject.accountNumber)
            return false;
        return true;
    }

    public static void main(String[] args) {
        HashMap<HashMapForCustomObject, String> map =
                new HashMap<>();
        HashMapForCustomObject o1 =
                new HashMapForCustomObject(1);
        o1.setHolderName("Nilesh");

        HashMapForCustomObject o2 =
                new HashMapForCustomObject(2);
        o2.setHolderName("Sachin");

        map.put(o1, o1.getHolderName());
        map.put(o2, o2.getHolderName());

        //o1.setHolderName("Test1");
        //o2.setHolderName("Test2");

        System.out.println(map.get(o1));
        System.out.println(map.get(o2));


        HashMapForCustomObject o3 =
                new HashMapForCustomObject(1);
        o3.setHolderName("Ramesh");

        //map.put(o3,o3.getHolderName());

        System.out.println(map.get(o3));
        System.out.println(map.size());


    }

}
