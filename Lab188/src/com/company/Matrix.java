package com.company;
public class Matrix {


    Matrix() {

    }

    public int[][] array;
    public int length;
    public int width;

    public Matrix(int[][] array, int length, int width) {
        this.array = array;
        this.length = length;
        this.width = width;
    }

    void swap(int fil, int fiw, int lil, int liw) {
        int temp = array[fil][fiw];
        array[fil][fiw] = array[lil][liw];
        array[lil][liw] = temp;
    }

    public int[][] Reorder() {
        if (length > 0 && length == width)
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    if ((i == j) || (i + j == width - 1))
                        array[i][j] = 0;
                    if ((i < j) && (j < width - 1 - i))
                        swap(i, j, width - 1 - i, j);
                    if ((i > j) && (i < width - 1 - j))
                        swap(i, j, i, width - 1 - j);

                }
            }
        return array;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
