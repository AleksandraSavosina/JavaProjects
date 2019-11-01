package com.classes;

public class Draw {
    private char ch;
    private char space;

    public Draw(char ch) {
        this.ch = ch;
    }

    public Draw () {
        ch = '#';
        space = ' ';
    }

    public void createZ (int n, int m) {
        for(int i = 0; i < n; i++)
            System.out.print(ch);
        System.out.println();
        for(int i = 1; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    System.out.print(ch);
                else
                    System.out.print(space);
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++)
            System.out.print(ch);
        System.out.println();
    }

    public void createO (int n, int m) {
        for(int i = 0; i < n; i++)
            System.out.print(ch);
        System.out.println();
        for(int i = 1; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1)
                    System.out.print(ch);
                else
                    System.out.print(space);
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++)
            System.out.print(ch);
        System.out.println();
    }
}
