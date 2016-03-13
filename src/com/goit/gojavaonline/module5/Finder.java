package com.goit.gojavaonline.module5;


public class Finder {

  public static int findMax(int[] name){
      int max = name[0];
        for(int i = 1; i < name.length; i++){
            if(name[i] > max){
                max = name[i+1];
            }
        }
        return max;
    }

    public static int findMin(int[] name){
       int min = name[0];
        for(int i = 1; i < name.length; i++){
            if(name[i] < min){
                min = name[i];
            }
        }
        return min;
    }
}
