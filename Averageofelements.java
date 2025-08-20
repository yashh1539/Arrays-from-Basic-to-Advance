package arrays;

public class Averageofelements {

    public static int average(int array[]){
        float average=0;
        int sum=0;
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
            sum+=array[i];
            average=sum/ array.length;
        }
        System.out.println();
        System.out.println("sum of array elements is:"+sum);
        System.out.println("Average of array elements is :"+average);

        return 0;
    }


    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        System.out.println("array elements are :");
        average(array);

    }
}
