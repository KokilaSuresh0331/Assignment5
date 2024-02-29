package assignment5;

import java.util.Scanner;

public class RightRotationOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rotate the elements of an Array to the Right Position:");
        
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter rotation count:");
        int rotateCount = sc.nextInt(); 
      
        rotateArray(a, rotateCount);
        
        System.out.println("Array after right rotation:");
        for (int num : a) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void rotateArray(int[] a, int rotateCount) {
        int length = a.length;
        int[] temp = new int[length];

       
        for (int i = 0; i < length; i++) {
            temp[(i + rotateCount) % length] = a[i];
        }

       
        for (int i = 0; i < length; i++) {
            a[i] = temp[i];
        }
    }
}
