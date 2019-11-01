package com.classes;

public class Factorial {
    private int value;

    public Factorial(int value) {
        this.value = value;
    }

    public int sequentialFactorial (int tmp) {
        int result = tmp;
        while(tmp > 1) {
            tmp--;
            result *= tmp;
        }
        return result;
    }

    public int recursiveFactorial(int tmp) {
        int result = 1;
        if (tmp == 1 || tmp == 0)
            return result;
        result = tmp * recursiveFactorial(tmp - 1);
        return result;
    }
}
