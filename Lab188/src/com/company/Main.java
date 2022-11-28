package com.company;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(  new int[][]{{3,4,5,6},
                {6,7,8,9},
                {9,8,9,6},
                {1,2,3,4}},4,4);
        a.print();
        System.out.println("");
        a.Reorder();
        a.print();
    }
}
