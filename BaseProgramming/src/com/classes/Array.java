package com.classes;

public class Array {
    private int[] list;
    private int length;

    public Array(int _length) {
        list = new int[_length];
        length = _length;
    }

    public int[] getList() {
        return list;
    }

    public int getValue(int i) {
        return list[i];
    }

    public int getLength() {
        return length;
    }

    public void printAll() {
        System.out.print("Your array up");
        for(int i = 0; i < length; i++) {
            System.out.print(": " + list[i] + " ");
        }
        System.out.println();
    }
    public void printAllDown() {
        System.out.print("Your array down");
        for(int i = length - 1; i > -1; i--) {
            System.out.print(": " + list[i] + " ");
        }
        System.out.println();
    }

    public int[] random (int a, int b) {
        for (int i = 0; i < length; i++) {
            list[i] = a + (int)(Math.random() * b);
        }
        return list;
    }

    public int[] randomOdd(int a, int b) {
        for (int i = 0; i < length; i ++) {
            list[i] = (a + 1) + (int) (Math.random() * b);
            if (list[i] % 2 != 0)
                list[i]--;
        }
        return list;
    }

    public int[] createOdd() {
        for (int i = 0; i < length; i ++) {
            list[i] = 2 * i + 1;
        }
        return list;
    }

    public void countEvenAndOdd() {
        int tmp = 0; // only for even numbers
        for (int i: list)
            if (i % 2 == 0)
                tmp++;
        System.out.println("Even numbers: " + tmp + "\nOdd numbers: " + (length - tmp) + "\n");
    }

    public int[] changeEveryOddIndexTo0() {
        for (int i = 0; i < length - 1; i += 2)
            list[i] = 0;
        return list;
    }
    public void findMaxAndMin () {
        int max = list[0];
        int min = list[0];
        int indexMin = 0;
        int indexMax = 0;
        for(int i = 1; i < length; i++) {
            if (list[i] <= min) {
                min = list[i];
                indexMin = i;
            } else if(list[i] >= max) {
                max = list[i];
                indexMax = i;
            }
        }
        System.out.println("Max in position [" + indexMax + "]: " + max
                + " . Min in position [" + indexMin + "]: " + min + "\n");
    }

    public double average () {
        double sum = 0;
        for (int i: list)
            sum += i;
        return sum / length;
    }

    public int[] bubbleSort() {
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (list[j] > list[j + 1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
        return list;
    }

    public int[] insertionSort() {
        int j = 0;
        int tmp;
        for (int i = 1; i < length; ++i) {
            tmp = list[i];
            j = i - 1;

            while (j >= 0 && tmp < list[j]) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = tmp;
        }
        return list;
    }

    public void findMaxMeetings() {
        int meet0 = 0;
        int meet1 = 0;
        int meet11 = 0;
        for (int i: list) {
            if (i == 0)
                meet0++;
            else if (i == 1)
                meet1++;
            else
                meet11++;
        }

        if (meet0 != meet1 && meet0 != meet11 && meet11 != meet1) {
            if (meet0 > meet1 && meet0 > meet11)
                System.out.println("Meeting '0' " + meet0 + " times");
            else if (meet1 > meet0 && meet1 > meet11)
                System.out.println("Meeting '1' " + meet1 + " times");
            else if (meet11 > meet0 && meet11 > meet1)
                System.out.println("Meeting '-1' " + meet11 + " times");
        }
            else if (meet0 == meet1 && meet0 > meet11)
                System.out.println("Meeting '1' and '0' " + meet0 + " times");
            else if (meet0 == meet11 && meet0 > meet1)
                System.out.println("Meeting '-1' and '0' " + meet0 + " times");
            else if (meet11 == meet1 && meet1 > meet0)
                System.out.println("Meeting '1' and '-1' " + meet1 + " times");
            else
                System.out.println("Meeting '0', '1' and '-1' " + meet0 + " times");


    }

}
