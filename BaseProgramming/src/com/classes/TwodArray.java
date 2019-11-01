package com.classes;

public class TwodArray {
    private int[][] list;
    private int width;
    private int height;

    public TwodArray(int[][] list) {
        this.list = list;
    }

    public TwodArray(int width, int height) {
        this.list = new int[height][width];
        this.width = width;
        this.height = height;
    }

    public int[][] random (int a, int b) {
        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                list[i][j] = a + (int) (Math.random() * b);

        return list;
    }

    public void print() {
        System.out.println("2D Array: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                System.out.print(list[i][j] + " ");
            System.out.println();
        }
    }
    public void getSumDiag() {
        int mainD = 0;
        int sideD = 0;
        int j;
        for (int i = 0; i < height; i++) {
            for (j = 0; j < width; j++)
                if (i == j)
                    mainD += list[i][j];
            sideD += list[i][width - j];
        }
        System.out.println("Sum MainDiag: " + mainD + " . Sum SideDiag: " + sideD);
    }

    public void getMulDiag() {
        int mainD = 1;
        int sideD = 1;
        int j;
        for (int i = 0; i < height; i++) {
            for (j = 0; j < width; j++)
                if (i == j)
                    mainD *= list[i][j];
            sideD *= list[i][width - j];
        }
        System.out.println("Multiplication MainDiag: " + mainD + " . Multiplication SideDiag: " + sideD);
    }

    public void getMaxRow() {
        int[] row = new int [height];
        for (int i = 0; i < height; i++)
            row[i] = 1;

        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
               row[i] *= list[i][j];

        int max = row[0];


        for (int i = 0; i < height; i++)
            if (max < Math.abs(row[i]))
                max = row[i];

        for (int i = 0; i < height; i++)
            if (max == row[i])
                System.out.println("Index of row with max: [" + i + "]");

        System.out.println("MaxRow: " + max);
    }

    public void getMax() {
        int max = list[0][0];
        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                if (max < list[i][j])
                    max = list[i][j];

        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                if(max == list[i][j])
                    System.out.println("Index of row with max: [" + i + ", " + j + "]");

        System.out.println("MaxElement: " + max);
    }

    public int[][] sortRow() {
        int tmp;
        for(int i = 0; i < height; i++)
            for(int j = 1; j < width; j++) {
                int k = 0;
                tmp = list[i][j];
                k = j - 1;

                while (k >= 0 && tmp < list[i][k]) {
                    list[i][k + 1] = list[i][k];
                    k = k - 1;
                }
                list[i][k + 1] = tmp;
            }

        return list;
    }
}