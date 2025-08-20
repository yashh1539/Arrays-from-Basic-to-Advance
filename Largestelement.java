package arrays;

public class Largestelement {
    public static  int largestnumber(int array[]){
        int big= Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>big)
                big=array[i];
        }
        System.out.println("largest element is:");
        System.out.println(big);
        return big;
    }


    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        System.out.println("your array is");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");

        }
        largestnumber(array);


    }
}
