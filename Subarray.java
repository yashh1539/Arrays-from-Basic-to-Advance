package arrays;

public class Subarray {
    public static void printsubarray(int array[]){
        int totalsubarray=0;

        for (int i = 0; i < array.length ; i++) {
            int start=i;

            for (int j = i; j < array.length; j++) {
                  int end=j;
                int sum=0;
                for (int k = start; k <=end ; k++) {
                    System.out.print(array[k]+" ");
                    sum+=array[k];


                }
                totalsubarray++;
                System.out.print("Sum = "+sum);
                System.out.println();

            }
            System.out.println();

            System.out.println("total subarray are :"+totalsubarray);


        }
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        printsubarray(array);
    }
}
