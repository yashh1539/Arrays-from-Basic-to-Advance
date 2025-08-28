package arrays;

import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER LENGTH OF ARRAY");
        int n= scan.nextInt();
        System.out.println("enter "+ n+ " elements");

        int elements[]= new int[n];
        for (int i = 0; i <n ; i++) {
            elements[i]= scan.nextInt();
        }
        Bubblesortalgo(elements);
        display(elements);
    }
    public static void Bubblesortalgo(int elements[]){
        int flag;
        int n = elements.length;
        for (int i = 0; i < n-1; i++) {
             flag=0;
            for (int j = 0; j <n-1-i ; j++) {
                if (elements[j]>elements[j+1]){
                    int temp=elements[j];
                    elements[j]=elements[j+1];
                    elements[j+1]=temp;

                    flag=1;
                }
            }
            if (flag==0){
                System.out.println("already sorted");
                break;
            }


        }

    }

    public static void display(int elements[]){
        int n = elements.length;
        System.out.println("Sorted elements are ");
        for (int i = 0; i <n ; i++) {
            System.out.print(elements[i]+" ");

        }
        System.out.println();
    }
}
