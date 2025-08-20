package arrays;

public class secondlargest {
     public static int secondlargest(int array[]){
         int largest= Integer.MIN_VALUE;
         int Slargest= 0;
         for (int i = 0; i < array.length; i++) {
             if (array[i] > largest) {
                 largest = array[i];
                 for (int j = 0; j < largest; j++) {
                     if (array[j]<largest)
                         Slargest=array[j];
                 }
             }
             }

         System.out.println("Your first largest element is: "+largest);
         System.out.println("Your Second largest element is: "+Slargest);


         return largest;

     }
     public static int display(int array[]){
         System.out.println("your array is: ");
         for (int i=0; i< array.length;i++){
             System.out.print(array[i]+" ");
         }
         return 0;
     }

    public static void main(String[] args) {
        int array[]= {1,2,3,4,5};
        display(array);
        System.out.println();
        secondlargest(array);

    }

}
