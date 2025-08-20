package arrays;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER LENGTH OF ARRAY");
        int a = scan.nextInt();
        int arr[] = new int[a];

        System.out.println("ENTER ARRAY ELEMENTS");

        for (int i = 0; i < arr.length; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println("Your array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+""+"]");

        }
        System.out.println();




    }
}
