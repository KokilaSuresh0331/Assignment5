package assignment5;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String args[]){  
		System.out.println("Matrix Multiplication:");
		Scanner sc=new Scanner(System.in);
		System.out.println("1st Matrix");
        System.out.print("Enter number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols];

        System.out.println("Enter Matrix Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }   
		    
        System.out.println("2nd Matrix");
        System.out.print("Enter number of Rows: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int cols1 = sc.nextInt();
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter Matrix Elements:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }   
		
        System.out.println("Before Multiplication Matrix values");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(matrix1[i][j]+" ");
                System.out.print(matrix2[i][j]+" ");
            }
        }  
        System.out.println("After Multiplication Matrix values");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(matrix1[i][j]*matrix2[i][j]+" ");
               
            }
        }  
	 
		
	sc.close();
	}
}
