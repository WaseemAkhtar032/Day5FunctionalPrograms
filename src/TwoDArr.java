/*
2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.
 */
package TwoDArray;

import java.util.Scanner;

public class TwoDArr {
   static int row, col, i, j;
    static  int arr[][] = new int[10][10];

    public void print2DArray(){

        System.out.print("The 2D Array is :\n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter row for the array (max 10) : ");
        row = scan.nextInt();
        System.out.print("Enter column for the array (max 10) : ");
        col = scan.nextInt();
        System.out.println("Enter " + (row * col) + " Array Elements : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        TwoDArr p = new TwoDArr();
        p.print2DArray();


    }
}
