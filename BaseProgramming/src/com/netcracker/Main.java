package com.netcracker;
import com.classes.Array;
import com.classes.Draw;
import com.classes.Factorial;
import com.classes.TwodArray;

import java.util.Arrays;

public class Main {

    public static void main(String... args) {
        System.out.println("Hi, world");

        /* --------------Sorting-------------- */
        int len = 20;
        Array newArr = new Array(len);
        int[] arr1 = {5,6,7,9,0,3,32,1,3,4,5,6,76,5,4,9,3,2,1,54};
        long startTime = System.nanoTime();
        Arrays.sort(arr1);
        long finishTime = System.nanoTime() - startTime;
        newArr.random(1, 10);
        long startBubbleTime = System.nanoTime();
        newArr.bubbleSort();
        long finishBubbleTime = System.nanoTime() - startBubbleTime;
        long startInsertTime = System.nanoTime();
        newArr.insertionSort();
        long finishInsertTime = System.nanoTime() - startInsertTime;

        System.out.println("SortTime: " + finishTime + " ms\nBubbleTime: " + finishBubbleTime
                + " ms \nInsertTime: " + finishInsertTime + " ms");
        /* --------------Factorial-------------- */
        int value = 25;
        Factorial factorial = new Factorial (value);
        long startSeqTime = System.nanoTime();
        int seq = factorial.sequentialFactorial(value);
        long finishSeqTime = System.nanoTime() - startSeqTime;
        long startRecTime = System.nanoTime();
        int rec = factorial.recursiveFactorial(value);
        long finishRecTime = System.nanoTime() - startRecTime;
        System.out.println("SequentialTime: " + finishSeqTime + " ms\nRecursiveTime: " + finishRecTime + " ms");
        System.out.println("Sequential Factorial of " + value + " = " + seq);
        System.out.println("Recursive Factorial of " + value + " = " + rec);
        /* --------------Pictures-------------- */
        Draw draw = new Draw('o');
        draw.createZ(3, 3);
        draw.createZ(7, 7);
        draw.createO(6, 6);
        /* --------------Arrays[]-------------- */
        /*---4.a---*/
        Array oddArr = new Array(50);
        oddArr.createOdd();
        oddArr.printAll();
        oddArr.printAllDown();
        /*---4.b---*/
        Array arr2 = new Array(20);
        arr2.random(1, 10);
        arr2.printAll();
        arr2.countEvenAndOdd();
        /*---4.c---*/
        Array arr3 = new Array(10);
        arr3.random(1, 100);
        arr3.printAll();
        arr3.changeEveryOddIndexTo0();
        arr3.printAll();
        /*---4.d---*/
        Array arr4 = new Array(15);
        arr4.random(-50, 102);
        arr4.printAll();
        arr4.findMaxAndMin();
        /*---4.e---*/
        Array arr5 = new Array(10);
        Array arr6 = new Array(10);
        arr5.random(0, 11);
        arr6.random(0, 11);
        arr5.printAll(); arr6.printAll();
        double ar5 = arr5.average();
        double ar6 = arr6.average();
        System.out.println("Average arr1: " + ar5 + "   Average arr1: " + ar6);
        if (ar5 > ar6)
            System.out.println("Average of the arr1 is bigger than Average of the arr2");
        else if (ar5 < ar6)
            System.out.println("Average of the arr2 is bigger than Average of the arr1");
        else
            System.out.println("Average of arrays are equal");
        /*---4.f---*/
        Array arr7 = new Array(20);
        arr7.random(-1, 3);
        arr7.printAll();
        arr7.findMaxMeetings();
        /* --------------Arrays[][]-------------- */
        /*---5.a---*/
        TwodArray tar1 = new TwodArray (8, 8);
        tar1.random(1, 99);
        tar1.print();
        tar1.getSumDiag();
        tar1.getMulDiag();
        /*---5.b---*/
        TwodArray tar2 = new TwodArray (5, 8);
        tar2.random(-99, 199);
        tar2.print();
        tar2.getMax();
        /*---5.c---*/
        TwodArray tar3 = new TwodArray (5, 8);
        tar3.random(-10, 21);
        tar3.print();
        tar3.getMaxRow();
        /*---5.d---*/
        TwodArray tar4 = new TwodArray (7, 10);
        tar4.random(0, 101);
        tar4.print();
        tar4.sortRow();
        tar4.print();
    }
}
