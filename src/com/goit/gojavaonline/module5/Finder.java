package com.goit.gojavaonline.module5;


public class Finder {

    public static int findMax(int[] name) throws ArrayIndexOutOfBoundsException {
        int max = name[0];
        for (int i = 1; i < name.length; i++) {
            max = Math.max(max, name[i]);
        }
        return max;
    }

    public static int findMin(int[] name) throws ArrayIndexOutOfBoundsException {
        int min = name[0];
        for (int i = 1; i < name.length; i++) {
            min = Math.min(min, name[i]);
        }
        return min;
    }
}
