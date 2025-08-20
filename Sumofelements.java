package arrays;

public class Sumofelements {
    public static int add(int array[]){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            sum+=array[i];
        }
        System.out.println();
        System.out.println("sum of your array is:"+sum);



        return sum;
    }


    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        System.out.println("you array is:");

        add(array);
    }

}
