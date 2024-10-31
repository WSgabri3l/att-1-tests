package com.integerlist;

public class IntegerListManipulation {
    
    public int[] add(int[] integerArray, int value){

        int[] newIntegerArray = new int[integerArray.length + 1];

        for (int i = 0; i < integerArray.length; i++) {
            
            newIntegerArray[i] = integerArray[i];
        }

        newIntegerArray[newIntegerArray.length - 1] = value;

        return newIntegerArray;
    }

    public int[] remove(int[] integerArray, int index){

        int[] newIntegerArray = new int[integerArray.length - 1];
        int aux = 0;

        for (int i = 0; i < integerArray.length; i++) {

            if(i != index){

                newIntegerArray[aux] = integerArray[i];
                aux++;
            } 
        }

        return newIntegerArray;
    }

    public void loop(int[] integerArray){

        String formatted_array = "";
        String slice_array = "";

        for (int i = 0; i < integerArray.length; i++) {
            
            slice_array = Integer.toString(integerArray[i]);
            formatted_array += slice_array;
        }

        System.out.println(formatted_array);
    }
}
