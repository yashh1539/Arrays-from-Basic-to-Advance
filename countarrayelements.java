package arrays;

public class countarrayelements {


    public static  int count(int array[]){
        int counteven=0;
        int countodd=0;
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
           if (array[i]%2==0){
               counteven++;
           }
            if (array[i]%2!=0){
                countodd++;
            }
        }
        System.out.println();
        System.out.println(" Total even elements are: "+counteven);
        System.out.println(" Total odd elements are: "+countodd);
        return 0;

    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Your array is:");
        count(array);

    }
}
