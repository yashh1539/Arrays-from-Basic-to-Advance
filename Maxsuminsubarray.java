package arrays;

public class Maxsuminsubarray {
    public static void printsubarray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int start = i;
            int max=Integer.MIN_VALUE;
            for (int j = i; j < array.length; j++) {
                int end = j;
                int sum=0;

                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                    sum+=array[k];
                    if (sum>=max){
                        max=sum;
                    }


                }
                System.out.print("sum ="+sum);
                System.out.println();


            }

            System.out.println("maximum sum of sub array is :"+max);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        printsubarray(array);
    }
}
