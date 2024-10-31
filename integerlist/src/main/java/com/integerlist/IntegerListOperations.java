package com.integerlist;

public class IntegerListOperations {
    
    public int sum(int[] integerArray){

        int sum = 0;

        for (int i = 0; i < integerArray.length; i++) {
            
            sum = sum + integerArray[i];
        }

        return sum;
    }

    public int length(int[] integerArray){

        return integerArray.length;
    }
}
