package arrays;

public class Arraypairs {
    public static void printpair(int array[]){
        for (int i = 0; i < array.length ; i++) {
            int current=array[i];
            for (int j = i+1; j < array.length ; j++) {
                System.out.print("("+ current+","+array[j]+")");

            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        printpair(array);

    }
}
