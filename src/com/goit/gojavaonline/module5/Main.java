package com.goit.gojavaonline.module5;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] mas = new int[0];
        try {
            Finder finder = new Finder();
            int resultMax = finder.findMax(mas);
            int resultMin = finder.findMin(mas);
            MassivSort sort = new MassivSort();
            sort.massivSort(mas);

            System.out.println(resultMax);
            System.out.println(resultMin);
            System.out.println("");

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
        } catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Massiv is empty.");

            }

        }
    }

