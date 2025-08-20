package arrays;

import java.util.Scanner;

public class Linearserach {
    public static void search(int array[], int key) {

        for (int i = 0; i < array.length; i++) {
             if (array[i] == key) {
                 if (array[i]!=key){
                     System.out.println("element dose not found enter valid element");
                 }
                 else
                System.out.println("your " + key + " element is at: " + array[i]);
            }

        }

    }
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("Your array is: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");

            }
            System.out.println();
            System.out.println("Enter the element you want to search: ");

            int key = scan.nextInt();
            search(array, key);

        }
    }
