package com.company;

import java.util.Arrays;

public class MyArrayList {
    final private int START_ARR_SIZE = 10;
    private int currentArraySize;
    private int elemsInArray;
    private int[] list;
    MyArrayList() {
        list = new int[START_ARR_SIZE];
        currentArraySize = START_ARR_SIZE;
        elemsInArray = 0;

    }
    public void add(int value) {
        if (elemsInArray == currentArraySize) {
            int[] listToCopy = list;

            list = new int[currentArraySize *= 2];
            for (int i = 0; i < listToCopy.length; ++i)
                list[i] = listToCopy[i];
        }

        list[elemsInArray] = value;
        elemsInArray++;
    }

    public int get(int index) {
        if (index >= elemsInArray)
            throw new IllegalArgumentException();
        return list[index];
    }

    public void set(int index, int value) {
        if (index >= elemsInArray)
            throw new IllegalArgumentException();
        list[index] = value;
    }

    public int getSize() {
        return elemsInArray;
    }

    public void remove(int index) {
        for (int i = index + 1; i < elemsInArray; ++i) {
            list[i - 1] = list[i];
        }
        elemsInArray--;
    }
    public String toString() {
        int[] listToPrint = new int[elemsInArray];
        for (int i = 0; i < elemsInArray; ++i)
            listToPrint[i] = list[i];
        return Arrays.toString(listToPrint);
    }
}
