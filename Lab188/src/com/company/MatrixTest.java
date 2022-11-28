package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    int[][] a;
    Matrix matrix;
    int length;
    int width;

    @Before
    public void setUp() throws Exception
    {
        a = new int[][]{{3,4,5,6},
                        {6,7,8,9},
                        {9,8,9,6},
                        {1,2,3,4}};
        length = 4;
        width = 4;
        matrix = new Matrix(a,length,width);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test1()
    {
        Assert.assertArrayEquals(a, matrix.Reorder());
    }
    @Test
    public void test2()
    {
        matrix=new Matrix(null,0,0);
        Assert.assertArrayEquals(null, matrix.Reorder());
    }
    @Test
    public void test3()
    {
        int mass[][]=matrix.array;
        matrix.Reorder();
        matrix.Reorder();
        Assert.assertArrayEquals(mass, matrix.array);
    }@Test
    public void test4()
    {
        matrix=new Matrix(new int[2][3],2,3);
        matrix.Reorder();
    }

}