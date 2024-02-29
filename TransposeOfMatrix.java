package assignment5;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String args[]){  
		Scanner sc=new Scanner(System.in);
		
        System.out.print("Enter number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter Matrix Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }   
		    
		 
		int transpose[][]=new int[3][3]; 
		   
		
		System.out.println("Printing Matrix Without Transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(matrix[i][j]+" ");    
		}    
		System.out.println();   
		}    
		
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		transpose[i][j]=matrix[j][i];  
		}    
		}     
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(transpose[i][j]+" ");    
		}    
		System.out.println();    
		}
		sc.close();
		}} 