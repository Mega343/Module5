package com.goit.gojavaonline.module5;


public class Finder {

  public static int findMax(int[] name){
      int max = name[0];
        for(int i = 0; i < name.length; i++){
           max = Math.max(max,name [i]);
            }
        return max;
    }

    public static int findMin(int[] name){
       int min = name[0];
        for(int i = 0; i < name.length; i++){
            min = Math.min(min,name[i]);
            }
        return min;
    }
}
