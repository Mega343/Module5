package com.goit.gojavaonline.module5;


public class MassivSort {


    public void massivSort(int[] name){

        boolean test = true;
        while(test) {
                test = false;
                for (int j = 0; j < name.length - 1; j++) {
                    if (name[j] > name[j + 1]) {
                        int tmp = name[j];
                        name[j] = name[j + 1];
                        name[j + 1] = tmp;
                        test = true;
                    }
                }
        }
    }
}
